package Assignment5_Interface_Packages_innerclass.Question5;

interface Exam{
    abstract public String markSheet();
}
class Student_Exam{
    protected String name;
    public Student_Exam(String name) {
        super();
        this.name = name;
    }
    public void get()
    {

    }
}
class Results extends Student_Exam implements Exam{
    int percent;
    public Results(String name, int percent) {
        super(name);
        this.percent = percent;
    }
    public String markSheet() {
        return "Result [percentage=" + percent + ", name=" + name + "]";
    }
}

public class Question5 {
    public static void main(String[] args) {
        Exam obj=new Results("Ishita",97);
        System.out.println(obj.markSheet());
    }
}
