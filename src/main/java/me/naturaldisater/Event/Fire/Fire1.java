package me.naturaldisater.Event.Fire;

import me.naturaldisater.Task.Ending;
import org.bukkit.plugin.java.JavaPlugin;

public class Fire1 {
    private JavaPlugin plugin;
    public Fire1(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    Ending delaytask = new Ending(plugin, plugin.getConfig().getInt("TimeFire")) {
        @Override
        public void run() {
        }
    };
}
