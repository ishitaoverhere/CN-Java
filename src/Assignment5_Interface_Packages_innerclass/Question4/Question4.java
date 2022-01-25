package Assignment5_Interface_Packages_innerclass.Question4;

interface Mango{
    abstract public String Availability();
}
class Summer implements Mango{
    boolean Availability ;
    public Summer(boolean availability) {
        Availability = availability;
    }
    public String Availability() {
        return "Summer [Availability=" + Availability + "]";
    }
}
class Winter implements Mango{
    boolean Availability ;
    public Winter(boolean availability) {
        Availability = availability;
    }
    public String Availability() {
        return "Winter [Availability=" + Availability + "]";
    }
}

public class Question4 {
    public static void main(String args[]) {
        Mango obj=new Summer(true);
        Mango obj1=new Winter(false);
        System.out.println(obj.Availability());
        System.out.println(obj1.Availability());
    }
}
