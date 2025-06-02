
public class Main {
    public static void main(String[] args) {
        String[] courses = {"AP", "General Math 2", " Madar Manteghi"};
        Student student = new Student("Bita", 1234, courses);
        String [] courses1 = student.getCourses();
        courses1[1] = "Physics";
        student.printcourses();

    }
}