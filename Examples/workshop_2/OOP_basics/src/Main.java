public class Main {
    private String name;
    private String id;
    private int[] grades;

    public Main(String givenId, String givenName) {
        id = givenId;
        name = givenName;
        grades = new int[10];
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }

    public int getSum(int a, int b) {
        return a + b;

    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if (id.length() == 10)
            this.id = id;
    }
}