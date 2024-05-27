package Practice04052024;

import java.util.Scanner;

public class PalindromeNum {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number");
        int num= sc.nextInt();

        int num_org=num;

        int rev=0;

        while (num!=0){

            rev=rev*10+num%10;
            num=num/10;
        }

        if(rev==num_org){
            System.out.println("Its a palindrome");

        }
        else {
            System.out.println("Its not a palindrome");
        }
    }
}
