
import java.util.*;


// class College
class College {
    public String name;
    public int capacity;
    College(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }
    public int getCapacity() {
        return capacity;
    }
}



// University has more than one college.
class University {
    // reference to refer to list of college.
    private final List<College> colleges;
    University(List<College> colleges) {
        this.colleges = colleges;
    }
    // Getting total number of colleges
    public List<College> getTotalCollegesInUniversity() {
        return colleges;
    }
}



class CompositionExample {
    public static void main(String[] args) {
// Creating the Objects of College class.
        College c1 = new College("Computer Engineering College", 120);
        College c2 = new College("Mechanic Engineering College", 150);
        College c3 = new College("Electronics Engineering College", 200);
// Creating list which contains the no. of colleges.
        List<College> college = new ArrayList<College>();
        college.add(c1);
        college.add(c2);
        college.add(c3);
        University university = new University(college);
        List<College> colleges = university.getTotalCollegesInUniversity();
        for (College cg : colleges)
            System.out.println("Name : " + cg.name + " and " + " Capacity : "
                    + cg.getCapacity());
    }

}

