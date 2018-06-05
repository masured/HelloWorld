package fr.dmas.ocrexamples.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime {
    public static String getTime() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(cal.getTime());
    }
}
