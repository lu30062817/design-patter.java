public class NotificationSubscriberTwo implements Observer 
{
    @Override
    public void update(Notification n) {
        System.out.println("APP2 new notification :: " + n.getNotificationContent());
    }
}
