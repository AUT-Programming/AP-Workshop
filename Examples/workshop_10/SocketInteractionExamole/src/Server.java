import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    public static void main(String[] args) {
        System.out.println("\t".repeat(7) + "{SERVER}\n");
        try {
            // Receive a message from the client
            ServerSocket serverSocket = new ServerSocket(6000);
            Socket client = serverSocket.accept();
            ObjectInputStream inputStream =
                    new ObjectInputStream(client.getInputStream());
            Message clientMessage = (Message) inputStream.readObject();
            System.out.println(clientMessage.toString());
            // Send a message to the client
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(client.getOutputStream());
            Message message = new Message("Good, how about you?", new Date());
            outputStream.writeObject(message);
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
