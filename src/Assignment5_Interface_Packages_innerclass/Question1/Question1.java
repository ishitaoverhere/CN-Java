package Assignment5_Interface_Packages_innerclass.Question1;

abstract class Vehicle {
    protected int ID;
    protected String name;
    protected String LicenseNumber;
    public Vehicle(int iD, String name, String licenseNumber) {
        ID = iD;
        this.name = name;
        LicenseNumber = licenseNumber;
    }
    abstract public String display();
}
class Two_Wheeler extends Vehicle {
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
class Four_Wheeler extends Vehicle {
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
        Vehicle obj=new Two_Wheeler(1011,"Hero Splendor","WBIO0897",1);
        Vehicle obj1=new Four_Wheeler(1011,"Hyundai i10","WBIO4547",1);
        System.out.println(obj.display());
        System.out.println(obj1.display());
    }
}