public class myRunnable implements  Runnable{
    int number;

    public myRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
       for (int i = 1 ; i< 5 ; i++){
           System.out.println("task" + number + " " + i);
        }
    }
}
