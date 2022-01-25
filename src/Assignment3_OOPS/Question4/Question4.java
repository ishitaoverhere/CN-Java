package Assignment3_OOPS.Question4;

import java.util.Scanner;

class Area
{
    float length, breadth, area;
    void set_values(float length, float breadth)
    {
        this.length = length;
        this.breadth = breadth;
        area = this.length * this.breadth;
    }
    float get_Area()
    {
        return area;
    }
}
public class Question4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Area ar = new Area();
        float l,b;
        System.out.println("Enter the length of rectangle : ");
        l=sc.nextFloat();
        System.out.println("Enter breadth of rectangle : ");
        b=sc.nextFloat();
        ar.set_values(l, b);
        System.out.println("Area of rectangle is = " +ar.get_Area());
    }
}
