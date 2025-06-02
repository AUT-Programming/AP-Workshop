public class Student {
    private final  String name;

    private final int numbor;

    private final String[] courses;

    public Student(String name, int numbor, String[] courses) {
        this.name = name;
        this.numbor = numbor;
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public int getNumbor() {
        return numbor;
    }

    public String[] getCourses() {
        String [] tempCourses = new String[courses.length];
        for (int i = 0; i < courses.length ; i++) {
            tempCourses[i] = courses[i];
        }
        return tempCourses;
    }

    public void printcourses(){
        for ( String course : courses){
            System.out.println(course);
        }


    }
}
