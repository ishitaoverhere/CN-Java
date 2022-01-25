package Assignment5_Interface_Packages_innerclass.Question1;

abstract class Vechicle{
    protected int ID;
    protected String name;
    protected String LicenseNumber;
    public Vechicle(int iD, String name, String licenseNumber) {
        ID = iD;
        this.name = name;
        LicenseNumber = licenseNumber;
    }
    abstract public String display();
}
class Two_Wheeler extends Vechicle{
    int SteeringHandle;
    public Two_Wheeler(int iD, String name, String licenseNumber, int steeringHandle) {
        super(iD, name, licenseNumber);
        SteeringHandle = steeringHandle;
    }
    @Override
    public String display() {
        return "Two_Wheeler [SteeringHandle=" + SteeringHandle + ", ID=" + ID + ", name=" + name + ", LicenseNumber=" + LicenseNumber + "]";
    }
}
class Four_Wheeler extends Vechicle{
    int SteeringWheel;
    public Four_Wheeler(int iD, String name, String licenseNumber, int steeringWheel) {
        super(iD, name, licenseNumber); SteeringWheel = steeringWheel;
    }
    public String display() {
        return "Four_Wheeler [SteeringWheel=" + SteeringWheel + ", ID=" + ID + ", name=" + name + ", LicenseNumber=" + LicenseNumber + "]";
    }
}

public class Question1 {
    public static void main(String args[]) {
        Vechicle obj=new Two_Wheeler(1011,"Hero Splender","WBIO0897",1);
        Vechicle obj1=new Four_Wheeler(1011,"Hyundai i10","WBIO4547",1);
        System.out.println(obj.display());
        System.out.println(obj1.display());
    }
}