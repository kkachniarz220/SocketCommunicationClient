package com.meme3321.socketcommunication.client.socketcommunicationclient.commands;

import com.meme3321.socketcommunication.client.socketcommunicationclient.SocketCommunicationClient;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JoinToArenaCommand implements CommandExecutor {
    SocketCommunicationClient plugin = SocketCommunicationClient.plugin;

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("dolacz")) {
            Player player = (Player) sender;
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&2Dołączanie do areny BedWars..."));
            plugin.socketExecutor.joinToArena(player.getUniqueId(), player.getName());
//            SocketExecutor.joinToArena(player.getUniqueId(), player.getName());
        }
        return true;
    }
}
