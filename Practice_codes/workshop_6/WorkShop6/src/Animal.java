public abstract class Animal {
    protected String name;
    protected int age;
    protected String special;

    public Animal(String name, int age, String special) {
        this.name = name;
        this.age = age;
        this.special = special;
    }

    public abstract void show();
}
