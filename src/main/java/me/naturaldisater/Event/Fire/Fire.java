package me.naturaldisater.Event.Fire;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Fire implements CommandExecutor {
    private JavaPlugin plugin;
    public Fire(JavaPlugin plugin) {
        this.plugin = plugin;
        plugin.getCommand("fire").setExecutor(this);
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player)) {
            if (!(sender.hasPermission("Natural.fire"))) {}
            Player p = (Player) sender;
        }
        return false;
    }
}
