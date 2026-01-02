import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Practical21_s {
    public static void main(String[] args) {
        try {

            ServerSocket serverSocket = new ServerSocket(12345);
            System.out.println("Server is waiting for a connection...");


            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected");


            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);


            String numberStr = in.readLine();
            int number = Integer.parseInt(numberStr);


            String result = (number % 2 == 0) ? "Even" : "Odd";


            out.println("The number " + number + " is: " + result);


            in.close();
            out.close();
            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
