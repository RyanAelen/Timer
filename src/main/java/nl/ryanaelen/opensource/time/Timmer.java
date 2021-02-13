package nl.ryanaelen.opensource.time;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Timmer {
    LocalTime gotoTime;

    public Timmer(LocalTime gotoTime) {
        this.gotoTime = gotoTime;
    }

    String getTimeLeftString(LocalTime now) {
        return getTimeFormat(getTimeBetwean(now, gotoTime));
    }

    public String getTimeLeftString() {
        return getTimeLeftString(LocalTime.now());
    }

    String getTimeFormat(LocalTime time) {
        return time.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM));
    }

    LocalTime getTimeBetwean(LocalTime start, LocalTime end) {
        return end.minusSeconds(start.toSecondOfDay());
    }

}
