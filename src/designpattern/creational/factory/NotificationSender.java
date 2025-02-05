package designpattern.creational.factory;

public class NotificationSender {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {
        //NotificationExecutorFactory.getNotificationExecutor("SMS").executeNotification();
        //NotificationExecutorFactory.getNotificationExecutor("Email").executeNotification();
        //OCP + Factory
        OCPEnabledFactory.createNotification(SMSNotificationExecutor.class).executeNotification();
    }
}
