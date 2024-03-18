package practice01;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int revnum=0;
        int temp;
        temp=num;

        while(num!=0){

            int remainder = num % 10;
            revnum = revnum * 10 + remainder;
            num = num / 10;
        }

        if(temp==revnum){
            System.out.println("number is a palindrome");
        }else{
            System.out.println("Its nt a palindrome");
        }
    }
}
