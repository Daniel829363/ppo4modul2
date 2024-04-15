/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab9.variant8;
import java.io.*;
import java.net.*;
import java.util.*;
/**
 *
 * @author Acer
 */
public class Server {
    private static final int UDP_PORT = 9876;
    private static DatagramSocket socket;
    private static List<InetSocketAddress> clients = new ArrayList<>();

    public static void main(String[] args) {
        try {
            socket = new DatagramSocket(UDP_PORT);
            System.out.println("UDP Server is running...");

            byte[] buffer = new byte[1024];
            while (true) {
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                socket.receive(packet);

                String received = new String(packet.getData(), 0, packet.getLength());
                System.out.println("Received UDP command: " + received);

                // Handle UDP command here
                if (received.equals("RESTART")) {
                    // Restart client
                    String clientAddress = packet.getAddress().getHostAddress();
                    int clientPort = packet.getPort();
                    InetSocketAddress client = new InetSocketAddress(clientAddress, clientPort);
                    clients.add(client);
                    sendUDPMessage("Restarting...", client);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (socket != null && !socket.isClosed()) {
                socket.close();
            }
        }
    }

    private static void sendUDPMessage(String message, InetSocketAddress client) {
        try {
            byte[] buffer = message.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, client);
            socket.send(packet);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
