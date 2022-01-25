package com.Assignment1.Question5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();

        if(Math.abs(a - b) >= 20){
            System.out.println("true");
        }
        else if(Math.abs(b - c) >= 20){
            System.out.println("true");
        }
        else if(Math.abs(c - a) >= 20){
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
