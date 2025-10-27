package mini_projects.StudentManager;

import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(1, "Alice", 8.0));
        students.add(new Student(2, "Bob", 5.0));
        students.add(new Student(3, "May", 7.0));

        // Display all students
        for (Student s : students) {
            s.display();
        }
    }
}
