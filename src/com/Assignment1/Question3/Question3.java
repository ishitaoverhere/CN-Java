package com.Assignment1.Question3;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        if(a == b)
            System.out.println(a+" == "+b);
        if(a != b)
            System.out.println(a+" != "+b);
        if(a < b)
            System.out.println(a+" < "+b);
        if(a > b)
            System.out.println(a+" > "+b);
        if(a <= b)
            System.out.println(a+" <= "+b);
        if(a >= b)
            System.out.println(a+" >= "+b);
    }
}
