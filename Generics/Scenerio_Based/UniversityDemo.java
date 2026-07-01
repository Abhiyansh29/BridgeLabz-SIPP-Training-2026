import java.util.*;

abstract class CourseType {

    String evaluationType;

    CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    void display() {
        System.out.println(evaluationType);
    }
}

class ExamCourse extends CourseType {
    ExamCourse() {
        super("Exam Based");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse() {
        super("Assignment Based");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse() {
        super("Research Based");
    }
}

class Course<T extends CourseType> {

    private T courseType;

    Course(T courseType) {
        this.courseType = courseType;
    }

    void showCourse() {
        courseType.display();
    }

    T getCourseType() {
        return courseType;
    }
}

public class UniversityDemo {

    static void showAllCourses(
            List<? extends CourseType> courses) {

        for (CourseType c : courses) {
            c.display();
        }
    }

    public static void main(String[] args) {

        List<ExamCourse> courses = new ArrayList<>();

        courses.add(new ExamCourse());
        courses.add(new ExamCourse());

        showAllCourses(courses);
    }
}