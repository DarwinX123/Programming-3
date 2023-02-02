import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) throws DateException {
        Calendar calendar = new GregorianCalendar();
        calendar.setLenient(false);
        calendar.set(year, month-1, day);
        try {
            calendar.getTime();
        } catch (IllegalArgumentException e) {
            throw new DateException("Illegal date " + day + "." + month + "." + year);
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String toString() {
        return String.format("%02d.%02d.%04d", day, month, year);
    }
}
