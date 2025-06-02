import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        try{
            register(null);
        } catch (IOException e) {
            throw new IOException();
        }

    }

    public static void  register(String id) throws IOException {
        if (id == null){
            throw new IOException();
        }
        else{
            //
        }
    }
}