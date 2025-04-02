public abstract class Bird extends Animal{
    protected int heightOfFly;

    public Bird(String name, int age, String special, int heightOfFly) {
        super(name, age, special);
        this.heightOfFly = heightOfFly;
    }
}
