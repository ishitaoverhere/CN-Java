package Assignment2.Question2;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args){
        int a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,
                evenCount=0, oddCount=0,
                evenSum=0, oddSum=0;
        double evenAvg, oddAvg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value at a1");
        a1 = sc.nextInt();
        System.out.println("Enter value at a2");
        a2 = sc.nextInt();
        System.out.println("Enter value at a3");
        a3 = sc.nextInt();
        System.out.println("Enter value at a4");
        a4 = sc.nextInt();
        System.out.println("Enter value at a5");
        a5 = sc.nextInt();
        System.out.println("Enter value at a6");
        a6 = sc.nextInt();
        System.out.println("Enter value at a7");
        a7 = sc.nextInt();
        System.out.println("Enter value at a8");
        a8 = sc.nextInt();
        System.out.println("Enter value at a9");
        a9 = sc.nextInt();
        System.out.println("Enter value at a10");
        a10 = sc.nextInt();

        if(a1%2==0) { evenCount++; evenSum=evenSum+a1; }
        else { oddCount++; oddSum=oddSum+a1; }

        if(a2%2==0) { evenCount++; evenSum=evenSum+a2; }
        else { oddCount++; oddSum=oddSum+a2; }

        if(a3%2==0) { evenCount++; evenSum=evenSum+a3; }
        else { oddCount++; oddSum=oddSum+a3; }

        if(a4%2==0) { evenCount++; evenSum=evenSum+a4; }
        else { oddCount++; oddSum=oddSum+a4; }

        if(a5%2==0) { evenCount++; evenSum=evenSum+a5; }
        else { oddCount++; oddSum=oddSum+a5; }

        if(a6%2==0) { evenCount++; evenSum=evenSum+a6; }
        else { oddCount++; oddSum=oddSum+a6; }

        if(a7%2==0) { evenCount++; evenSum=evenSum+a7; }
        else { oddCount++; oddSum=oddSum+a7; }

        if(a8%2==0) { evenCount++; evenSum=evenSum+a8; }
        else { oddCount++; oddSum=oddSum+a8; }

        if(a9%2==0) { evenCount++; evenSum=evenSum+a9; }
        else { oddCount++; oddSum=oddSum+a9; }

        if(a10%2==0) { evenCount++; evenSum=evenSum+a10; }
        else { oddCount++; oddSum=oddSum+a10; }

        System.out.println("Odd sum is: "+oddSum);
        System.out.println("Even sum is: "+evenSum);

        oddAvg = oddSum/oddCount;
        evenAvg = evenSum/evenCount;

        System.out.println("Odd average is: "+oddAvg);
        System.out.println("Even average is: "+evenAvg);
    }
}
