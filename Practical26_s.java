import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.HashSet;
import java.util.Set;

public class Practical26_s {
    private static final int PORT = 9876;
    private static final Set<InetAddress> clients = new HashSet<>();

    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(PORT)) {
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                byte[] receiveData = new byte[1024];
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                socket.receive(receivePacket);

                InetAddress clientAddress = receivePacket.getAddress();


                if (!clients.contains(clientAddress)) {
                    clients.add(clientAddress);
                    System.out.println("New client connected: " + clientAddress);
                }


                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("Received from " + clientAddress + ": " + receivedMessage);

                byte[] sendData = receivedMessage.getBytes();
                for (InetAddress client : clients) {
                    DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, client, PORT);
                    socket.send(sendPacket);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
