package designpattern.creational.factory;

public class EmailNotificationExecutor1 implements NotificationExecutor1{
    @Override
    public void executeNotification() {
        System.out.println("Send email notification");
    }
}
