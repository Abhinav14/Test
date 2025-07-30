package designpattern.creational.factory.July2025;

public class SMSNotificationExecutorAgain implements NotificationExecutorAgain{
    @Override
    public void send() {
        System.out.println("Notification sent as SMS");
    }
}
