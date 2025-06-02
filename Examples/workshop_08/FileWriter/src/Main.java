import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        try{
            FileWriter fileWriter = new FileWriter("AP_workshop8.txt" );
            fileWriter.write("\nsalam in dastoor kar 8 e masalan");
            fileWriter.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}