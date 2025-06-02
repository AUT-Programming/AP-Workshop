import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1", 6000);
            System.out.println(socket.getInetAddress()); // 127.0.0.1
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
