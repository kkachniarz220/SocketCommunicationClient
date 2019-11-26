package com.meme3321.socketcommunication.client.socketcommunicationclient.executors;

import org.bukkit.Bukkit;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.UUID;

public class SocketExecutor {

    private static PrintWriter out;
    private static Socket socket;

    public static void joinToArena(UUID playerUUID, String playerName) {
        try {
            socket = new Socket(InetAddress.getLocalHost(), 5001);
            out = new PrintWriter(socket.getOutputStream(), true);
            Bukkit.broadcastMessage("sending");

            out.println("{\"uuid\":\"" + playerUUID + "\",\"playerName\":\"" + playerName + "\"}");
            socket.close();
        } catch (IOException e) {
    }
    }
}
