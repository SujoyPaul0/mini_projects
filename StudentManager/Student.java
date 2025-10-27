package Java-mini-projects.StudentManager;

public class Student {
    int id;
    String name;
    double marks;

    // Constructor
    public Student(int id, String name, double marks){
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Method to display student info
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}
