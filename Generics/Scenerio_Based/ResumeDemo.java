import java.util.*;

abstract class JobRole {

    String roleName;

    JobRole(String roleName) {
        this.roleName = roleName;
    }

    void displayRole() {
        System.out.println(roleName);
    }
}

class SoftwareEngineer extends JobRole {
    SoftwareEngineer() {
        super("Software Engineer");
    }
}

class DataScientist extends JobRole {
    DataScientist() {
        super("Data Scientist");
    }
}

class ProductManager extends JobRole {
    ProductManager() {
        super("Product Manager");
    }
}

class Resume<T extends JobRole> {

    private String candidateName;
    private T role;

    Resume(String candidateName, T role) {
        this.candidateName = candidateName;
        this.role = role;
    }

    void processResume() {
        System.out.println(
                candidateName +
                " applied for " +
                role.roleName);
    }

    T getRole() {
        return role;
    }
}

public class ResumeDemo {

    static void screeningPipeline(
            List<? extends JobRole> roles) {

        System.out.println("\nScreening Roles:");

        for (JobRole role : roles) {
            role.displayRole();
        }
    }

    public static <T extends JobRole>
    void evaluateResume(Resume<T> resume) {

        resume.processResume();
    }

    public static void main(String[] args) {

        Resume<SoftwareEngineer> r1 =
                new Resume<>("Aman",
                        new SoftwareEngineer());

        Resume<DataScientist> r2 =
                new Resume<>("Riya",
                        new DataScientist());

        evaluateResume(r1);
        evaluateResume(r2);

        List<JobRole> roles = new ArrayList<>();

        roles.add(new SoftwareEngineer());
        roles.add(new DataScientist());
        roles.add(new ProductManager());

        screeningPipeline(roles);
    }
}