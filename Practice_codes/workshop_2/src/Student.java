public class Student {
    private String firstname;
    private String lastname;

    private String id;

    private double grade;

    public Student(String firstname, String lastname, String id) {
        this.firstname = firstname;
        this.lastname = lastname;
        if(id.length() >= 7)
            this.id = id;
        else {
            System.out.println("The id is incorrect!");
            this.id = "1231231";
        }
        // assume at first the grade is zero
        grade = 0;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length() >= 7)
            this.id = id;
        else
            System.out.println("The id is incorrect!");
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printStudentInfo(){
        System.out.println(firstname + " " + lastname + "\n" + "ID:"
         + id + "\n" + "GRADE:" + grade);
    }
}
