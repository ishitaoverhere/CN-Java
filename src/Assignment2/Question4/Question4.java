package Assignment2.Question4;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args)
    {
        int n;
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number(Table to be calculated): ");
        int j = in.nextInt();
        System.out.print("Input number of terms : ");
        n = in.nextInt();

        System.out.println ("\n");
        for(j=0;j<=n;j++)
            System.out.println(n+" X "+j+" = " +n*j);
    }
}
