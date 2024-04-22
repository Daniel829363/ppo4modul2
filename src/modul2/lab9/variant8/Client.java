import java.net.*;
import java.util.Scanner;

public class Client {
    private static final int UDP_PORT = 9876;

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in);
             DatagramSocket socket = new DatagramSocket()) {

            InetAddress serverAddress = InetAddress.getByName("localhost");

            while (true) {
            System.out.println("Введите команду для отправки на сервер:");
            String command = scanner.nextLine();

            if ("0".equalsIgnoreCase(command)){break;}
            
            if ("restart".equalsIgnoreCase(command)) {
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
            } else {
                System.out.println("Команда не распознана.");
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
