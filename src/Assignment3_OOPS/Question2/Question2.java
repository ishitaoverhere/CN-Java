package Assignment3_OOPS.Question2;

class Clock
{
    int hours, minutes, seconds;
    Clock(int h, int m, int s)
    {
        hours=h;
        minutes=m;
        seconds=s;
    }

    void isTimeValid()
    {
        if(hours>=0 && hours<24 && minutes>0 && minutes<60 && seconds>0 && seconds<60){
            System.out.println("Time is valid");
        }
        else {
            System.out.println("Time is not valid");
        }
    }

    void setTimeMode()
    {
        if(hours<12){
            System.out.println("Time = "+hours+":"+minutes+":"+seconds+" AM");
        }
        else{
            System.out.println("Time = "+(hours-12)+":"+minutes+":"+seconds+" PM");
        }
    }
}
public class Question2 {
    public static void main(String[] args)
    {
        Clock c1 = new Clock(16,34,45);
        c1.isTimeValid();
        c1.setTimeMode();
    }
}
