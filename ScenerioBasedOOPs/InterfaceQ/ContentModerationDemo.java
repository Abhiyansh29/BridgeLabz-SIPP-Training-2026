interface TextModeration {

    boolean isOffensive(String post);

    default void displayModerationPolicy() {
        System.out.println("No offensive language allowed.");
    }

    static boolean containsRestrictedWords(String post) {
        String lower = post.toLowerCase();
        return lower.contains("badword")
                || lower.contains("hate")
                || lower.contains("abuse");
    }
}

interface SpamDetection {

    boolean isSpam(String post);

    default void displayModerationPolicy() {
        System.out.println("Spam content is prohibited.");
    }
}

class ContentModerator implements TextModeration, SpamDetection {

    @Override
    public boolean isOffensive(String post) {
        return TextModeration.containsRestrictedWords(post);
    }

    @Override
    public boolean isSpam(String post) {
        String lower = post.toLowerCase();
        return lower.contains("buy now")
                || lower.contains("click here")
                || lower.contains("free money");
    }

    // Resolve default method conflict
    @Override
    public void displayModerationPolicy() {
        TextModeration.super.displayModerationPolicy();
        SpamDetection.super.displayModerationPolicy();
    }
}

public class ContentModerationDemo {
    public static void main(String[] args) {

        String[] posts = {
                "Welcome to our community.",
                "Buy now and get 90% discount!",
                "I hate everyone here.",
                "Click here for free money.",
                "Have a great day everyone."
        };

        ContentModerator moderator = new ContentModerator();

        moderator.displayModerationPolicy();

        System.out.println("\nPost Analysis:");

        for (String post : posts) {

            if (moderator.isSpam(post)) {
                System.out.println("\"" + post + "\" -> Spam Post");
            }
            else if (moderator.isOffensive(post)) {
                System.out.println("\"" + post + "\" -> Offensive Post");
            }
            else {
                System.out.println("\"" + post + "\" -> Valid Post");
            }
        }
    }
}