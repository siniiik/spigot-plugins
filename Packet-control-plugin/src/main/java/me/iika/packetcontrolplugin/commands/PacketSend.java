package me.iika.packetcontrolplugin.commands;

import me.kodysimpson.simpapi.command.SubCommand;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacketSend extends SubCommand {

    private static final List<String> aliases = new ArrayList<>();

    public static void setAliases() {
        aliases.add("deliver");
        aliases.add("run");
    }


    @Override
    public String getName() {
        return "send";
    }

    @Override
    public List<String> getAliases() {
        setAliases();
        return aliases;
    }

    @Override
    public String getDescription() {
        return null;
    }

    @Override
    public String getSyntax() {
        return "/packets send PACKET-TYPE PACKET (set datatype:index=value) is optional ";
    }

    @Override
    public void perform(CommandSender sender, String[] args) {


        if(sender instanceof Player player) {

            if (args.length > 2) {


            }else player.sendMessage(getSyntax());

        }else System.out.println("Only a player can run this command");

    }

    @Override
    public List<String> getSubcommandArguments(Player player, String[] args) {

        return Arrays.asList("arg", "argtwo");
    }
}
