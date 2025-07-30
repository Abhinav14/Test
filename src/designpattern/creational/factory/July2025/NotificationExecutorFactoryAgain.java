package designpattern.creational.factory.July2025;

public class NotificationExecutorFactoryAgain {
    public static NotificationExecutorAgain getExecutorType(String executorType){
        if(executorType == "SMS"){
            return new SMSNotificationExecutorAgain();
        }
        if (executorType == "EMAIL"){
            return new EmailNotificationExecutorAgain();
        }
        return null;
    }
}
