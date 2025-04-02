public class Eagle extends Bird implements Hunter{
    public Eagle(String name, int age, String special, int heightOfFly) {
        super(name, age, special, heightOfFly);
    }

    @Override
    public void hunt(Prey prey) {
        System.out.println(name + " hunted " + prey.getName());
    }

    @Override
    public void show() {
        System.out.println("Name : " +  name + " Age : " + age + " Hight of fly : " + heightOfFly +
                " special : " + special);
    }
}
