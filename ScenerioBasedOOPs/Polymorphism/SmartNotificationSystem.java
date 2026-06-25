class Notification {
    protected String recipientName;
    protected String message;

    public Notification(String recipientName, String message) {
        this.recipientName = recipientName;
        this.message = message;
    }

    public void sendNotification() {
        System.out.println("Sending Notification");
    }
}

class EmailNotification extends Notification {

    public EmailNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email sent to " + recipientName +
                " : " + message);
    }
}

class SMSNotification extends Notification {

    public SMSNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS sent to " + recipientName +
                " : " + message);
    }
}

class PushNotification extends Notification {

    public PushNotification(String recipientName, String message) {
        super(recipientName, message);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push Notification sent to " +
                recipientName + " : " + message);
    }
}

public class SmartNotificationSystem {
    public static void main(String[] args) {

        Notification[] notifications = {
                new EmailNotification("Abhiyansh", "Meeting at 5 PM"),
                new SMSNotification("Rahul", "OTP: 456789"),
                new PushNotification("Priya", "New Friend Request")
        };

        for (Notification n : notifications) {
            n.sendNotification();
        }
    }
}