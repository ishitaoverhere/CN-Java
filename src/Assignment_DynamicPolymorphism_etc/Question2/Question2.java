package Assignment_DynamicPolymorphism_etc.Question2;

import java.util.Scanner;

class num {
    public void showNum(int n)
    {

        System.out.println("\nYou have entered : "+n);
    }
}

class hexNum extends num {
    public void showNum(int n)
    {
        System.out.println("Hexadecimal value : " + Integer.toHexString(n));
    }
}

public class Question2 {
    public static void main(String[] args)
    {
        int n;
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num g1 = new num();
        g1.showNum(n);
        hexNum g = new hexNum();
        g.showNum(n);
    }
}