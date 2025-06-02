import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        //myThread mythread = new myThread;
        //mythread.start;
        //Thread mythread = new Thread (new myRunnable);
        //mythread.start;

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        myRunnable task1 = new myRunnable(1);
        myRunnable task2 = new myRunnable(2);
        myRunnable task3 = new myRunnable(3);
        myRunnable task4 = new myRunnable(4);
        myRunnable task5 = new myRunnable(5);
        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);
        System.out.println("Hello");
        System.out.println("Bye");



        //read x  x= 10                10 +1 =11 write x =11
        //               read x x= 10                          10 +1 = 11  x= 11

    }
}



