package designpattern.creational.factory.July2025;

import java.lang.reflect.InvocationTargetException;

public class NotificationSender {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        //NotificationExecutorFactory.getNotificationInstance("SMS").sendNotification();
        OCPEnabledNotificationFactory.getConcreteClass(EmailNotificationExecutor.class).sendNotification();
    }
}
