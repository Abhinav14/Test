package designpattern.creational.factory.July2025;

public class NotificationExecutorFactory {
    public static NotificationExecutor getNotificationInstance(String notificationType){
        if(notificationType == "SMS"){
            return new SMSNotificationExecutor();
        }
        if(notificationType == "Email"){
            return new EmailNotificationExecutor();
        }
        return null;
    }
}
