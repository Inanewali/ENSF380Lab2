package yycpetresort;

import java.util.Date;

public class Booking {
    private Date startDate;
    private Date endDate;
    private int bookingId;

    public Booking(Date startDate, Date endDate, int bookingId) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.bookingId = bookingId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
}
