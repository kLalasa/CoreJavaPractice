package Jan06_strings;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string");
        String str= sc.nextLine();
        String rev="";
        int length=str.length();
        for(int i=length-1;i>=0;i--){
            rev=rev+str.charAt(i);

        }
        if(str.equalsIgnoreCase(rev)) {
            System.out.println("Is a Palindrome");

        }
        else{
                System.out.println("Not a Palindrome");
            }
        }
    }

