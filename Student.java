public class Student {
    // Private member variables
    private String name;  // Student's name
    private String id;    // Student's ID
    private int age;      // Student's age
    private char grade;   // Student's grade

    // Constructor to initialize the Student object
    public Student(String name, String id, int age, char grade) {
        this.name = name;  // Initialize name
        this.id = id;      // Initialize ID
        this.age = age;    // Initialize age
        this.grade = grade; // Initialize grade
    }

    // Getter method for name
    public String getName() {
        return name;  // Return the name of the student
    }

    // Getter method for ID
    public String getId() {
        return id;  // Return the ID of the student
    }

    // Getter method for age
    public int getAge() {
        return age;  // Return the age of the student
    }

    // Getter method for grade
    public char getGrade() {
        return grade;  // Return the grade of the student
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;  // Set a new name for the student
    }

    // Setter method for age
    public void setAge(int age) {
        this.age = age;  // Set a new age for the student
    }

    // Setter method for grade
    public void setGrade(char grade) {
        this.grade = grade;  // Set a new grade for the student
    }

    // Override the toString() method to provide a custom string representation of the Student object
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
