import java.io.*;
import java.net.Socket;

public class Practical21_c {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);


            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);


            BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter a number: ");
            String numberStr = userInput.readLine();
            int number = Integer.parseInt(numberStr);


            out.println(number);


            String result = in.readLine();
            System.out.println("Server response: " + result);


            in.close();
            out.close();
            userInput.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
