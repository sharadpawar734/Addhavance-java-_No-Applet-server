import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Practical18_s {
    public static void main(String[] args) {
        try {
            // Create a server socket
            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for a connection...");

            // Wait for a client to connect
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");

            // Create input and output streams for communication with the client
            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Receive the number from the client
            String numberStr = in.readLine();
            int number = Integer.parseInt(numberStr);

            // Calculate the square
            int square = number * number;

            // Send the square back to the client
            out.println("The square of " + number + " is: " + square);

            // Close the connections
            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
