/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab9.variant8;

import java.io.*;
import java.net.*;
import java.util.*;

public class TCPServer {
    private static final int PORT = 12345;
    public static List<ClientHandler> clients = new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("Server is running...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                ClientHandler clientHandler = new ClientHandler(clientSocket);
                clients.add(clientHandler);
                clientHandler.start();

                // Update all clients with the new connection
                updateClientList();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void updateClientList() {
        List<String> clientNames = new ArrayList<>();
        for (ClientHandler client : clients) {
            clientNames.add(client.getClientName());
        }
        for (ClientHandler client : clients) {
            client.sendClientList(clientNames);
        }
    }
}

