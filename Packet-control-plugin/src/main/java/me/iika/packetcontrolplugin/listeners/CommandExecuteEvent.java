package me.iika.packetcontrolplugin.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandExecuteEvent implements Listener {

    @EventHandler
    public void onCommandExecute(PlayerCommandPreprocessEvent event) {

        if (event.getMessage().contains("packet")) {

            if (!event.getMessage().contains("packets")) {
                event.getPlayer().sendMessage("Use The packets command");
                event.setCancelled(true);
            }
        }
    }
}
