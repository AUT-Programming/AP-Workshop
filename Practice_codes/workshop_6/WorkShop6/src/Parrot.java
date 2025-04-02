public class Parrot extends Bird implements Prey{
    public Parrot(String name, int age, String special, int heightOfFly) {
        super(name, age, special, heightOfFly);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void show() {
        System.out.println("Name : " +  name + " Age : " + age + " Hight of fly : " + heightOfFly +
                " special : " + special);
    }

}
