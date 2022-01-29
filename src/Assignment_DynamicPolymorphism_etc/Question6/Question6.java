package Assignment_DynamicPolymorphism_etc.Question6;
import java.util.*;
class Student{
    int roll,sub1,sub2;
    String name;
    int total;
    double per;
    void Initialize(int roll,String name,int sub1,int sub2){
        this.roll=roll;
        this.name=name;
        this.sub1=sub1;
        this.sub2=sub2;
    }
    void calculate(){
        total=sub1+sub2; per=total/2;
    }
    void display(){
        System.out.println("Name: "+ name);
        System.out.println("Roll number: "+roll);
        System.out.println("Marks of two subject: "+ sub1+" "+sub2);
        System.out.println("Total : "+total+"\nPercentage: "+per);
    }
}
public class Question6 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String n=sc.nextLine();
        System.out.println("Enter your Roll number:");
        int r=sc.nextInt();
        System.out.println("Enter the marks of two subject:");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        Student a=new Student();
        a.Initialize(r,n,s1,s2);
        a.calculate();
        a.display();
    }
}
