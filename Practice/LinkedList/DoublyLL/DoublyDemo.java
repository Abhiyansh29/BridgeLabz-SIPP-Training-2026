class Page {
    String url;
    Page prev, next;

    Page(String url) {
        this.url = url;
    }
}

class BrowserHistory {
    Page head;

    // CREATE
    void visit(String url) {
        Page newPage = new Page(url);

        if (head == null) {
            head = newPage;
            return;
        }

        Page temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newPage;
        newPage.prev = temp;
    }

    // READ
    void displayForward() {
        Page temp = head;

        while (temp != null) {
            System.out.print(temp.url + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // UPDATE
    void updatePage(String oldUrl, String newUrl) {
        Page temp = head;

        while (temp != null) {
            if (temp.url.equals(oldUrl)) {
                temp.url = newUrl;
                return;
            }
            temp = temp.next;
        }
    }

    // DELETE
    void deletePage(String url) {
        if (head == null) return;

        if (head.url.equals(url)) {
            head = head.next;
            if (head != null)
                head.prev = null;
            return;
        }

        Page temp = head;

        while (temp != null && !temp.url.equals(url)) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp.prev != null)
            temp.prev.next = temp.next;

        if (temp.next != null)
            temp.next.prev = temp.prev;
    }
}

public class DoublyDemo {
    public static void main(String[] args) {

        BrowserHistory bh = new BrowserHistory();

        bh.visit("google.com");
        bh.visit("youtube.com");
        bh.visit("github.com");

        System.out.println("History:");
        bh.displayForward();

        bh.updatePage("github.com", "chatgpt.com");
        System.out.println("\nAfter Update:");
        bh.displayForward();

        bh.deletePage("youtube.com");
        System.out.println("\nAfter Delete:");
        bh.displayForward();
    }
}