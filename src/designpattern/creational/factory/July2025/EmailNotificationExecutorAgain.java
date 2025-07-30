package designpattern.creational.factory.July2025;

public class EmailNotificationExecutorAgain implements NotificationExecutorAgain{
    @Override
    public void send() {
        System.out.println("Notification sent over email.");
    }
}
