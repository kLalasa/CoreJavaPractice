package practice01;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str_rev = "";

        int length=str.length();

        for (int i=length-1; i >=0; i--) {
            str_rev = str_rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(str_rev.toLowerCase())) {
            System.out.println("Its a palindrome");
        } else {
            System.out.println("Its not a palindrome");
        }

    }
}
