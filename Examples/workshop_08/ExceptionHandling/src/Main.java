import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
//        checkAge(age);

        try {
            //کدی که ممکن است باعث اکسپشن شود و اجرای برنمه را مختل کند را در این بخش می نویسیم
            checkAge(age);
        }
        catch (IllegalArgumentException e){
            // هنگامی که اکسپشن دریافت کردیم کدی که در این بخش نوشتیم اجرا میشود
            System.out.println("Exception handled");
        }

    }

    public static void checkAge(int age){
        if (age < 18) {
            throw new ageException("i got error");
        }

        System.out.println("Access is allowed");
    }
}