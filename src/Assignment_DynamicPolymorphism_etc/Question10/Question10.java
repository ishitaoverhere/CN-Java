package Assignment_DynamicPolymorphism_etc.Question10;

class Amt{
    Double x;
    Double sum=1000.0;
    Amt(Double x){
        this.x=x;
    }
    void interest(){
        System.out.println("Years ....... future_value");
        for(int i=1;i<=30;i++){
            System.out.println(i+". ...... "+sum(x,0.09/12,i));
        }
    }
    Double sum(Double tot,double rate,int years){
        return x*Math.pow(1+rate,years*12);
    }
}
public class Question10{
    public static void main(String[] args) {
        Amt ob=new Amt(100.0);
        ob.interest();
    }
}
