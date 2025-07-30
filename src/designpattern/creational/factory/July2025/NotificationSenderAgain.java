package designpattern.creational.factory.July2025;

public class NotificationSenderAgain {
    public static void main(String[] args) {
        NotificationExecutorAgain execType = NotificationExecutorFactoryAgain.getExecutorType("SMS");
        if(execType != null){
            execType.send();
        }
    }
}
