package Assignment_DynamicPolymorphism_etc.Question8;

import java.util.*;
class Item{
    int price; int code;
    Item(int m,int n){
        code=m; price=n;
    }
    void display(){
        System.out.print(code+" "+price);
        System.out.println();
    }
}
public class Question8 {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int a,c,sum=0;
        Item[] obj=new Item[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter Code :");
            c=sc.nextInt();
            System.out.println("Enter Price :");
            a=sc.nextInt();
            obj[i]=new Item(c,a);
        }
        for(int i=0;i<5;i++){
            sum=sum+obj[i].price;
        }
        System.out.println("Code Price ");
        for(int i=0;i<5;i++){
            obj[i].display();
        }
        System.out.println("Total Cost : " + sum);
    }
}
