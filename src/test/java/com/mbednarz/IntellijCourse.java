package com.mbednarz;

import java.time.ZonedDateTime;
import java.util.Objects;

/**
 * @author mbednarz
 * @created 18/02/2020 - 13:52
 * @project Selenium3Course
 */

public class IntellijCourse
{
    private String message;
    private ZonedDateTime timestamp;

    public IntellijCourse(String message, ZonedDateTime timestamp) {
        this.message = message;
        this.timestamp = timestamp;
    }

    public IntellijCourse() {}

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ZonedDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(ZonedDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "IntellijCourse {" +
                "message = '" + message + '\'' +
                ", timestamp = " + timestamp +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntellijCourse that = (IntellijCourse) o;
        return message.equals(that.message) &&
                timestamp.equals(that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(message, timestamp);
    }
}
