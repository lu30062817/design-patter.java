public class NotificationSubscriberThree implements Observer 
{
    @Override
    public void update(Notification n) {
        System.out.println("APP3 new notification:: " + n.getNotificationContent());
    }
}
