package MiniProject_trials;
import java.util.Scanner;
class Course{
    String[] Course = {"JAVA","Web Designing","Selenium"};
    int[] courseid = {110,101,111};
    int days=30;
    int fees=50000;

    void details() {
        System.out.println("Courses offered : ");
        for(String s:Course) {
            System.out.println(s);
        }
    }

}

class Student{
    String StudentName;
    String CourseName;
    String date;

    Scanner sc=new Scanner(System.in);

    void takeValues() {
        System.out.println("\nEnter your name : ");
        StudentName=sc.nextLine();
        System.out.println("Enter the course you need : ");
        CourseName=sc.nextLine();
        System.out.println("Enter the joining date : ");
        date=sc.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Course obj1=new Course();
        Student obj2=new Student();

        obj1.details();
        obj2.takeValues();

        System.out.println();
        System.out.println("Details : ");
        System.out.println("Student Name : "+obj2.StudentName);
        System.out.println("Course Enquired : "+obj2.CourseName);
        System.out.println("Training Days : "+obj1.days);
        System.out.println("Fees : "+obj1.fees);
        System.out.println("Joining date : "+obj2.date);
    }
}
