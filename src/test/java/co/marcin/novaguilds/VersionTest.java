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

package co.marcin.novaguilds;

import co.marcin.novaguilds.util.VersionUtils;
import org.junit.Test;

public class VersionTest {
	@Test
	public void testVersionUtils() throws Exception {

		System.out.println("Current version: " + VersionUtils.buildCurrent);
		System.out.println("Dev version: " + VersionUtils.buildDev);
		System.out.println("Stable version: " + VersionUtils.buildLatest);

		if(VersionUtils.buildDev == 0 || VersionUtils.buildLatest == 0) {
			throw new Exception("Could not access remote build numbers!");
		}

		if(VersionUtils.buildCurrent <= 0 || VersionUtils.buildDev < 0 || VersionUtils.buildLatest < 0) {
			throw new Exception("Build number cannot be smaller or equal 0!");
		}

		if(VersionUtils.buildCurrent > VersionUtils.buildDev + 1) {
			throw new Exception("Current build cannot be more than 1 bigger than latest the dev!");
		}
	}
}
