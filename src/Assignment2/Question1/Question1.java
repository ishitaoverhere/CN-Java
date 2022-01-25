package Assignment2.Question1;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sal;
        System.out.println("Enter your salary: ");
        sal = sc.nextInt();
        int taxAmt=0;
        if(sal<=50000)
        {
            taxAmt=0;
        }
        if(sal>50000 && sal<=60000)
        {
            taxAmt=(sal-50000)*10/100;
        }
        if(sal>60000 && sal<=150000)
        {
            taxAmt=(sal-50000)*20/100;
        }
        if(sal>150000)
        {
            taxAmt=sal*30/100;
        }

        System.out.println("The tax amount is: "+taxAmt);
    }
}
