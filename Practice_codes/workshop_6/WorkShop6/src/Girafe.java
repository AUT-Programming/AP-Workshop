public class Girafe extends Mammal implements Prey{
    public Girafe(String name, int age, String special, int speedOfRunning) {
        super(name, age, special, speedOfRunning);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.println("Name : " +  name + " Age : " + age + " Speed of running : " + speedOfRunning +
                " special : " + special);
    }

}
