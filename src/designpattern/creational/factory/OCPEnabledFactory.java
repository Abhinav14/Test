package designpattern.creational.factory;

public class OCPEnabledFactory {

    public static NotificationExecutor createNotification(Class<? extends NotificationExecutor> notificationExecutor) throws InstantiationException, IllegalAccessException {
        return notificationExecutor.newInstance();
    }
}
