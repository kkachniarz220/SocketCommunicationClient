package com.meme3321.socketcommunication.client.socketcommunicationclient;

import com.meme3321.socketcommunication.client.socketcommunicationclient.commands.JoinToArenaCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class SocketCommunicationClient extends JavaPlugin {

    @Override
    public void onEnable() {
        registerCommands();
    }

    @Override
    public void onDisable() {
    }

    private void registerCommands() {
        this.getCommand("dolacz").setExecutor(new JoinToArenaCommand());
    }
}