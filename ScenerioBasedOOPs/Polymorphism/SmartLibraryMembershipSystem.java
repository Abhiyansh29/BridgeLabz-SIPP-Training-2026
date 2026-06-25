class LibraryMember {
    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }

    public void printDetails() {
        System.out.println("Name      : " + memberName);
        System.out.println("Member ID : " + memberId);
    }
}

class StudentMember extends LibraryMember {

    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2;
    }
}

class FacultyMember extends LibraryMember {

    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 1;
    }
}

class GuestMember extends LibraryMember {

    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5;
    }
}

public class SmartLibraryMembershipSystem {

    public static void main(String[] args) {

        LibraryMember[] members = {
                new StudentMember("Abhiyansh", "S101"),
                new FacultyMember("Dr Sharma", "F201"),
                new GuestMember("Rohit", "G301")
        };

        int overdueDays = 4;

        System.out.println("=== Member Details ===");

        for (LibraryMember m : members) {
            m.printDetails();
            System.out.println("Fine = ₹" +
                    m.calculateFine(overdueDays));
            System.out.println();
        }

        String searchId = "F201";

        System.out.println("Searching Member ID: " + searchId);

        boolean found = false;

        for (LibraryMember m : members) {
            if (m.memberId.equals(searchId)) {
                System.out.println("\nMember Found:");
                m.printDetails();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Member not found.");
        }
    }
}