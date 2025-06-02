
import java.util.*;

public class Main {
    public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<>();
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars.get(0));
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        cars.remove(0);
        System.out.println(cars.get(0));
        System.out.println(cars.size() + "\n");
        cars.clear();
        //System.out.println(cars.get(0));

        LinkedList<String> cars1 = new LinkedList<>();
        cars1.add("Volvo");
        cars1.add("BMW");
        cars1.add("Ford");
        cars1.add("Mezda");
        System.out.println(cars1.get(0));
        cars1.set(0, "Opel");
        System.out.println(cars1.get(0));
        cars1.remove(0);
        System.out.println(cars1.get(0));
        System.out.println(cars1.size() + "\n");
        cars1.clear();


        HashSet<String> cars2 = new HashSet<>();
        cars2.add("Volvo");
        cars2.add("BMW");
        cars2.add("Ford");
        cars2.add("Mezda");
        cars2.add("BMW");
        for ( String car : cars2){
            System.out.println(car);
        }
        cars2.remove("Volvo");
        System.out.println(cars2.contains("Volvo"));
        System.out.println(cars2.size() + "\n");
        cars2.clear();


        HashMap<String, String> capitalCities = new HashMap<>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        System.out.println(capitalCities.get("England"));
        capitalCities.remove("England");
        for ( String key : capitalCities.keySet()){
            System.out.println(key);
        }
        for ( String str : capitalCities.values()){
            System.out.println(str);
        }
        System.out.println("\n");


        ArrayList <String> strings = new ArrayList<>();
        strings.add("Java SE");
        strings.add("Java ME");
        strings.add("C programing");
        strings.add("Python");
        for(String string : strings){
            System.out.println(string);
        }
        System.out.println("___________________\n");
        Iterator <String> iterator = strings.iterator();
        while (iterator.hasNext()){
            String string = iterator.next();
            if(string.contains("Java")){
                iterator.remove();
            }
        }
        for(String string : strings){
            System.out.println(string);
        }

    }
}