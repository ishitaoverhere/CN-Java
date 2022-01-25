package Assignment3_OOPS.Question3;

class Student{
    String name;
    int roll_no;
}
public class Question3 {
    public static void main(String[] args)
    {
        Student s = new Student();
        s.name = "Ishita Jain";
        s.roll_no = 23;
        System.out.println("Name is "+s.name+" and roll number is "+ s.roll_no);
    }
}
