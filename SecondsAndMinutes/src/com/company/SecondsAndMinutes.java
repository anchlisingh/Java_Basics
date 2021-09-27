package com.company;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static String getDurationString(int minutes, int seconds) {
        if(minutes >= 0 || (seconds >= 0 && seconds <=59))
        {
            int hours = minutes/60;
            int remainingMinutes = minutes%60;
            String formattedHours;
            String formattedMinutes;
            String formattedSeconds;
            if (hours < 10)
            {
                formattedHours = String.format("%02d", hours) ;

            }
            else
                formattedHours = String.valueOf(hours);

            if (remainingMinutes < 10)
            {
                formattedMinutes = String.format("%02d", remainingMinutes);
            }
            else
                formattedMinutes = String.valueOf(remainingMinutes);

            if (seconds < 10)
            {
                formattedSeconds = String.format("%02d", seconds) ;
            }
            else
                formattedSeconds = String.valueOf(seconds);

            String finalAns = formattedHours + " h " + formattedMinutes + " m "
                    + formattedSeconds + " s ";

            return finalAns;
        }
        else
            return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString(int seconds)
    {
        if(seconds >= 0)
        {
           int minutes = seconds/60;
           seconds = seconds%60;
        return getDurationString(minutes,seconds);
        }
        else
        return INVALID_VALUE_MESSAGE;
    }
}
