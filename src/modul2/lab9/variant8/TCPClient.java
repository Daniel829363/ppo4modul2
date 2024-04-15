/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul2.lab9.variant8;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class TCPClient {
    private static final String SERVER_ADDRESS = "localhost";
    private static final int SERVER_PORT = 12345;
    private static BufferedReader in;
    private static PrintWriter out;

    public static void main(String[] args) {
        try {
            Socket socket = new Socket(SERVER_ADDRESS, SERVER_PORT);
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            out = new PrintWriter(socket.getOutputStream(), true);

            // Assume client sends its name first
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            out.println(name);

            // Start a thread to listen for server messages
            new Thread(() -> {
                try {
                    String serverResponse;
                    while ((serverResponse = in.readLine()) != null) {
                        System.out.println(serverResponse);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();

            // Send messages to the server
            while (true) {
                System.out.print("Enter your message: ");
                String message = scanner.nextLine();
                out.println(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
