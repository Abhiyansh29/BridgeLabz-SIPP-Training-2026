class Person {
    protected String name;
    protected int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Override toString()
    @Override
    public String toString() {
        return "Person Details:\n" +
               "Name = " + name +
               "\nAge = " + age;
    }
}

class Student extends Person {
    protected final int studentId;
    protected double gpa;

    // Constructor
    public Student(String name, int age, int studentId, double gpa) {
        super(name, age); // Calls Person constructor
        this.studentId = studentId;
        this.gpa = gpa;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nStudent ID = " + studentId +
               "\nGPA = " + gpa;
    }
}

class GradStudent extends Student {
    private String thesis;

    // Constructor
    public GradStudent(String name, int age, int studentId, double gpa, String thesis) {
        super(name, age, studentId, gpa); // Calls Student constructor
        this.thesis = thesis;
    }

    // Override toString()
    @Override
    public String toString() {
        return super.toString() +
               "\nThesis = " + thesis;
    }
}

public class GradStudent1 {
    public static void main(String[] args) {

        GradStudent gs = new GradStudent(
                "Abhiyansh",
                22,
                101,
                9.4,
                "Artificial Intelligence in Education"
        );

        // Display object
        System.out.println(gs);

        System.out.println("\n---- IS-A Relationship ----");

        // GradStudent IS-A Student
        Student s = gs;
        System.out.println("GradStudent IS-A Student: " + (s instanceof Student));

        // Student IS-A Person
        Person p = gs;
        System.out.println("Student IS-A Person: " + (p instanceof Person));

        // GradStudent IS-A Person
        System.out.println("GradStudent IS-A Person: " + (gs instanceof Person));
    }
}