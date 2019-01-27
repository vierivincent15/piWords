package piwords;
import java.util.ArrayList;

class Course {

    private String courseName;
    private int numberOfStudents;
    private ArrayList<String> students;

    public Course(String courseName){
        this.students = new ArrayList<String>();
        this.numberOfStudents = 0;
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public ArrayList<String> getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void addStudent(String student){
        students.add(student);
        numberOfStudents += 1;
    }

    public void dropStudent(String student){
        students.remove(student);
        numberOfStudents -= 1;
    }

}

public class MockTest {
    public static void main(String[] args) {
        Course newcourse = new Course("Java");

        newcourse.addStudent("Alpha");
        newcourse.addStudent("Beta");
        newcourse.dropStudent("Alpha");
        System.out.println("Number of Student in " + newcourse.getCourseName() + " is " + newcourse.getNumberOfStudents());
    }

}
