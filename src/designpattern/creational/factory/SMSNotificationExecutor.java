package designpattern.creational.factory;

public class SMSNotificationExecutor implements NotificationExecutor{
    @Override
    public void executeNotification() {
        System.out.println("SMS Notification Sent!");
    }

}
