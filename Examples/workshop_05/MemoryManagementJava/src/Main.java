//public class Main {
//    public static void main(String[] args) {
//        Person person = new Person(1, "Moein");
//        System.out.println(person);
//
//
//        // Identity
//        Integer a = new Integer(1);
//        Integer b = a;    // a == b is true.
//
//        // Equality
//        Integer c =  new Integer(1);
//        Integer d = new Integer(1); // c == d is false, but c is equal to d.
//
//
//
//        Point p1 = new Point(1, 4);
//        Point p2 = new Point(4, 4);
//
//        Triangle t = new Triangle(p1, p2, new Point(1, 8));
//
//        double area = t.getArea();
//        System.out.println(area);
//
//
//    }
//}

// Static Data
class Example {
    int globalVar = 3;
    public int showVar() {
        return globalVar;
    }
}


// Heap
class Person {
    int pid;
    String name;
    public Person(int id, String name) {
        this.pid = id;
        this.name = name;
    }
}
class Driver {
    public static void main(String[] args) {
        int id = 1;
        String pName = "Rick";
        Person p = new Person(id, pName);
    }
}


class Point {

    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}


class Triangle {

    private final Point p1;
    private final Point p2;
    private final Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getArea() {
        return Math.abs(0.5 * (p1.getX() * (p2.getY() - p3.getY())
                + p2.getX() * (p3.getY() - p1.getY())
                + p3.getX() * (p1.getY() - p2.getY())));
    }

}


public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(1, 4);
        Point p2 = new Point(4, 4);

        Triangle t = new Triangle(p1, p2, new Point(1, 8));

        double area = t.getArea();
        System.out.println(area);
    }

}
