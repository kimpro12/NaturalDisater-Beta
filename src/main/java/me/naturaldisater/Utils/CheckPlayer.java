package me.naturaldisater.Utils;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class CheckPlayer implements Listener {
    private JavaPlugin plugin;
    private Player playerinhouse;
    private Player playerwalking;
    private Player playerwater;
    private boolean isinwater = false;
    private boolean isinhouse = false;
    private boolean iswalking = false;
    public CheckPlayer(JavaPlugin plugin) {
        this.plugin = plugin;
    }
    @EventHandler
    public void check(PlayerMoveEvent event) {
        Player p = event.getPlayer();
        Location loc = p.getLocation();
        Block block = p.getLocation().getBlock().getRelative(BlockFace.DOWN);
        if (block.getType().equals(Material.DIAMOND_BLOCK)) {
            setPlayerinhouse(p);
            setIsinhouse(true);
        }
        if((int) event.getFrom().getX() != (int) event.getTo().getX() || (int) event.getFrom().getY() != (int) event.getTo().getY() || (int) event.getFrom().getZ() != (int) event.getTo().getZ()) {
            setPlayerwalking(p);
            setIswalking(true);
        }
        if (event.getTo().getBlock().isLiquid()) {
            setPlayerwater(p);
            setIsinwater(true);
            getPlayerwater().setHealth(0);
            getPlayerwater().sendMessage(color.transalate(plugin.getConfig().getString("Message-Water")));
        } else {
            setIsinwater(false);
        }
    }

    public Player getPlayerinhouse() {
        return playerinhouse;
    }

    public void setPlayerinhouse(Player playerinhouse) {
        this.playerinhouse = playerinhouse;
    }

    public Player getPlayerwalking() {
        return playerwalking;
    }

    public void setPlayerwalking(Player playerwalking) {
        this.playerwalking = playerwalking;
    }

    public boolean isIsinhouse() {
        return isinhouse;
    }

    public void setIsinhouse(boolean isinhouse) {
        this.isinhouse = isinhouse;
    }

    public boolean isIswalking() {
        return iswalking;
    }

    public void setIswalking(boolean iswalking) {
        this.iswalking = iswalking;
    }

    public Player getPlayerwater() {
        return playerwater;
    }

    public void setPlayerwater(Player playerwater) {
        this.playerwater = playerwater;
    }

    public boolean isIsinwater() {
        return isinwater;
    }

    public void setIsinwater(boolean isinwater) {
        this.isinwater = isinwater;
    }
}
