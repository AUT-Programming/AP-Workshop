import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Date;

public class Client {
    public static void main(String[] args) {
        System.out.println("\t".repeat(7) + "{CLIENT}\n");
        try {
            // Send a message to the server
            Socket socket = new Socket("127.0.0.1", 6000);
            Message message = new Message("Hey, how are doing? :D", new Date());
            ObjectOutputStream outputStream =
                    new ObjectOutputStream(socket.getOutputStream());
            outputStream.writeObject(message);
            // Receive a message from the server
            ObjectInputStream inputStream =
                    new ObjectInputStream(socket.getInputStream());
            Message serverMessage = (Message) inputStream.readObject();
            System.out.println(serverMessage.toString());
        } catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}