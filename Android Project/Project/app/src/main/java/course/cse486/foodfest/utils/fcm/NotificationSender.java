package course.cse486.foodfest.utils.fcm;


public class NotificationSender {

    public Data data;
    public String to;

    public NotificationSender(Data data,String to)
    {
        this.data=data;
        this.to=to;
    }

    public NotificationSender()
    {

    }
}
