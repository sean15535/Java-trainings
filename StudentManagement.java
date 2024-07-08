import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    private static ArrayList<Student> students = new ArrayList<>();
    private static int totalStudents = 0;

    public static void addStudent(String name, String id, int age, char grade) {
        students.add(new Student(name, id, age, grade));
        totalStudents++;
    }

    public static void updateStudent(String id, String name, int age, char grade) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                student.setName(name);
                student.setAge(age);
                student.setGrade(grade);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void viewStudent(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public static void viewAllStudents() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}
