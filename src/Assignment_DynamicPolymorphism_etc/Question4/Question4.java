package Assignment_DynamicPolymorphism_etc.Question4;

class Parent {
    public static void sleep() {
        System.out.println("Sleeps at 11 PM");
    }
}
class Child extends Parent {
    public static void sleep() {
        System.out.println("Sleeps at 9 PM");
    }
}
public class Question4 {
    public static void main(String[] args) {
        Parent p;
        p = new Parent();
        Parent c = new Child();
        p.sleep();
        c.sleep();
    }
}