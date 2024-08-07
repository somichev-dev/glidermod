import org.bukkit.Bukkit
import org.bukkit.scheduler.BukkitTask

object RLEngineTaskManager {
    fun runTask(task: Runnable, delay: Long, period: Long): BukkitTask {
        return Bukkit.getScheduler().runTaskTimer(GliderMod.instance, task, delay, period)
    }

}