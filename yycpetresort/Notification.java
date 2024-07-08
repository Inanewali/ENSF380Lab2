package yycpetresort;

import java.util.Date;

public class Notification {
    private String message;
    private Date notificationDate;

    public Notification(String message, Date notificationDate) {
        this.message = message;
        this.notificationDate = notificationDate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(Date notificationDate) {
        this.notificationDate = notificationDate;
    }
}
