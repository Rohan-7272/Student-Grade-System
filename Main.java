import StudentTracker.GradeTracker;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeTracker tracker = new GradeTracker();
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= numberOfStudents; i++) {
            System.out.println("\nStudent " + i);
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine();
            tracker.addStudent(name, marks);
        }
        System.out.println("\n----- Student Report -----");
        tracker.displayStudents();
        System.out.printf("Average Marks: %.2f%n", tracker.getAverageMarks());
        System.out.println("Highest Mark : " + tracker.getHighestMark());
        System.out.println("Lowest Mark  : " + tracker.getLowestMark());
        sc.close();
    }
}