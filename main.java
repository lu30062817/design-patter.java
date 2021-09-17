public class Main 
{
    public static void main(String[] args) 
    {
        NotificationSubscriberOne s1 = new NotificationSubscriberOne();
        NotificationSubscriberTwo s2 = new NotificationSubscriberTwo();
        NotificationSubscriberThree s3 = new NotificationSubscriberThree();
         
        NotificationViewer p = new NotificationViewer();
         
        p.attach(s1);
        p.attach(s2);
         
        p.notifyUpdate(new Notification("the app has new messages"));   
         
        p.detach(s1);
        p.attach(s3);
         
        p.notifyUpdate(new Notification("update available for the app")); 
    }
}
