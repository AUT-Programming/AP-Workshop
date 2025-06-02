import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("AP_workshop2.txt");
            int i;
            while ((i = fileReader.read()) != -1) {
                System.out.print((char) i);

            }

            fileReader.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}