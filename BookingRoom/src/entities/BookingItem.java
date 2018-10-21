package entities;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * Created by IntelliJ IDEA.
 * User: work
 * Date: 25.05.18
 * Time: 17:58
 * package : entities
 * Responsability of classe :
 */
public class BookingItem {

    private Date day;
    private String objectId;
    private String roomId;
    private String personId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Duration duration;





    public BookingItem(Date day, String roomId, String personId) {
        this.day = day;
        this.roomId = roomId;
        this.personId = personId;
    }

    public BookingItem(String roomId, String personId) {
        this.roomId = roomId;
        this.personId = personId;
    }




      //TODO constructor with ObjectId of ImmobilienObject and PersonId

    /*
    public BookingItem(String objectId, String personId) {

        this.objectId = objectId;
        this.personId = personId;
    }

*/
    public BookingItem(String roomId, String personId, LocalDateTime endTime, LocalDateTime startTime, Date day, Duration duration) {
        this.roomId = roomId;
        this.personId = personId;
        this.endTime = endTime;
        this.startTime = startTime;
        this.day = day;
        this.duration = duration;
    }


    public void setDay(Date day) {
        this.day = day;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    public Date getDay() {
        return day;
    }

    public String getRoomId() {
        return roomId;
    }

    public String getPersonId() {
        return personId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Duration getDuration() {
        return duration;
    }


    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getObjectId() {
        return objectId;
    }
}
