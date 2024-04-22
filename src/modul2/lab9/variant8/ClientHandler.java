package modul2.lab9.variant8;

import java.io.*;
import java.net.*;
import java.util.*;

public class ClientHandler extends Thread {
    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private String clientName;

    public ClientHandler(Socket socket) {
        this.clientSocket = socket;
        try {
            out = new PrintWriter(clientSocket.getOutputStream(), true);
            in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            clientName = in.readLine(); // Assume client sends its name first
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getClientName() {
        return clientName;
    }

    public void sendClientList(List<String> clientNames) {
        out.println("CLIENTLIST " + String.join(",", clientNames));
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    @Override
    public void run() {
        try {
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                // Command format: "SEND <target-client-name> <message>"
                if (inputLine.startsWith("SEND ")) {
                    String[] parts = inputLine.split(" ", 3);
                    if (parts.length == 3) {
                        String targetClientName = parts[1];
                        String message = parts[2];
                        TCPServer.sendMessageToClient(targetClientName, "From " + clientName + ": " + message);
                    }
                } else {
                    System.out.println(clientName + ": " + inputLine);
                }
            }
            // Client disconnected
            TCPServer.clients.remove(this);
            TCPServer.updateClientList();
            in.close();
            out.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
