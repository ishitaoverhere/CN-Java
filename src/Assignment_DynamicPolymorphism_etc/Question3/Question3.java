package Assignment_DynamicPolymorphism_etc.Question3;

abstract class ThreeDObject{
    abstract int SurfaceArea(int h, int w, int l);
    abstract int volume(int h, int w, int l);
}
class Box extends ThreeDObject{
    int SurfaceArea(int h, int w, int l) {
        return (2*(h*w)+2*(h*l)+2*(w*l));
    }
    int volume(int h, int w, int l) {
        return (h*w*l);
    }
}
class Cube extends ThreeDObject{
    int SurfaceArea(int a,int b,int c) {
        return (6*a*b);
    }
    int volume(int a,int b,int c) {
        return (a*b*c);
    }
}
class Cone extends ThreeDObject{
    int SurfaceArea(int h,int r,int a) {
        return (int) (Math.PI*a*(r+Math.sqrt(Math.pow(h, 2)+Math.pow(r, 2))));
    }
    int volume(int h,int r,int a) {
        return (int) (Math.PI*a*r*(h/3));
    }
}
class Cylinder extends ThreeDObject{
    int SurfaceArea(int h,int r,int a) {
        return (int) (2*Math.PI*r*h+2*Math.PI*r*a);
    }
    int volume(int h,int r,int a) {
        return (int) (Math.PI*r*a*h);
    }
}
public class Question3 {
    public static void main(String args[])
    {
        ThreeDObject obj=new Box();
        ThreeDObject obj1=new Cube();
        ThreeDObject obj2=new Cone();
        ThreeDObject obj3=new Cylinder();
        System.out.println("Box surface area "+obj.SurfaceArea(10,20,30));
        System.out.println("Cube surface area "+obj1.SurfaceArea(10,10,10));
        System.out.println("Cone surface area "+obj2.SurfaceArea(10,20,20));
        System.out.println("Cylinder surface area "+obj3.SurfaceArea(10,20,20));
        System.out.println("Box volume " +obj.volume(10,20,30));
        System.out.println("Cube volume "+obj1.volume(10,10,10));
        System.out.println("Cone volume "+obj2.volume(10,20,20));
        System.out.println("Cylinder volume "+obj3.volume(10,20,20));
    }
}