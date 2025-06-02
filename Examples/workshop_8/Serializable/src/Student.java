import java.io.Serializable;

public class Student implements Serializable {
    String name;
    int age;
    transient String password;
}
