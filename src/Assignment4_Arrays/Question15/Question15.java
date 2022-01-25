package Assignment4_Arrays.Question15;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char[] arr ={'c','s','i','n','f','o','3','6','0','.','c','o','m'};
        int i=0;
        int len=arr.length;//Calculating size of the string
        while(i<len) {
            System.out.print(arr[i]);
            i++;
        }
    }
}
