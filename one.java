public class NotificationSubscriberOne implements Observer 
{
    @Override
    public void update(Notification n) {
        System.out.println("APP1 new notication" + n.getNotificationContent());
    }
}
