/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab9.variant8;
import java.net.*;
/**
 *
 * @author Acer
 */
public class Client {
    private static final int UDP_PORT = 9876;

    public static void main(String[] args) {
        try {
            DatagramSocket socket = new DatagramSocket();
            InetAddress serverAddress = InetAddress.getByName("localhost");

            // Send UDP command to server
            byte[] buffer = "RESTART".getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, UDP_PORT);
            socket.send(packet);

            // Receive response from server
            buffer = new byte[1024];
            packet = new DatagramPacket(buffer, buffer.length);
            socket.receive(packet);

            String response = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Response from server: " + response);

            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
