package designpattern.creational.factory;

public class SMSNotificationExecutor1 implements NotificationExecutor1{

    @Override
    public void executeNotification() {
        System.out.println("Sending SMS Notification.");
    }
}
