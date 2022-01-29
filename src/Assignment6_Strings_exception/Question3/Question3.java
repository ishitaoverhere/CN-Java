package Assignment6_Strings_exception.Question3;

import java.util.Objects;

class NoMatchFoundException extends Exception{
    NoMatchFoundException(String s){
        super(s);
    }
}
public class Question3 {
    public static void Match(String z) throws NoMatchFoundException{
        if(!Objects.equals(z, "University")){
            throw new NoMatchFoundException("NoMatchFoundException Gen");
        }
    }
    public static void main(String[] args){
        String z="abc";
        try {
            Match(z);
        }
        catch (Exception e) {
            System.out.println(e);
        }
        System.out.print("Rest Code");
    }
}
