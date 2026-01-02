import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Practical24 {
    public static void main(String[] args) {
        try {

            URL url = new URL("https://www.example.com");


            URLConnection urlConnection = url.openConnection();


            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());


            System.out.println("Content Type: " + urlConnection.getContentType());
            System.out.println("Content Length: " + urlConnection.getContentLength());


            BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            String line;
            System.out.println("Content:");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }


            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
