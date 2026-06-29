class Process {
    int pid;
    Process next;

    Process(int pid) {
        this.pid = pid;
    }
}

class RoundRobin {
    Process tail = null;

    // CREATE
    void addProcess(int pid) {
        Process newProcess = new Process(pid);

        if (tail == null) {
            tail = newProcess;
            tail.next = tail;
            return;
        }

        newProcess.next = tail.next;
        tail.next = newProcess;
        tail = newProcess;
    }

    // READ
    void display() {
        if (tail == null) {
            System.out.println("No Processes");
            return;
        }

        Process temp = tail.next;

        do {
            System.out.print("P" + temp.pid + " -> ");
            temp = temp.next;
        } while (temp != tail.next);

        System.out.println("(Back to First)");
    }

    // UPDATE
    void updateProcess(int oldPid, int newPid) {
        if (tail == null) return;

        Process temp = tail.next;

        do {
            if (temp.pid == oldPid) {
                temp.pid = newPid;
                return;
            }
            temp = temp.next;
        } while (temp != tail.next);
    }

    // DELETE
    void deleteProcess(int pid) {
        if (tail == null) return;

        Process curr = tail.next;
        Process prev = tail;

        do {
            if (curr.pid == pid) {

                if (curr == tail && curr == tail.next) {
                    tail = null;
                    return;
                }

                prev.next = curr.next;

                if (curr == tail)
                    tail = prev;

                return;
            }

            prev = curr;
            curr = curr.next;

        } while (curr != tail.next);
    }
}

public class CircularDemo {
    public static void main(String[] args) {

        RoundRobin rr = new RoundRobin();

        rr.addProcess(101);
        rr.addProcess(102);
        rr.addProcess(103);

        System.out.println("Processes:");
        rr.display();

        rr.updateProcess(102, 202);
        System.out.println("\nAfter Update:");
        rr.display();

        rr.deleteProcess(103);
        System.out.println("\nAfter Delete:");
        rr.display();
    }
}