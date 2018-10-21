package entities;

import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 25.05.18
 * Time: 17:28
 * package : entities
 * Responsability of classe :
 */
public class Room {

    private String roomId;
    private Status state;
    private Date day;
   // List<DurationBooking>


    //private Duration durationOfBooking;
    //private


    public Room(String roomId) {
        this.roomId = roomId;
    }

    public Room(String roomId, Date day) {
        this.roomId = roomId;
        this.day = day;
    }


    public void setState(Status state) {
        this.state = state;
    }

    public void setDay(Date day) {
        this.day = day;
    }

    public String getRoomId() {
        return roomId;
    }

    public Status getState() {
        return state;
    }

    public Date getDay() {
        return day;
    }


    //TODO attribut not available days
    //TODO attribut  available days  ---> allows to say ohh your at your Date for this room  is no more available




}
