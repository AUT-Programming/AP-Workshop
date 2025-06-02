import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Handler  implements Runnable{

    private Scanner scanner;

    private HashSet<String> FileTolist;


    private static String LongestWord = "";
    private static String ShortestWord  ="test the app";
    private static int LengthOftheLongest = 0;
    private static int LengthOftheShortest = 20;

    private static int count = 0;

    private static float SumOfTheLength = 0;


    public Handler(File file) throws FileNotFoundException {
        scanner = new Scanner(file);
        FileTolist = new HashSet<>();
    }

    @Override
    public void run() {
        initial();
        Longest();
        Shortest();
        AverageLength();
    }

    public void initial (){
        while (scanner.hasNextLine()){
            String str = scanner.nextLine();
            FileTolist.add(str);
        }
    }

    public void Longest (){
        String hold = "";
        for ( String str : FileTolist){
            if(str.length() > hold.length()){
                hold = str;
            }
        }
        System.out.println(" Longest in this file : " + hold);
        System.out.println("length of longest in this file : " + hold.length());
        if(LengthOftheLongest < hold.length()){
            LongestWord = hold;
            LengthOftheLongest = hold.length();
        }

    }

    public void Shortest (){
        String hold = "test the app";
        for ( String str : FileTolist){
            if(str.length() <= hold.length()){
                hold = str;
            }
        }
        System.out.println(" Shortest in this file : " + hold);
        System.out.println("length of Shortest in this file : " + hold.length());
        if(LengthOftheShortest >= hold.length()){
            ShortestWord = hold;
            LengthOftheShortest = hold.length();
        }

    }


    public void AverageLength () {
        int x = 0;
        for (String str : FileTolist){
            x += str.length();
        }
        System.out.println(" Average Length of this file : " + (x*1.0)/FileTolist.size());
        SumOfTheLength += x;
        count += FileTolist.size();

    }

    public  static  void  countOfall (){
        System.out.println("count of all : " + count);
    }

    public static  void  LongestOfAll (){
        System.out.println("Longest of all : " + LongestWord);
        System.out.println("Length Of The Longest Of All : " + LengthOftheLongest);
    }

    public static  void  ShortestOfAll (){
        System.out.println("Shortest of all : " + ShortestWord);
        System.out.println("Length Of The Shortest Of All : " + LengthOftheShortest);
    }

    public  static  void  AverageOfAll (){
        System.out.println(" Average of all : " + SumOfTheLength/count);
    }

}
