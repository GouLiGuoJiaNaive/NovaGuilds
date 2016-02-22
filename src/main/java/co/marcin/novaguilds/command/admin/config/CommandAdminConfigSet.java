/*
 *     NovaGuilds - Bukkit plugin
 *     Copyright (C) 2016 Marcin (CTRL) Wieczorek
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package co.marcin.novaguilds.command.admin.config;

import co.marcin.novaguilds.command.abstractexecutor.AbstractCommandExecutor;
import co.marcin.novaguilds.enums.Command;
import co.marcin.novaguilds.enums.Config;
import co.marcin.novaguilds.enums.Message;
import co.marcin.novaguilds.enums.VarKey;
import co.marcin.novaguilds.util.NumberUtils;
import co.marcin.novaguilds.util.StringUtils;
import org.bukkit.command.CommandSender;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CommandAdminConfigSet extends AbstractCommandExecutor {
	private static final Command command = Command.ADMIN_CONFIG_SET;

	public CommandAdminConfigSet() {
		super(command);
	}

	@Override
	public void execute(CommandSender sender, String[] args) {
		Config config = Config.fromPath(args[0]);

		if(config == null) {
			Message.CHAT_INVALIDPARAM.send(sender);
			return;
		}

		String valueString = StringUtils.join(StringUtils.parseArgs(args, 1), " ");
		Object value = valueString;

		if(valueString.toLowerCase().equals("true")) {
			value = true;
		}
		else if(valueString.toLowerCase().equals("false")) {
			value = false;
		}
		else if(NumberUtils.isNumeric(valueString)) {
			value = Integer.parseInt(valueString);
		}
		else if(valueString.startsWith("{") && valueString.endsWith("}")) {
			valueString = valueString.substring(1);
			valueString = valueString.substring(0, valueString.length() - 1);

			String[] split = { valueString };
			if(org.apache.commons.lang.StringUtils.contains(valueString, ";")) {
				split = org.apache.commons.lang.StringUtils.split(valueString, ";");
			}

			value  = new ArrayList<>(Arrays.asList(split));
		}

		plugin.getConfigManager().set(config, value);

		Map<VarKey, String> vars = new HashMap<>();
		vars.put(VarKey.KEY, config.name());
		vars.put(VarKey.VALUE, valueString);
		Message.CHAT_ADMIN_CONFIG_SET.vars(vars).send(sender);
	}
}
