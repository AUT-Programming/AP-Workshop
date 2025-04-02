public class Cheetah extends Mammal implements Hunter{
    public Cheetah(String name, int age, String special, int speedOfRunning) {
        super(name, age, special, speedOfRunning);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }

    @Override
    public void show() {
        System.out.println("Name : " +  name + " Age : " + age + " Speed of running : " + speedOfRunning +
                " special : " + special);
    }
}
