package me.naturaldisater.Event.Wither;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Wither implements CommandExecutor {
    private JavaPlugin plugin;
    public Wither(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("wither").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {}
        if (sender.hasPermission("Natural.wither")) {}

        return false;
    }
}
