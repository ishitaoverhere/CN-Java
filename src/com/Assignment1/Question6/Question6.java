package com.Assignment1.Question6;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        float fahrenheit, celsius;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextFloat();
        celsius = ((fahrenheit - 32)*5)/9;
        System.out.println("Temperature in Celsius is: "+celsius);
    }
}
