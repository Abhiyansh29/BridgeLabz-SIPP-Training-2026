import java.util.ArrayList;

class Student {
    int id;
    String name;
    int age;

    Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Age: " + age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {

        // ArrayList stores students
        ArrayList<Student> students = new ArrayList<>();

        // CREATE (Add Students)
        students.add(new Student(101, "Aman", 20));
        students.add(new Student(102, "Riya", 21));
        students.add(new Student(103, "Karan", 19));

        System.out.println("After Adding Students:");
        display(students);

        // READ (Display One Student)
        System.out.println("\nStudent at index 1:");
        System.out.println(students.get(1));

        // UPDATE
        for(Student s : students) {
            if(s.id == 102) {
                s.name = "Riya Sharma";
                s.age = 22;
            }
        }

        System.out.println("\nAfter Updating Student:");
        display(students);

        // DELETE
        students.removeIf(s -> s.id == 103);

        System.out.println("\nAfter Deleting Student:");
        display(students);
    }

    static void display(ArrayList<Student> students) {
        for(Student s : students) {
            System.out.println(s);
        }
    }
}