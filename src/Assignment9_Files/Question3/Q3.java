package Assignment9_Files.Question3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;

public class Q3 {

    public static void main(String[] args){
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        StringBuilder str_data = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader("/home/students/test.txt"));
            while (strLine != null)
            {
                if (strLine == null)
                    break;
                str_data.append(strLine);
                strLine = br.readLine();

            }
            System.out.println(str_data);
            br.close();
        } catch (FileNotFoundException e) {
            System.err.println("File not found");
        } catch (IOException e) {
            System.err.println("Unable to read the file.");
        }
    }
}