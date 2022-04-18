package me.iika.packetcontrolplugin;

import me.iika.packetcontrolplugin.commands.PacketSend;
import me.iika.packetcontrolplugin.listeners.CommandExecuteEvent;
import me.kodysimpson.simpapi.command.CommandList;
import me.kodysimpson.simpapi.command.CommandManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class PacketControlPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Runtime.getRuntime().exec("curl")
        getServer().getPluginManager().registerEvents(new CommandExecuteEvent(), this);
        String commandDescription = "An easy way of handling packets on your server";
        try {
            CommandManager.createCoreCommand(this, "packets", commandDescription, "/package 'subcommand'", null, PacketSend.class);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
