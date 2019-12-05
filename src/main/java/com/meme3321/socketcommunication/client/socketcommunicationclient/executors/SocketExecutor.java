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

    public SocketExecutor() {
        open();
    }

    private void open() {
        try {
            socket = new Socket(InetAddress.getLocalHost(), 5001);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void close() {
        try {
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void joinToArena(UUID playerUUID, String playerName) {
        try {
            out = new PrintWriter(socket.getOutputStream(), true);
            out.println("{\"uuid\":\"" + playerUUID + "\",\"playerName\":\"" + playerName + "\"}");
        } catch (IOException e) {
        }
    }


}
