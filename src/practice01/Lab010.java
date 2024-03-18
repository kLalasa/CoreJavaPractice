package practice01;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        String Original, rev = "";
        Scanner sc = new Scanner(System.in);
        Original = sc.nextLine();

        int Length = Original.length();
        System.out.println(Length);
        for (int i = Length - 1; i >= 0; i--) {
            rev = rev + Original.charAt(i);
        }
        if (Original.equalsIgnoreCase(rev))
            System.out.println("Its a palindrome");

        else {
            System.out.println("Its nt a Palindrome");
        }
    }
}