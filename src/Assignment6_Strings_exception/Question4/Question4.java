package Assignment6_Strings_exception.Question4;

public class Question4 {
    public static void main(String[] args) {
        int arr[];
        try {
            arr=new int[-10];
        }
        catch(NegativeArraySizeException f){
            System.out.println("Exception "+f);
        }
        int a=50;
        try{
            int sum=a/0;
        }
        catch(ArithmeticException e){
            System.out.println("Exception: "+e);
        }
    }

}
