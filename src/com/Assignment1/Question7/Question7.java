package com.Assignment1.Question7;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value");
        int num = sc.nextInt();
        //num = 567

        int ones = num % 10;//ones = 7
        int rem = num / 10;//rem = 56
        int tens = rem % 10;//tens = 6
        rem = rem / 10;//rem = 5
        int hundredth = rem % 10;//hundredth = 5
        rem = rem / 10;
        int thousandth = rem % 10;

        int sum = ones + tens + hundredth + thousandth;//5+6+7 = 18

        System.out.println("Sum of the digits is: "+sum);
    }
}
