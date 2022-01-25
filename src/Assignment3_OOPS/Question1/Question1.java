package Assignment3_OOPS.Question1;

import java.util.Scanner;

class Bank
{
    int accNo;
    String name = null;
    int balance;

    void setData(int a, String n, int b)
    {
        accNo = a;
        name = n;
        balance = b;
    }

    void deposit(int amt)
    {
        balance=balance+amt;
    }

    void withdraw(int amt)
    {
        if(amt>balance)
        {
            System.out.println("Insufficient fund");
        }
        balance=balance-amt;
    }

    void display()
    {
        System.out.println("Your acc no. "+accNo);
        System.out.println("Your name is "+name);
        System.out.println("Balance: "+balance);
    }
}
public class Question1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        Bank bl = new Bank();
        bl.setData(10001,"Rahul",10000);
        bl.deposit(5000);
        bl.withdraw(3000);
        bl.display();
    }
}
