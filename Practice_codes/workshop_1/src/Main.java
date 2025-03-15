import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("first number:");
        double num1 = scanner.nextDouble() ;

        System.out.println("Second number:");
        double num2 = scanner.nextDouble();
        String operand = scanner.next();

        double res = 0;

        switch (operand){

            case "+" -> res = num1 + num2;
            case "-" -> res = num1 - num2;
            case "*" -> res = num1 * num2;
            case "/" -> res = num1 / num2;

        }

        System.out.println("your result is:" + res);


    }
}


