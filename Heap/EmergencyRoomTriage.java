import java.util.PriorityQueue;

class EmergencyRoomTriage {

    static class Patient {
        String name;
        int severity;

        Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }
    }

    PriorityQueue<Patient> queue =
            new PriorityQueue<>((a, b) -> b.severity - a.severity);

    public void addPatient(String name, int severity) {
        queue.offer(new Patient(name, severity));
    }

    public Patient treatNext() {
        return queue.poll();
    }

    public static void main(String[] args) {

        EmergencyRoomTriage er = new EmergencyRoomTriage();

        er.addPatient("Alice", 5);
        er.addPatient("Bob", 10);
        er.addPatient("Charlie", 7);

        while (!er.queue.isEmpty()) {
            Patient p = er.treatNext();
            System.out.println(p.name + " Severity: " + p.severity);
        }
    }
}