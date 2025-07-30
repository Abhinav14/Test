package designpattern.creational.factory.July2025;

import java.lang.reflect.InvocationTargetException;

public class OCPEnabledNotificationFactory {
    public static NotificationExecutor getConcreteClass(Class<? extends NotificationExecutor> notificationExecutor) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        return notificationExecutor.getDeclaredConstructor().newInstance();
    }
}
