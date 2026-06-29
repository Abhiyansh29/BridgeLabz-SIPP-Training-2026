class Song {
    String name;
    Song next;

    Song(String name) {
        this.name = name;
        this.next = null;
    }
}

class Playlist {
    Song head;

    void addSong(String name) {
        Song newSong = new Song(name);

        if (head == null) {
            head = newSong;
            return;
        }

        Song temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newSong;
    }

    void display() {
        Song temp = head;

        while (temp != null) {
            System.out.print(temp.name + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    void updateSong(String oldName, String newName) {
        Song temp = head;

        while (temp != null) {
            if (temp.name.equals(oldName)) {
                temp.name = newName;
                return;
            }
            temp = temp.next;
        }
    }

    void deleteSong(String name) {
        if (head == null) return;

        if (head.name.equals(name)) {
            head = head.next;
            return;
        }

        Song temp = head;

        while (temp.next != null && !temp.next.name.equals(name)) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Playlist p = new Playlist();

        // CREATE
        p.addSong("Shape of You");
        p.addSong("Believer");
        p.addSong("Perfect");

        // READ
        System.out.println("Playlist:");
        p.display();

        // UPDATE
        p.updateSong("Believer", "Thunder");
        System.out.println("\nAfter Update:");
        p.display();

        // DELETE
        p.deleteSong("Perfect");
        System.out.println("\nAfter Delete:");
        p.display();
    }
}