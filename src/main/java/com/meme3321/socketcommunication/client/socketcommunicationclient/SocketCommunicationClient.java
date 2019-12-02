package com.meme3321.socketcommunication.client.socketcommunicationclient;

import com.meme3321.socketcommunication.client.socketcommunicationclient.commands.JoinToArenaCommand;
import com.meme3321.socketcommunication.client.socketcommunicationclient.executors.SocketExecutor;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocketCommunicationClient extends JavaPlugin {

    public SocketExecutor socketExecutor;
    public static SocketCommunicationClient plugin;

    @Override
    public void onEnable() {
        plugin = this;
        registerCommands();
        socketExecutor = new SocketExecutor();
    }

    @Override
    public void onDisable() {
    }

    private void registerCommands() {
        this.getCommand("dolacz").setExecutor(new JoinToArenaCommand());
    }
}