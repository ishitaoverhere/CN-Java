package Assignment5_Interface_Packages_innerclass.Question3;

interface Gross{
    public String details();
}
class Employee1{
    protected String EmployeeName;
    public Employee1(String name) {
        super();
        this.EmployeeName = name;
    }
}
class Salary extends Employee1 implements Gross{
    int sal;
    public Salary(String name, int sal) {
        super(name); this.sal = sal;
    }
    @Override
    public String details() {
        return "Salary [Salary=" + sal + ", EmployeeName=" + EmployeeName + "]";
    }
}

public class Question3 {
    public static void main(String args[]) {
        Gross obj=new Salary("Ishita",80000);
        System.out.println(obj.details());
    }

}
