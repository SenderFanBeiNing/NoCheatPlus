/*
 * This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package net.catrainbow.nocheatplus

import cn.nukkit.plugin.PluginBase

/**
 * NoCheatPlus 主类
 *
 * @author Catrainbow
 */
class NoCheatPlus : PluginBase() {

    companion object {
        lateinit var instance: NoCheatPlus
        const val PLUGIN_VERSION: String = "1.0.0"
    }

    override fun onLoad() {
        instance = this
    }

    override fun onEnable() {

    }

}