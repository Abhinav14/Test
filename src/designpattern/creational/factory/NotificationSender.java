package designpattern.creational.factory;

public class NotificationSender {
    public static void main(String[] args) {
        //NotificationExecutorFactory.getNotificationExecutor("SMS").executeNotification();
        NotificationExecutorFactory.getNotificationExecutor("Email").executeNotification();
    }
}
