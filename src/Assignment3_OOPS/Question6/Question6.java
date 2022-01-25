package Assignment3_OOPS.Question6;

abstract class Person
{
    abstract void display();

}
class Employee extends Person
{
    int Emp_no;
    String Emp_name,add;

    Employee()
    {
        Emp_no=0;
        Emp_name=null;
        add=null;
    }
    void accept(int no,String n,String a)
    {
        Emp_no=no;
        Emp_name=n;
        add=a;
    }
    void display()
    {
        System.out.println("Emp_no= "+Emp_no);
        System.out.println("Emp_name= "+Emp_name);
        System.out.println("Address= "+add);
    }
}
class Worker extends Person
{
    int wh;
    String name;
    Worker()
    {
        wh=0;
        name=null;
    }
    void accept(String n,int h)
    {
        wh=h;
        name=n;
    }
    void display()
    {
        System.out.println("Worker’s name= "+name);
        System.out.println("Working hour= "+wh);
    }
}

public class Question6 {
    public static void main(String[] args)
    {
        Person p1; // abstract class

        Employee e1=new Employee();
        e1.accept(201,"Raj","Pune"); //parameter as Emp_no,Emp_Name,address)

        Worker m1=new Worker();
        m1.accept("Raj",8); //parameter as(Name,WorkingHours)

        System.out.println("\n———–Employee———–");
        p1=e1;
        p1.display();

        System.out.println("\n———–Worker———–");
        p1=m1; p1.display();
    }}