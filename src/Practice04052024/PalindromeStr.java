package Practice04052024;

import java.util.Scanner;

public class PalindromeStr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any String");

        String str= sc.next();

        String str_org= str;
        String rev="";

        int len=str.length();

        for(int i=len-1;i>=0;i--){

            rev= rev+str.charAt(i);


        }

        if(rev.equalsIgnoreCase(str_org)){
            System.out.println("Its a palindrome string");
        }
        else {
            System.out.println("Not a palindrome string");
        }
    }
}
