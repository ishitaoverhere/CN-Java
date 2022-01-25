package Assignment5_Interface_Packages_innerclass.Question6;

interface Exam_{
    public void percentCall();
}
class Student_{
    protected String name;
    protected int roll;
    protected int marks1;
    protected int marks2;
    public Student_(String name, int roll, int marks1, int marks2) {
        super();
        this.name = name;
        this.roll = roll;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }
    public String show() {
        return "Student [name=" + name + ", roll=" + roll + ", marks1=" + marks1 + ", marks2=" + marks2 + "]";
    }
}
class Result extends Student_ implements Exam_{
    int per;
    public Result(String name, int roll, int marks1, int marks2) {
        super(name, roll, marks1, marks2);
    }
    public void percentCall() {
        per=(marks1+marks2)/2;
        System.out.println("Percentage :"+per);
    }
    public String display() {
        return "Result [percentage=" + per + ", name=" + name + ", roll=" + roll + ", marks1=" + marks1 + ", marks2=" + marks2 + "]";
    }
}

public class Question6 {
    public static void main(String args[]) {
        Result obj=new Result("Ishita",35,85,90);
        obj.percentCall();
        System.out.println(obj.show());
        System.out.println(obj.display());
    }
}
