package designpattern.creational.factory;

public class NotificationExecutorFactory {
    public static NotificationExecutor getNotificationExecutor(String executorType){
        if(executorType.equals("Email")){
            return new EmailNotificationExecutor();
        }
        if(executorType.equals("SMS")){
            return new SMSNotificationExecutor();
        }
        return null;
    }
}
