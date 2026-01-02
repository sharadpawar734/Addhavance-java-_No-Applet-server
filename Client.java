// Practical 19

import java.io.*;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            // Create a socket to connect to the server
            Socket socket = new Socket("localhost", 12345);

            // Create input and output streams for communication with the server
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read a number from the user
            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            String numberStr = userInput.readLine();
            int number = Integer.parseInt(numberStr);

            // Send the number to the server
            out.println(number);

            // Receive and print the square from the server
            String squareResponse = in.readLine();
            System.out.println("Server response: " + squareResponse);

            // Close the connections
            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
