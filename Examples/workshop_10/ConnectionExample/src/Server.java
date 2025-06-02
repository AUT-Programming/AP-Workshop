import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6000);
            System.out.println("Server is listening...");
            Socket client = serverSocket.accept();
            System.out.println("connected to a client");
            System.out.println(client.getPort());
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
