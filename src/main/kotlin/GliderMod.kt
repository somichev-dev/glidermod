import org.bukkit.plugin.Plugin
import org.bukkit.plugin.java.JavaPlugin

/*
    GliderMod - glider from RLEngine
    Copyright (C) 2024 somichev.dev

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as published
    by the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

class GliderMod: JavaPlugin(){
    override fun onEnable() {
        instance = this
        RLEngineTaskManager
        RLEngineItems
        this.getCommand("get")?.setExecutor(GetCommand())
        logger.info("Glider mod initialised!")
    }

    companion object{
        lateinit var instance: Plugin
    }
}
