package Assignment10_DateAPI.Question5;

import java.util.Calendar;

public class Q5 {
    public static void main(String[] args)
    {
        //Gets a calendar using the default time zone and locale.
        Calendar calendar = Calendar.getInstance();
        System.out.println();
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println();
    }
}
