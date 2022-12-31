package me.naturaldisater.Event.Ghast;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Ghast implements CommandExecutor {
    private JavaPlugin plugin;
    public Ghast(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("ghast").setExecutor(this);
    }
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {}
        if (!sender.hasPermission("Natural.ghast")) {}
        return false;
    }
}
