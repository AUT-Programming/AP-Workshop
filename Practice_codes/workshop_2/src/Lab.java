public class Lab {
    private Student[] students;
    private String teacherLab;
    private String dayOfWeek;
    private int maxSize;
    private int currentSize;
    private double avgGrade;

    public Lab(String teacherLab, String dayOfWeek, int maxSize) {
        this.teacherLab = teacherLab;
        this.dayOfWeek = dayOfWeek;
        this.maxSize = maxSize;

        currentSize = 0;
        students = new Student[maxSize];
    }

    public String getTeacherLab() {
        return teacherLab;
    }

    public void setTeacherLab(String teacherLab) {
        this.teacherLab = teacherLab;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public int getCurrentSize() {
        return currentSize;
    }

    public void setCurrentSize(int currentSize) {
        this.currentSize = currentSize;
    }

    public double getAvgGrade() {
        calAvg();
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public Student[] getStudents() {
        return students;
    }

    public void calAvg(){
        double total = 0;
        for(int i = 0 ; i < currentSize ; i ++){
            total += students[i].getGrade();
        }
        setAvgGrade((currentSize > 0) ? total / currentSize : 0);
    }

    public void enrollStudent(Student student){
        if(currentSize < maxSize){
            students[currentSize] = student;
            setCurrentSize(getCurrentSize() + 1);
            calAvg();
        }
        else{
            System.out.println("ernroll got wrong!");
        }
    }

    public void printLabInfo(){
        System.out.println("Teacher Name = " + teacherLab + "\n"+
                "Day of week  = " + dayOfWeek + "\n" +
                "Max Size = " + maxSize + "\n" +
                "Current Size = " + currentSize + "\n" +
                "Average Grade = " + avgGrade + "\n" );
        for (int i = 0; i < currentSize ; i++) {
            students[i].printStudentInfo();
            System.out.println("\n");
        }
    }
}
