package Assignment10_DateAPI.Question10;

import java.time.LocalDate;
import java.time.Month;

public class Q10 {
    public static void main(String[] args) {

        // information about the month
        LocalDate ldt = LocalDate.of(2016, Month.FEBRUARY, 10);
        Month mn = ldt.getMonth(); // FEBRUARY
        int mnIntValue = mn.getValue(); // 2
        int minLength = mn.minLength(); // 28
        int maxLength = mn.maxLength(); // 29
        Month firstMonthOfQuarter = mn.firstMonthOfQuarter(); // JANUARY
        System.out.println("\nInteger value of the current month: " + mnIntValue);
        System.out.println("Length of the month: " + minLength);
        System.out.println("Maximum length of the month: " + maxLength);
        System.out.println("First month of the Quarter: " + firstMonthOfQuarter+"\n");
    }
}
