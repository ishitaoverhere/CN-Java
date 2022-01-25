package Assignment3_OOPS.Replacement_5;

import java.util.Scanner;

class area{
    int length;
    int breadth;
    area(int a, int b)
    {
        length = a;
        breadth = b;
    }
    public int areareturn()
    {
        return length * breadth;
    }
}
public class Question5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter length");
        a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter breadth");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.areareturn());
    }
}
