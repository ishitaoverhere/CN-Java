package Assignment_DynamicPolymorphism_etc.Question1;

import java.io.*;
class staff
{
    String code,name;
    void getStaff()
    {
        try{
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Code : ");
            System.out.flush();
            code=obj.readLine();

            System.out.print("Enter Name : ");
            System.out.flush();
            name=obj.readLine();
        }
        catch(Exception e)
        {    }
    }
    void displayStaff()
    {
        System.out.println("\nCODE :  "+code);
        System.out.println("NAME  :  "+name);
    }
}
class teacher extends staff
{
    String subject,publication;
    void getTeacher()
    {
        getStaff();
        try{
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Subject : ");
            System.out.flush();
            subject=obj.readLine();
            System.out.print("Enter Publication : ");
            System.out.flush();
            publication=obj.readLine();
        }
        catch (Exception e)
        {    }
    }

    void displayTeacher()
    {
        displayStaff();
        System.out.println("SUBJECT :  "+subject);
        System.out.println("PUBLICATION  :  "+publication);
    }
}
class typist extends staff
{
    String speed;
    void getTypist()
    {
        getStaff();
        try{
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Speed : ");
            System.out.flush();
            speed=obj.readLine();
        }
        catch(Exception e)
        {    }
    }

    void displayTypist()
    {
        displayStaff();
        System.out.println("SPEED :  "+speed);
    }
}

class officer extends staff
{
    String grade;
    void getOfficer()
    {
        getStaff();
        try{
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Grade : ");
            System.out.flush();
            grade=obj.readLine();
        }
        catch(Exception e)
        {    }
    }

    void displayOfficer()
    {
        displayStaff();
        System.out.println("GRADE :  "+grade);
    }
}
<<<<<<< HEAD
=======
class regular extends typist
{
}
>>>>>>> origin/master

class casual extends typist
{
    String wages;
    void getCasual()
    {
        getTypist();
        try
        {
            BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter Daily Wages : ");
            System.out.flush();
            wages=obj.readLine();
        }
        catch(Exception e)
        { }
    }
    void displayCasual()
    {
        displayTypist();
        System.out.println("WAGES :  "+wages);
    }
}

public class Question1
{
    public static void main(String[] args)
    {
        int choice=1;
        String str;
        while(choice!=0){
            System.out.println("\n\nChoose Your Choice...");
            System.out.println("1) Teacher Details");
            System.out.println("2) Typist Details ");
            System.out.println("3) Officer Details");
            System.out.println("Press 0 (ZERO) to exit ");
            System.out.print("Enter your choice :  ");
            System.out.flush();
            try{
                BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
                str=obj.readLine();
                choice=Integer.parseInt(str);
            }catch(Exception e) {}

            if(choice==0)
            {
                System.out.println("\n\nThanks for Visiting\nDo Visit next time....\n");
                System.exit(1);
            }

            switch (choice) {
                case 1 -> {
                    System.out.println("\n=====TEACHER DETAILS=====");
                    System.out.println("\nInputting Data");
                    teacher obj_teacher = new teacher();
                    obj_teacher.getTeacher();
                    System.out.println("\nDisplaying Data");
                    obj_teacher.displayTeacher();
                }
                case 2 -> {
                    System.out.println("\n=====TYPIST DETAILS=====\n");
                    System.out.println("\nInputting Data");
                    casual obj_casual = new casual();
                    obj_casual.getCasual();
                    System.out.println("\nDisplaying Data");
                    obj_casual.displayCasual();
                }
                case 3 -> {
                    System.out.println("\n=====OFFICER DETAILS=====\n");
                    System.out.println("\nInputting Data");
                    officer obj_officer = new officer();
                    obj_officer.getOfficer();
                    System.out.println("\nDisplaying Data");
                    obj_officer.displayOfficer();
                }
            }
        }
    }
}

