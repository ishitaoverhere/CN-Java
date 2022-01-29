package Assignment6_Strings_exception.Question5;

import java.util.HashMap;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args)
    {
        String str;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String : ");
        str=in.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++) {
            if(hmap.containsKey(str.charAt(i))) {
                count = hmap.get(str.charAt(i));
                hmap.replace(str.charAt(i),++count);
            }
            else
                hmap.put(str.charAt(i),1);
        }

        for(char ch: hmap.keySet()) {

            if(ch==' ')
                System.out.println("-:"+hmap.get(ch));

            else
                System.out.println(ch+":"+hmap.get(ch));
        }
    }
}
