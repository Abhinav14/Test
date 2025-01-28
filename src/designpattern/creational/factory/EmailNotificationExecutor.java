package designpattern.creational.factory;

public class EmailNotificationExecutor implements NotificationExecutor{
    @Override
    public void executeNotification() {
        System.out.println("Sent Notification Over Email");
    }
}
