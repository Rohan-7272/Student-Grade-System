package StudentTracker;
import java.util.ArrayList;

public class GradeTracker {
    private final ArrayList<Student> students = new ArrayList<>();
    public void addStudent(String name, int marks) {
        students.add(new Student(name, marks));
    }
    public double getAverageMarks() {
        if (students.isEmpty()) {
            return 0;
        }
        int sum = 0;
        for (Student student : students) {
            sum += student.getMarks();
        }
        return (double) sum / students.size();
    }
    public int getHighestMark() {
        if (students.isEmpty()) {
            return 0;
        }
        int highestMark = students.getFirst().getMarks();
        for (Student student : students) {
            if (student.getMarks() > highestMark) {
                highestMark = student.getMarks();
            }
        }
        return highestMark;
    }
    public int getLowestMark() {
        if (students.isEmpty()) {
            return 0;
        }
        int lowestMark = students.getFirst().getMarks();

        for (Student student : students) {
            if (student.getMarks() < lowestMark) {
                lowestMark = student.getMarks();
            }
        }
        return lowestMark;
    }
    public void displayStudents() {

        for (Student student : students) {
            System.out.println(
                    student.getName() + " : " + student.getMarks());
        }
    }
}