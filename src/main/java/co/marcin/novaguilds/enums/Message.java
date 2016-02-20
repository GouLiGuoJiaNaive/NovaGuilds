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

package co.marcin.novaguilds.enums;


import co.marcin.novaguilds.api.basic.NovaGuild;
import co.marcin.novaguilds.api.basic.NovaPlayer;
import co.marcin.novaguilds.manager.MessageManager;
import co.marcin.novaguilds.util.ItemStackUtils;
import org.apache.commons.lang.StringUtils;
import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Message {
	CHAT_PREFIX,
	CHAT_NOPERMISSIONS,
	CHAT_UNKNOWNCMD,
	CHAT_INVALIDPARAM,
	CHAT_CMDFROMCONSOLE,
	CHAT_ENTERINTEGER,
	CHAT_DELAYEDTELEPORT,
	CHAT_DELAYEDTPMOVED,
	CHAT_ERROROCCURED,
	CHAT_UPDATE,

	CHAT_BASIC_NEGATIVENUMBER,
	CHAT_BASIC_ON,
	CHAT_BASIC_OFF,
	CHAT_BASIC_COORDS3D,

	CHAT_CONFIRM_NULLHANDLER,
	CHAT_CONFIRM_NEEDCONFIRM,
	CHAT_CONFIRM_TIMEOUT,

	CHAT_ADMIN_CONFIG_RELOADED,
	CHAT_ADMIN_CONFIG_RESET,
	CHAT_ADMIN_CONFIG_SAVED,
	CHAT_ADMIN_CONFIG_SET,
	CHAT_ADMIN_CONFIG_GET_SINGLE,
	CHAT_ADMIN_CONFIG_GET_LIST_SECTION(MessageFlag.NOPREFIX),
	CHAT_ADMIN_CONFIG_GET_LIST_KEY(MessageFlag.NOPREFIX),

	CHAT_ADMIN_GUILD_TIMEREST_SET,
	CHAT_ADMIN_GUILD_LIST_HEADER,
	CHAT_ADMIN_GUILD_LIST_PAGE_HASNEXT,
	CHAT_ADMIN_GUILD_LIST_PAGE_NONEXT,
	CHAT_ADMIN_GUILD_LIST_ITEM,

	CHAT_ADMIN_GUILD_INACTIVE_UPDATED,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_HEADER,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_ITEM,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_AGO,
	CHAT_ADMIN_GUILD_INACTIVE_LIST_NOW,

	CHAT_ADMIN_GUILD_BANK_PAID,
	CHAT_ADMIN_GUILD_BANK_WITHDREW,

	CHAT_ADMIN_GUILD_KICK_LEADER,
	CHAT_ADMIN_GUILD_INVITED,
	CHAT_ADMIN_GUILD_TELEPORTED_SELF,
	CHAT_ADMIN_GUILD_TELEPORTED_OTHER,

	CHAT_ADMIN_GUILD_SET_TAG,
	CHAT_ADMIN_GUILD_SET_POINTS,
	CHAT_ADMIN_GUILD_SET_LIVES,
	CHAT_ADMIN_GUILD_SET_SLOTS_SUCCESS,
	CHAT_ADMIN_GUILD_SET_SLOTS_SMALLERTHANPLAYERS,
	CHAT_ADMIN_GUILD_SET_NAME_ENTERNEWNAME,
	CHAT_ADMIN_GUILD_SET_NAME_SUCCESS,
	CHAT_ADMIN_GUILD_SET_LEADER_NOTINGUILD,
	CHAT_ADMIN_GUILD_SET_LEADER_ALREADYLEADER,
	CHAT_ADMIN_GUILD_SET_LEADER_SUCCESS,
	CHAT_ADMIN_GUILD_RESET_POINTS_INVALIDCONDITIONTYPE,
	CHAT_ADMIN_GUILD_RESET_POINTS_NOVALUE,
	CHAT_ADMIN_GUILD_RESET_POINTS_SUCCESS,

	CHAT_ADMIN_REGION_BYPASS_TOGGLED_SELF,
	CHAT_ADMIN_REGION_BYPASS_TOGGLED_OTHER,
	CHAT_ADMIN_REGION_BYPASS_NOTIFYOTHER,

	CHAT_ADMIN_REGION_DELETE_SUCCESS,

	CHAT_ADMIN_REGION_TELEPORT_SELF,
	CHAT_ADMIN_REGION_TELEPORT_OTHER,
	CHAT_ADMIN_REGION_TELEPORT_NOTIFYOTHER,

	CHAT_ADMIN_SAVE_PLAYERS,
	CHAT_ADMIN_SAVE_GUILDS,
	CHAT_ADMIN_SAVE_REGIONS,
	CHAT_ADMIN_SAVE_RANKS,
	CHAT_ADMIN_SAVE_ALL,
	CHAT_ADMIN_SAVE_AUTOSAVE,

	CHAT_ADMIN_SPYMODE_NOTIFY,
	CHAT_ADMIN_SPYMODE_SUCCESS_SELF,
	CHAT_ADMIN_SPYMODE_SUCCESS_OTHER,

	CHAT_ADMIN_HOLOGRAM_TELEPORT_SELF,
	CHAT_ADMIN_HOLOGRAM_TELEPORT_OTHER,
	CHAT_ADMIN_HOLOGRAM_NOTFOUND,
	CHAT_ADMIN_HOLOGRAM_ADD_SUCCESS,
	CHAT_ADMIN_HOLOGRAM_DELETE_SUCCESS,
	CHAT_ADMIN_HOLOGRAM_LIST_HEADER,
	CHAT_ADMIN_HOLOGRAM_LIST_ITEM,

	CHAT_RELOAD_RELOADING,
	CHAT_RELOAD_CONFIG,
	CHAT_RELOAD_MESSAGES,
	CHAT_RELOAD_MYSQL,
	CHAT_RELOAD_PLAYERS,
	CHAT_RELOAD_GUILDS,
	CHAT_RELOAD_REGIONS,
	CHAT_RELOAD_NEWMSGFILE,
	CHAT_RELOAD_GROUPS,
	CHAT_RELOAD_RANKS,
	CHAT_RELOAD_RELOADED,

	CHAT_PVP_TEAM,
	CHAT_PVP_ALLY,

	CHAT_RAID_RESTING,
	CHAT_RAID_PROTECTION,

	CHAT_GUILD_COMPASSTARGET_ON,
	CHAT_GUILD_COMPASSTARGET_OFF,
	CHAT_GUILD_NOGUILDS,
	CHAT_GUILD_OPENINVITATION,
	CHAT_GUILD_FPVPTOGGLED,
	CHAT_GUILD_EFFECT_SUCCESS,

	CHAT_GUILD_ALLY_WAR,
	CHAT_GUILD_ALLY_SAMENAME,
	CHAT_GUILD_ALLY_INVITED,
	CHAT_GUILD_ALLY_ACCEPTED,
	CHAT_GUILD_ALLY_NOTIFYGUILD,
	CHAT_GUILD_ALLY_NOTIFYGUILDCANCELED,
	CHAT_GUILD_ALLY_CANCELED,
	CHAT_GUILD_ALLY_LIST_NOALLIES,
	CHAT_GUILD_ALLY_LIST_HEADER_ALLIES,
	CHAT_GUILD_ALLY_LIST_HEADER_INVITATIONS,
	CHAT_GUILD_ALLY_LIST_ITEM,
	CHAT_GUILD_ALLY_LIST_SEPARATOR,

	CHAT_GUILD_COULDNOTFIND,
	CHAT_GUILD_HASNOREGION,
	CHAT_GUILD_ENTERNAME,
	CHAT_GUILD_ENTERTAG,
	CHAT_GUILD_NOTINGUILD,
	CHAT_GUILD_ABANDONED,
	CHAT_GUILD_NOTLEADER,
	CHAT_GUILD_NOGUILDPERM,
	CHAT_GUILD_SETHOME_SUCCESS,
	CHAT_GUILD_SETHOME_OUTSIDEREGION,
	CHAT_GUILD_SETHOME_OVERLAPS,
	CHAT_GUILD_SET_NAME,
	CHAT_GUILD_SET_TAG,
	CHAT_GUILD_HOME,
	CHAT_GUILD_HASREGIONALREADY,
	CHAT_GUILD_JOINED,
	CHAT_GUILD_EXPLOSIONATREGION,
	CHAT_GUILD_KICKYOURSELF,
	CHAT_GUILD_TOOCLOSE,
	CHAT_GUILD_NAMENOTEXIST,
	CHAT_GUILD_NOTENOUGHMONEY,
	CHAT_GUILD_ISFULL,

	CHAT_GUILD_LEADER_SUCCESS,
	CHAT_GUILD_LEADER_SAMENICK,
	CHAT_GUILD_LEADER_NOTSAMEGUILD,

	CHAT_GUILD_LEAVE_ISLEADER,
	CHAT_GUILD_LEAVE_LEFT,

	CHAT_GUILD_BANK_ENTERAMOUNT,
	CHAT_GUILD_BANK_PAY_PAID,
	CHAT_GUILD_BANK_PAY_NOTENOUGH,
	CHAT_GUILD_BANK_WITHDRAW_SUCCESS,
	CHAT_GUILD_BANK_WITHDRAW_NOTENOUGH,

	CHAT_GUILD_WAR_ALLY,
	CHAT_GUILD_WAR_YOURGUILDWAR,
	CHAT_GUILD_WAR_NOWARINV_SUCCESS,
	CHAT_GUILD_WAR_NOWARINV_NOTIFY,
	CHAT_GUILD_WAR_LIST_NOWARS,
	CHAT_GUILD_WAR_LIST_WARSHEADER,
	CHAT_GUILD_WAR_LIST_NOWARINVHEADER,
	CHAT_GUILD_WAR_LIST_ITEM,
	CHAT_GUILD_WAR_LIST_SEPARATOR,

	CHAT_GUILD_BUYLIFE,
	CHAT_GUILD_BUY_SLOT_SUCCESS,
	CHAT_GUILD_BUY_SLOT_MAXREACHED,

	CHAT_GUILD_VAULT_OUTSIDEREGION(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_PLACE_SUCCESS(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_DROP(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_PLACE_EXISTS(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_PLACE_DOUBLECHEST(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_BREAK_NOTEMPTY(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_BREAK_SUCCESS(MessageFlag.TITLE),
	CHAT_GUILD_VAULT_DENYRELATIVE(MessageFlag.TITLE),

	CHAT_GUILD_CHATMODE_SUCCESS,
	CHAT_GUILD_CHATMODE_INVALID,
	CHAT_GUILD_CHATMODE_NAMES_NORMAL,
	CHAT_GUILD_CHATMODE_NAMES_GUILD,
	CHAT_GUILD_CHATMODE_NAMES_ALLY,

	CHAT_PLAYER_ENTERNAME,
	CHAT_PLAYER_NOTEXISTS,
	CHAT_PLAYER_NOTONLINE,
	CHAT_PLAYER_HASGUILD,
	CHAT_PLAYER_HASNOGUILD,
	CHAT_PLAYER_ALREADYINVITED,
	CHAT_PLAYER_NOTINYOURGUILD,
	CHAT_PLAYER_PVPMONEY_KILL,
	CHAT_PLAYER_PVPMONEY_REVENGE,
	CHAT_PLAYER_INVITE_INVITED,
	CHAT_PLAYER_INVITE_LIST_HEADER,
	CHAT_PLAYER_INVITE_LIST_ITEM,
	CHAT_PLAYER_INVITE_LIST_SEPARATOR,
	CHAT_PLAYER_INVITE_LIST_NOTHING,
	CHAT_PLAYER_INVITE_NOTINVITED,
	CHAT_PLAYER_INVITE_NOTIFY,
	CHAT_PLAYER_INVITE_CANCEL_SUCCESS,
	CHAT_PLAYER_INVITE_CANCEL_NOTIFY,
	CHAT_PLAYER_INFO_HEADER,
	CHAT_PLAYER_INFO_ITEMS,
	CHAT_PLAYER_INFO_GUILDROW,

	CHAT_REGION_RESIZE_START,
	CHAT_REGION_RESIZE_SUCCESS,
	CHAT_REGION_DENY_INTERACT,
	CHAT_REGION_DENY_RIDEMOB,
	CHAT_REGION_DENY_ATTACKMOB,
	CHAT_REGION_DENY_UNLEASH,
	CHAT_REGION_DENY_LEASH,
	CHAT_REGION_NOREGIONHERE,
	CHAT_REGION_REGIONHERE,
	CHAT_REGION_VALIDATION_TOOSMALL,
	CHAT_REGION_VALIDATION_TOOBIG,
	CHAT_REGION_VALIDATION_TOOCLOSE,
	CHAT_REGION_VALIDATION_OVERLAPS,
	CHAT_REGION_VALIDATION_NOTSELECTED,
	CHAT_REGION_VALIDATION_NOTVALID,
	CHAT_REGION_VALIDATION_VALID,
	CHAT_REGION_SIZE,
	CHAT_REGION_PRICE,
	CHAT_REGION_CNOTAFFORD,
	CHAT_REGION_CREATED,
	CHAT_REGION_MUSTVEGUILD,
	CHAT_REGION_ENTERED(MessageFlag.TITLE),
	CHAT_REGION_EXITED(MessageFlag.TITLE),
	CHAT_REGION_NOTIFYGUILD_ENTERED,
	CHAT_REGION_BELONGSTO,
	CHAT_REGION_LIST_HEADER,
	CHAT_REGION_LIST_ITEM,
	CHAT_REGION_TOOL_TOGGLEDMODE,
	CHAT_REGION_TOOL_MODES_CHECK,
	CHAT_REGION_TOOL_MODES_SELECT,
	CHAT_REGION_BLOCKEDCMD,
	CHAT_REGION_DELETED,

	CHAT_USAGE_NGA_CONFIG_ACCESS(MessageFlag.NOPREFIX),
	CHAT_USAGE_NGA_CONFIG_GET,
	CHAT_USAGE_NGA_CONFIG_RELOAD,
	CHAT_USAGE_NGA_CONFIG_RESET,
	CHAT_USAGE_NGA_CONFIG_SAVE,
	CHAT_USAGE_NGA_CONFIG_SET,

	CHAT_USAGE_NGA_GUILD_SET_POINTS,
	CHAT_USAGE_NGA_GUILD_SET_LIVES,
	CHAT_USAGE_NGA_GUILD_SET_SLOTS,
	CHAT_USAGE_NGA_GUILD_ABANDON,
	CHAT_USAGE_NGA_GUILD_BANK_PAY,
	CHAT_USAGE_NGA_GUILD_BANK_WITHDRAW,
	CHAT_USAGE_NGA_GUILD_PURGE,
	CHAT_USAGE_NGA_GUILD_TP,
	CHAT_USAGE_NGA_GUILD_RESET_POINTS,

	CHAT_USAGE_NGA_REGION_ACCESS,
	CHAT_USAGE_NGA_REGION_BYPASS,
	CHAT_USAGE_NGA_REGION_DELETE,
	CHAT_USAGE_NGA_REGION_LIST,
	CHAT_USAGE_NGA_REGION_TELEPORT,

	CHAT_USAGE_GUILD_ABANDON,
	CHAT_USAGE_GUILD_ALLY,
	CHAT_USAGE_GUILD_BANK_PAY,
	CHAT_USAGE_GUILD_BANK_WITHDRAW,
	CHAT_USAGE_GUILD_BUY_SLOT,
	CHAT_USAGE_GUILD_BUY_LIFE,
	CHAT_USAGE_GUILD_COMPASS,
	CHAT_USAGE_GUILD_CHATMODE,
	CHAT_USAGE_GUILD_CREATE,
	CHAT_USAGE_GUILD_EFFECT,
	CHAT_USAGE_GUILD_HOME_SET,
	CHAT_USAGE_GUILD_HOME_TELEPORT,
	CHAT_USAGE_GUILD_INFO,
	CHAT_USAGE_GUILD_INVITE,
	CHAT_USAGE_GUILD_JOIN,
	CHAT_USAGE_GUILD_KICK,
	CHAT_USAGE_GUILD_LEADER,
	CHAT_USAGE_GUILD_LEAVE,
	CHAT_USAGE_GUILD_MENU,
	CHAT_USAGE_GUILD_OPENINVITATION,
	CHAT_USAGE_GUILD_PVPTOGGLE,
	CHAT_USAGE_GUILD_REQUIREDITEMS,
	CHAT_USAGE_GUILD_SET_NAME,
	CHAT_USAGE_GUILD_SET_TAG,
	CHAT_USAGE_GUILD_TOP,
	CHAT_USAGE_GUILD_WAR,

	CHAT_USAGE_REGION_DELETE,
	CHAT_USAGE_REGION_BUY,
	CHAT_USAGE_REGION_ACCESS,

	CHAT_USAGE_TOOL,

	CHAT_COMMANDS_ADMIN_MAIN_HEADER,
	CHAT_COMMANDS_ADMIN_MAIN_ITEMS(MessageFlag.LIST),
	CHAT_COMMANDS_ADMIN_REGION_HEADER,
	CHAT_COMMANDS_ADMIN_REGION_ITEMS(MessageFlag.LIST),
	CHAT_COMMANDS_ADMIN_GUILD_HEADER,
	CHAT_COMMANDS_ADMIN_GUILD_ITEMS(MessageFlag.LIST),
	CHAT_COMMANDS_ADMIN_HOLOGRAM_HEADER,
	CHAT_COMMANDS_ADMIN_HOLOGRAM_DISABLED,
	CHAT_COMMANDS_ADMIN_HOLOGRAM_ITEMS(MessageFlag.LIST),
	CHAT_COMMANDS_GUILD_HASGUILD(MessageFlag.LIST),
	CHAT_COMMANDS_GUILD_NOGUILD(MessageFlag.LIST),
	CHAT_COMMANDS_REGION_HEADER,
	CHAT_COMMANDS_REGION_ITEMS(MessageFlag.LIST),

	CHAT_CREATEGUILD_NOTENOUGHMONEY,
	CHAT_CREATEGUILD_ITEMLIST,
	CHAT_CREATEGUILD_ITEMLISTSEP,
	CHAT_CREATEGUILD_NOITEMS,
	CHAT_CREATEGUILD_TAGEXISTS,
	CHAT_CREATEGUILD_NAMEEXISTS,
	CHAT_CREATEGUILD_HASGUILD,
	CHAT_CREATEGUILD_SUCCESS,
	CHAT_CREATEGUILD_REGIONHERE,
	CHAT_CREATEGUILD_TOOCLOSESPAWN,
	CHAT_CREATEGUILD_NOTALLOWEDSTRING,
	CHAT_CREATEGUILD_TAG_TOOSHORT,
	CHAT_CREATEGUILD_TAG_TOOLONG,
	CHAT_CREATEGUILD_NAME_TOOSHORT,
	CHAT_CREATEGUILD_NAME_TOOLONG,
	CHAT_CREATEGUILD_DISABLEDWORLD,

	CHAT_GUILDINFO_PLAYERSEPARATOR,
	CHAT_GUILDINFO_LEADERPREFIX,
	CHAT_GUILDINFO_PLAYERCOLOR_ONLINE,
	CHAT_GUILDINFO_PLAYERCOLOR_OFFLINE,
	CHAT_GUILDINFO_ALLY,
	CHAT_GUILDINFO_WAR,
	CHAT_GUILDINFO_FULLINFO,
	CHAT_GUILDINFO_INFO,

	BROADCAST_ADMIN_GUILD_ABANDON,
	BROADCAST_ADMIN_GUILD_CLEANUP,

	BROADCAST_GUILD_WAR,
	BROADCAST_GUILD_NOWAR,
	BROADCAST_GUILD_JOINED,
	BROADCAST_GUILD_LEFT,
	BROADCAST_GUILD_CREATED,
	BROADCAST_GUILD_ABANDONED,
	BROADCAST_GUILD_SETLEADER,
	BROADCAST_GUILD_ALLIED,
	BROADCAST_GUILD_ENDALLY,
	BROADCAST_GUILD_KICKED,
	BROADCAST_GUILD_NEWLEADER,
	BROADCAST_GUILD_DESTROYED,

	BROADCAST_GUILD_RAID_FINISHED_ATTACKERWON,
	BROADCAST_GUILD_RAID_FINISHED_DEFENDERWON,

	BROADCAST_PVP_KILLED,

	HOLOGRAPHICDISPLAYS_TOPGUILDS_TOPROWS,
	HOLOGRAPHICDISPLAYS_TOPGUILDS_HEADER,
	HOLOGRAPHICDISPLAYS_TOPGUILDS_ROW(MessageFlag.NOPREFIX),

	BARAPI_WARPROGRESS,

	INVENTORY_REQUIREDITEMS_NAME,
	INVENTORY_GGUI_NAME,

	INVENTORY_GUI_BACK,
	INVENTORY_GUI_PLAYERSLIST_ICONITEM,
	INVENTORY_GUI_PLAYERSLIST_ROWITEM,
	INVENTORY_GUI_PLAYERSLIST_TITLE,
	INVENTORY_GUI_PLAYERSETTINGS_TITLE,
	INVENTORY_GUI_PLAYERSETTINGS_ITEM_RANK,
	INVENTORY_GUI_PLAYERSETTINGS_ITEM_KICK,
	INVENTORY_GUI_RANKS_TITLE,
	INVENTORY_GUI_RANKS_ICONITEM,
	INVENTORY_GUI_RANKS_ROWITEM,
	INVENTORY_GUI_RANKS_ADDITEM,
	INVENTORY_GUI_RANKS_DEFAULTNAME,
	INVENTORY_GUI_RANKS_LEADERNAME,
	INVENTORY_GUI_RANK_SETTINGS_CLONEPREFIX,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_EDITPERMISSIONS,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_SETDEFAULT,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_CLONE,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_RENAME,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_DELETE,
	INVENTORY_GUI_RANK_SETTINGS_ITEM_MEMBERLIST,
	INVENTORY_GUI_PERMISSIONS_TITLE,
	INVENTORY_GUI_PERMISSIONS_ITEM_ENABLED,
	INVENTORY_GUI_PERMISSIONS_ITEM_DISABLED,

	INVENTORY_GUI_PERMISSIONS_NAMES_BLOCK_BREAK,
	INVENTORY_GUI_PERMISSIONS_NAMES_BLOCK_PLACE,
	INVENTORY_GUI_PERMISSIONS_NAMES_MOB_ATTACK,
	INVENTORY_GUI_PERMISSIONS_NAMES_MOB_RIDE,
	INVENTORY_GUI_PERMISSIONS_NAMES_MOB_LEASH,
	INVENTORY_GUI_PERMISSIONS_NAMES_INTERACT,
	INVENTORY_GUI_PERMISSIONS_NAMES_ABANDON,
	INVENTORY_GUI_PERMISSIONS_NAMES_KICK,
	INVENTORY_GUI_PERMISSIONS_NAMES_EFFECT,
	INVENTORY_GUI_PERMISSIONS_NAMES_INVITE,
	INVENTORY_GUI_PERMISSIONS_NAMES_BANK_PAY,
	INVENTORY_GUI_PERMISSIONS_NAMES_BANK_WITHDRAW,
	INVENTORY_GUI_PERMISSIONS_NAMES_PVPTOGGLE,
	INVENTORY_GUI_PERMISSIONS_NAMES_ALLY_CANCEL,
	INVENTORY_GUI_PERMISSIONS_NAMES_ALLY_INVITE_SEND,
	INVENTORY_GUI_PERMISSIONS_NAMES_ALLY_INVITE_CANCEL,
	INVENTORY_GUI_PERMISSIONS_NAMES_ALLY_ACCEPT,
	INVENTORY_GUI_PERMISSIONS_NAMES_BUYLIFE,
	INVENTORY_GUI_PERMISSIONS_NAMES_BUYSLOT,
	INVENTORY_GUI_PERMISSIONS_NAMES_HOME_SET,
	INVENTORY_GUI_PERMISSIONS_NAMES_HOME_TELEPORT,
	INVENTORY_GUI_PERMISSIONS_NAMES_OPENINVITATION,
	INVENTORY_GUI_PERMISSIONS_NAMES_SET_NAME,
	INVENTORY_GUI_PERMISSIONS_NAMES_SET_TAG,
	INVENTORY_GUI_PERMISSIONS_NAMES_WAR_INVITE_SEND,
	INVENTORY_GUI_PERMISSIONS_NAMES_WAR_INVITE_ACCEPT,
	INVENTORY_GUI_PERMISSIONS_NAMES_WAR_START,
	INVENTORY_GUI_PERMISSIONS_NAMES_VAULT_ACCESS,
	INVENTORY_GUI_PERMISSIONS_NAMES_VAULT_PUT,
	INVENTORY_GUI_PERMISSIONS_NAMES_VAULT_TAKE,
	INVENTORY_GUI_PERMISSIONS_NAMES_VAULT_PLACE,
	INVENTORY_GUI_PERMISSIONS_NAMES_VAULT_BREAK,
	INVENTORY_GUI_PERMISSIONS_NAMES_REGION_CREATE,
	INVENTORY_GUI_PERMISSIONS_NAMES_REGION_REMOVE,
	INVENTORY_GUI_PERMISSIONS_NAMES_REGION_RESIZE,
	INVENTORY_GUI_PERMISSIONS_NAMES_RANK_SET,
	INVENTORY_GUI_PERMISSIONS_NAMES_RANK_EDIT,

	TIMEUNIT_SECOND_SINGULAR,
	TIMEUNIT_SECOND_PLURAL,
	TIMEUNIT_MINUTE_SINGULAR,
	TIMEUNIT_MINUTE_PLURAL,
	TIMEUNIT_HOUR_SINGULAR,
	TIMEUNIT_HOUR_PLURAL,
	TIMEUNIT_DAY_SINGULAR,
	TIMEUNIT_DAY_PLURAL,
	TIMEUNIT_WEEK_SINGULAR,
	TIMEUNIT_WEEK_PLURAL,
	TIMEUNIT_MONTH_SINGULAR,
	TIMEUNIT_MONTH_PLURAL,
	TIMEUNIT_YEAR_SINGULAR,
	TIMEUNIT_YEAR_PLURAL;

	private boolean title = false;
	private String path = null;
	private Map<VarKey, String> vars = new HashMap<>();
	private boolean prefix = true;
	private boolean list = false;

	private static final Map<ChatMode, Message> chatModeMessages = new HashMap<ChatMode, Message>(){{
		put(ChatMode.NORMAL, Message.CHAT_GUILD_CHATMODE_NAMES_NORMAL);
		put(ChatMode.GUILD, Message.CHAT_GUILD_CHATMODE_NAMES_GUILD);
		put(ChatMode.ALLY, Message.CHAT_GUILD_CHATMODE_NAMES_ALLY);
	}};

	private enum MessageFlag {
		NOPREFIX,
		TITLE,
		LIST,
	}

	Message() {

	}

	Message(MessageFlag... flags) {
		for(MessageFlag flag : flags) {
			if(flag == MessageFlag.NOPREFIX) {
				prefix = false;
			}
			else if(flag == MessageFlag.TITLE) {
				title = true;
			}
			else if(flag == MessageFlag.LIST) {
				list = true;
				prefix = false;
			}
		}
	}

	/**
	 * Tells if the message is suitable for Title
	 * @return true/false
	 */
	public boolean getTitle() {
		return title;
	}

	/**
	 * Gets message's yaml path
	 * @return the path
	 */
	public String getPath() {
		if(path == null) {
			path = name().replace("_", ".").toLowerCase();
		}

		return path;
	}

	/**
	 * Tells if the prefix is turned on
	 * @return prefix status true/false
	 */
	public boolean isPrefix() {
		return prefix;
	}

	/**
	 * Gets the map of variables
	 * @return The Map
	 */
	public Map<VarKey, String> getVars() {
		return vars;
	}

	/**
	 * Sends the Message to a player
	 * @param sender receiver
	 */
	public void send(CommandSender sender) {
		if(list) {
			MessageManager.sendMessagesList(sender, this);
		}
		else {
			MessageManager.sendMessagesMsg(sender, this);
		}
	}

	/**
	 * Send the message to a player using NovaPlayer instance
	 * @param nPlayer receiver NovaPlayer
	 */
	public void send(NovaPlayer nPlayer) {
		if(nPlayer.isOnline()) {
			send(nPlayer.getPlayer());
		}
	}

	/**
	 * Adds a map of vars;
	 * @param vars Map of variables
	 * @return Message instance
	 */
	public Message vars(Map<VarKey, String> vars) {
		this.vars = vars;
		return this;
	}

	public Message setVar(VarKey varKey, String string) {
		vars.put(varKey, string);
		return this;
	}

	public Message setVar(VarKey varKey, Integer integer) {
		return setVar(varKey, String.valueOf(integer));
	}

	public Message setVar(VarKey varKey, Double value) {
		return setVar(varKey, String.valueOf(value));
	}

	/**
	 * Sets whether the prefix should be displayed
	 * @param prefix prefix status
	 * @return Message instance
	 */
	public Message prefix(boolean prefix) {
		this.prefix = prefix;
		return this;
	}

	/**
	 * Broadcasts the message to all players of a guild
	 * @param guild the guild
	 */
	public void broadcast(NovaGuild guild) {
		MessageManager.broadcast(guild, this);
	}

	/**
	 * Broadcasts the message to all players
	 */
	public void broadcast() {
		MessageManager.broadcast(this);
	}

	/**
	 * Broadcasts the message to all players with a certain permission
	 * @param permission the permission enum
	 */
	public void broadcast(Permission permission) {
		MessageManager.broadcast(this, permission);
	}

	/**
	 * Gets the message string
	 * @return message string
	 */
	public String get() {
		return MessageManager.replaceVarKeyMap(MessageManager.getMessagesString(this), vars);
	}

	/**
	 * Gets an ItemStacks from the Message
	 * @return ItemStack instance
	 */
	public ItemStack getItemStack() {
		return ItemStackUtils.stringToItemStack(get());
	}

	/**
	 * Gets a list
	 * @return the list
	 */
	public List<String> getList() {
		return MessageManager.getMessages().getStringList(getPath());
	}

	/**
	 * Gets a message depending on the boolean, it can be either ON or OFF message
	 * @param b boolean
	 * @return string of ON or OFF message
	 */
	public static String getOnOff(boolean b) {
		return b ? Message.CHAT_BASIC_ON.get() : Message.CHAT_BASIC_OFF.get();
	}

	/**
	 * Gets a ConfigurationSection
	 * @return the ConfigurationSection
	 */
	public ConfigurationSection getConfigurationSection() {
		return MessageManager.getMessages().getConfigurationSection(getParentPath());
	}

	/**
	 * Gets Message's neighbours (excluding itslef)
	 * @return a list of Messages in one ConfigurationSection
	 */
	public List<Message> getNeighbours() {
		List<Message> list = new ArrayList<>();
		String parentPath = getParentPath();
		for(String key : getConfigurationSection().getKeys(false)) {
			key = parentPath + "." + key;

			if(!key.equals(getPath())) {
				list.add(Message.fromPath(key).prefix(isPrefix()));
			}
		}

		return list;
	}

	/**
	 * Sends a list of messages
	 * @param list the list
	 * @param sender the receiver
	 */
	public static void send(List<Message> list, CommandSender sender) {
		for(Message message : list) {
			message.send(sender);
		}
	}

	/**
	 * Gets the path of ConfigurationSection the Message's in
	 * @return the path
	 */
	private String getParentPath() {
		String[] split = StringUtils.split(getPath(), ".");
		return StringUtils.removeEnd(getPath(), "." + split[split.length-1]);
	}

	/**
	 * Gets a message from path
	 * @param path path string
	 * @return message enum
	 */
	public static Message fromPath(String path) {
		return Message.valueOf(StringUtils.replace(path, ".", "_").toUpperCase());
	}

	/**
	 * Gets a name of chat mode
	 * @param chatMode chat mode enum
	 * @return the name
	 */
	public static Message getChatModeName(ChatMode chatMode) {
		return chatModeMessages.get(chatMode);
	}

	/**
	 * Gets a message with filled coordinated
	 * @param location location instance
	 * @return the message
	 */
	public static Message getCoords3D(Location location) {
		Message message = Message.CHAT_BASIC_COORDS3D;

		Map<VarKey, String> vars = new HashMap<>();
		vars.put(VarKey.X, String.valueOf(location.getBlockX()));
		vars.put(VarKey.Y, String.valueOf(location.getBlockY()));
		vars.put(VarKey.Z, String.valueOf(location.getBlockZ()));
		message.vars(vars);

		return message;
	}
}
