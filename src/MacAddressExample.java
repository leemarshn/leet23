import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class MacAddressExample {

    public static void main(String[] args) {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                NetworkInterface networkInterface = networkInterfaces.nextElement();
                byte[] macAddress = networkInterface.getHardwareAddress();
                if (macAddress != null) {
                    System.out.println("Network Interface: " + networkInterface.getName());
                    System.out.print("MAC Address: ");
                    for (byte b : macAddress) {
                        System.out.printf("%02X:", b);
                    }
                    System.out.println();
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}
