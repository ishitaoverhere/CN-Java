package Assignment10_DateAPI.Question9;

import java.time.Year;

public class Q9 {
    public static void main(String[] args) {

        //Current year
        Year yr = Year.now();
        //given year
        //Year yr = Year.of(2001);
        System.out.println("\nCurrent Year: " + yr);
        boolean isLeap = yr.isLeap(); // false
        System.out.println("Is current year leap year? " + isLeap);
        int length = yr.length(); // 365
        System.out.println("Length of the year: " + length+" days\n");
    }
}
