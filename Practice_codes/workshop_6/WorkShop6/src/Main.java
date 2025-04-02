import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> arr = new ArrayList<>();
        Parrot parrot = new Parrot("parrot1", 10, "sp", 100);
        Cheetah cheetah = new Cheetah("cheetah1", 4, "sp2", 200);
        Eagle eagle = new Eagle("eagle1", 3, "sp3", 182);
        Girafe girafe = new Girafe("girafe1", 32, "sp4", 12);
        arr.add(parrot);
        arr.add(cheetah);
        arr.add(eagle);
        arr.add(girafe);
        int idx = 0;
        for(Animal animal : arr){
            System.out.printf("row : " + idx + " ");
            animal.show();
            idx ++;
        }
        cheetah.hunt(girafe);
        eagle.hunt(parrot);
    }
}