package com.meme3321.socketcommunication.client.socketcommunicationclient.commands;

import com.meme3321.socketcommunication.client.socketcommunicationclient.executors.SocketExecutor;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class JoinToArenaCommand implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("dolacz")) {
            Player player = (Player) sender;
            SocketExecutor.joinToArena(player.getUniqueId(), player.getName());
        }
        return true;
    }
}