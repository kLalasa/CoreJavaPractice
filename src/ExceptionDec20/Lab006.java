package ExceptionDec20;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Lab006 {
    public static void main(String[] args) {
        try{
            PrintWriter pw;
            pw=new PrintWriter("abc.txt");
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
        System.out.println("File saved");
    }
}
