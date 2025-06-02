public class Main {
    public static void main(String[] args) {
        Student std1 = new Student("James", "Gosling", "123456789");
        Student std2 = new Student("Arian", "Kheirandish", "12345");
        std1.setGrade(18);
        std2.setGrade(19);
        std1.printStudentInfo();
        std2.printStudentInfo();
        Lab lab1 = new Lab("Mr.A" , "Shanbeh", 30);
        lab1.enrollStudent(std1);
        lab1.enrollStudent((std2));
        lab1.printLabInfo();
    }
}