import org.bukkit.command.Command
import org.bukkit.command.CommandExecutor
import org.bukkit.command.CommandSender
import org.bukkit.command.TabCompleter
import org.bukkit.entity.Player

class GetCommand: CommandExecutor, TabCompleter {
    override fun onCommand(
        sender: CommandSender,
        cmd: Command,
        alias: String,
        args: Array<String>,
    ): Boolean {
        if(sender !is Player) return true
        sender.inventory.addItem(GliderItem.getItem())
        return true
    }

    override fun onTabComplete(
        sender: CommandSender,
        cmd: Command,
        alias: String,
        args: Array<String>,
    ): List<String> = listOf()
    }