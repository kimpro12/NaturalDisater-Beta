package me.naturaldisater.Event.Axit;

import me.naturaldisater.Task.Ending;
import org.bukkit.plugin.java.JavaPlugin;

public class Axit1 {
    private JavaPlugin plugin;
    public Axit1(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    Ending delaytask = new Ending(plugin, plugin.getConfig().getInt("TimeAxit")) {
        @Override
        public void run() {
        }
    };
}
