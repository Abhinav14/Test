package designpattern.creational.singleton.factory;

public class SMSNotificationExecutor implements NotificationExecutor{
    @Override
    public void executeNotification() {
        System.out.println("Sent Notification Over Mobile");
    }

}
