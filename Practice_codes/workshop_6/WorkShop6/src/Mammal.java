public abstract class Mammal extends Animal {
    protected int speedOfRunning;

    public Mammal(String name, int age, String special, int speedOfRunning) {
        super(name, age, special);
        this.speedOfRunning = speedOfRunning;
    }
}
