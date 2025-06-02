import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        switch (number){
//            case 1:
//                System.out.println("Saturday");
//                break;
//            case 2:
//                System.out.println("Sunday");
//                break;
//            case 3:
//                System.out.println("Monday");
//                break;
//            default:
//                System.out.println("Error!");
//        }

        switch (number){
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            default -> System.out.println("Error!");
        }
    }
}