import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options
            System.out.println("\nStudent Record Management System");
            System.out.println("1. Add New Student");
            System.out.println("2. Update Student Information");
            System.out.println("3. View Student Details");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt(); // Read user choice
            scanner.nextLine();  // Consume newline left-over

            switch (choice) {
                case 1:
                    // Adding a new student
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter grade: ");
                    char grade = scanner.next().charAt(0);

                    StudentManagement.addStudent(name, id, age, grade);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    // Updating student information
                    System.out.print("Enter ID of the student to update: ");
                    id = scanner.nextLine();
                    System.out.print("Enter new name: ");
                    name = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    age = scanner.nextInt();
                    System.out.print("Enter new grade: ");
                    grade = scanner.next().charAt(0);

                    StudentManagement.updateStudent(id, name, age, grade);
                    break;
                case 3:
                    // Viewing a student's details
                    System.out.print("Enter ID of the student to view: ");
                    id = scanner.nextLine();

                    StudentManagement.viewStudent(id);
                    break;
                case 4:
                    // Viewing all students' details
                    StudentManagement.viewAllStudents();
                    break;
                case 5:
                    // Exiting the program
                    System.out.println("Exiting...");
                    scanner.close();
                    return; // Exit the loop and program
                default:
                    // Handling invalid input
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
