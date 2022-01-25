package Assignment4_Arrays.Question11;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] care)
    {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] f = new int[10];
        for(i=0; i<10; i++)
        {
            System.out.println("Enter number: ");
            f[i]=sc.nextInt();
        }
        for(i=0; i<10; i++)
        {
            System.out.println(f[i]);
        }
    }
}
