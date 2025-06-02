import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws InterruptedException, FileNotFoundException {
        Thread thread;

        for (int i = 1; i <= 20; i++) {
            System.out.printf("<--%dth file-->\n", i);
            Handler h = new Handler(new File("src/Files/file_" + i + ".txt"));
            thread = new Thread(h);
            thread.start();
            thread.join();
            System.out.println("---------------------");
        }

        Handler.countOfall();
        Handler.LongestOfAll();
        Handler.ShortestOfAll();
        Handler.AverageOfAll();

    }
}