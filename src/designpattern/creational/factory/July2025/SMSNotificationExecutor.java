package designpattern.creational.factory.July2025;

public class SMSNotificationExecutor implements NotificationExecutor{
    @Override
    public void sendNotification() {
        System.out.println("SMS notification has been sent");
    }
}
