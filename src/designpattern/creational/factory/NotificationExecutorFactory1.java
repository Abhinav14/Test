package designpattern.creational.factory;

public class NotificationExecutorFactory1 {
    public static NotificationExecutor1 getNotificationExecutor(String executorType){
        if(executorType.equals("Email")){
            return new EmailNotificationExecutor1();
        }
        if(executorType.equals("SMS")){
            return new SMSNotificationExecutor1();
        }
        return null;
    }
}
