package designpattern.creational.factory;

public class NotificationSender1 {
    public static void main(String[] args) {
        NotificationExecutorFactory1.getNotificationExecutor("Email").executeNotification();
    }
}
