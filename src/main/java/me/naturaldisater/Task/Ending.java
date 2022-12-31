package me.naturaldisater.Task;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public abstract class Ending implements Runnable{
    private int taskId;

    public Ending(JavaPlugin plugin, int arg1) {
        taskId = Bukkit.getScheduler().scheduleSyncDelayedTask(plugin,this, arg1);
    }
}
