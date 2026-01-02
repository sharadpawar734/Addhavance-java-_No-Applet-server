import java.net.*;

public class Practical23 {
    public static void main(String[] args) {
        try {

            InetAddress localHost = InetAddress.getLocalHost();
            InetAddress byName = InetAddress.getByName("www.google.com");
            InetAddress[] allByName = InetAddress.getAllByName("www.google.com");

            System.out.println("LocalHost: " + localHost);
            System.out.println("By Name: " + byName);

            System.out.println("All By Name:");
            for (InetAddress address : allByName) {
                System.out.println(address);
            }


            System.out.println("Host Name: " + localHost.getHostName());
            System.out.println("Host Address: " + localHost.getHostAddress());

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
