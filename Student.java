public class Student {
    private String name;
    private String id;
    private int age;
    private char grade;

    public Student(String name, String id, int age, char grade) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public char getGrade() {
        return grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

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
