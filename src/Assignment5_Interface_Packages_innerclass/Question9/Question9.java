package Assignment5_Interface_Packages_innerclass.Question9;

class Circle
{
    double r;
    void area()
    {
        System.out.println("Area of the circle = " + (3.14 * r * r));
    }
}
class Square
{
    double s;
    void area()
    {
        System.out.println("Area of the Square = " + (s * s));
    }
}
class Rectangle
{
    double l,b;
    void area()
    {
        System.out.println("Area of the circle = " + (l * b));
    }
}

public class Question9 {
    public static void main(String a[])
    {
        Circle c = new Circle();
        c.area();
    }
}
