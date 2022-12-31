package me.naturaldisater;

import me.naturaldisater.Utils.CheckPlayer;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class Naturaldisater extends JavaPlugin {
    private Naturaldisater instance;
    @Override
    public void onEnable() {
        setInstance(this);
        saveDefaultConfig();
        Bukkit.getConsoleSender().sendMessage("[Naturaldisater] Plugin enabled");
        Bukkit.getPluginManager().registerEvents(new CheckPlayer(this), this);

    }

    @Override
    public void onDisable() {
        Bukkit.getConsoleSender().sendMessage("[Naturaldisater] Plugin disabled");
    }

    public Naturaldisater getInstance() {
        return instance;
    }

    public void setInstance(Naturaldisater instance) {
        this.instance = instance;
    }
}
