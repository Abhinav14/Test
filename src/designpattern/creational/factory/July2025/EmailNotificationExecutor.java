package designpattern.creational.factory.July2025;

public class EmailNotificationExecutor implements NotificationExecutor{
    @Override
    public void sendNotification() {
        System.out.println("Email notification has been sent.");
    }
}
