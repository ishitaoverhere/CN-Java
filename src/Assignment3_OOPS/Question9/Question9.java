package Assignment3_OOPS.Question9;

class student{
    String ss;
    String name;
    public student(String ss){
        name = ss;
    }
    public student()
    {
        name = "unknown";
    }
}
public class Question9 {
    public static void main(String[] args) {
        student obj = new student();
        obj.ss = "Vivek";
        System.out.println(obj.ss);
        System.out.println(obj.name);

    }
}
