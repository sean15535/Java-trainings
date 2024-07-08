import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    // Static list to store student objects
    private static ArrayList<Student> students = new ArrayList<>();

    // Static variable to keep track of the total number of students
    private static int totalStudents = 0;

    // Method to add a new student to the list
    public static void addStudent(String name, String id, int age, char grade) {
        students.add(new Student(name, id, age, grade)); // Add new student to the list
        totalStudents++; // Increment total student count
    }

    // Method to update an existing student's details
    public static void updateStudent(String id, String name, int age, char grade) {
        for (Student student : students) {
            if (student.getId().equals(id)) { // Find student by ID
                student.setName(name); // Update name
                student.setAge(age); // Update age
                student.setGrade(grade); // Update grade
                return; // Exit method after updating
            }
        }
        System.out.println("Student with ID " + id + " not found."); // Print error if student not found
    }

    // Method to view details of a specific student by ID
    public static void viewStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) { // Find student by ID
                System.out.println(student); // Print student details
                return; // Exit method after finding the student
            }
        }
        System.out.println("Student with ID " + id + " not found."); // Print error if student not found
    }

    // Method to view details of all students
    public static void viewAllStudents() {
        for (Student student : students) { // Iterate through the student list
            System.out.println(student); // Print each student's details
        }
    }

    // Method to get the total number of students
    public static int getTotalStudents() {
        return totalStudents; // Return total student count
    }
}
