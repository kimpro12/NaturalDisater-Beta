package me.naturaldisater.Event.Axit;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Axit implements CommandExecutor {
    private JavaPlugin plugin;
    public Axit(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("axit").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (!(sender.hasPermission("Natural.axit"))) {}
        }
        return false;
    }
}
