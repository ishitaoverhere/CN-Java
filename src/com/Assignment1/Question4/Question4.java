package com.Assignment1.Question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();

        boolean abc = true;

        System.out.println("Result: "+myFunction(a, b, c, true));
    }
    public static boolean myFunction(int p, int q, int r, boolean abc)
    {
           if(abc)
               return (r > q);
           return (q > p && r > q);
    }
}
