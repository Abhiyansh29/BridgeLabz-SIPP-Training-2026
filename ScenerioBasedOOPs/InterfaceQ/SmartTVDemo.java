interface StreamingService {
    void streamMovie();

    default void showSubscriptionDetails() {
        System.out.println("Streaming Subscription Active");
    }
}

interface GamingService {
    void playGame();

    default void showSubscriptionDetails() {
        System.out.println("Gaming Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie() {
        System.out.println("Streaming movie...");
    }

    @Override
    public void playGame() {
        System.out.println("Launching game...");
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class SmartTVDemo {
    public static void main(String[] args) {

        String[] movies = {
                "Inception",
                "Interstellar",
                "Avengers Endgame"
        };

        String[] games = {
                "FIFA 25",
                "Minecraft",
                "GTA V"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            System.out.println(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            System.out.println(game);
        }
    }
}