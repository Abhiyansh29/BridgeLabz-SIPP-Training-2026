import java.util.PriorityQueue;

class Patient {

    int priority;
    String name;

    Patient(int priority, String name) {
        this.priority = priority;
        this.name = name;
    }
}

public class HospitalER {

    PriorityQueue<Patient> queue =
            new PriorityQueue<>((a, b) -> a.priority - b.priority);

    void admitPatient(Patient p) {
        queue.offer(p);
    }

    Patient callNextPatient() {
        return queue.poll();
    }

    public static void main(String[] args) {

        HospitalER er = new HospitalER();

        er.admitPatient(new Patient(3, "Rahul"));
        er.admitPatient(new Patient(1, "Amit"));
        er.admitPatient(new Patient(2, "Priya"));

        while (!er.queue.isEmpty()) {

            Patient p = er.callNextPatient();

            System.out.println(p.name + " Priority : " + p.priority);
        }
    }
}