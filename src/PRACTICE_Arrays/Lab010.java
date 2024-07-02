package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
       int count;
       int number;
       int sum=0;

       Scanner sc= new Scanner(System.in);
        System.out.println("enter the count of numbers ");



       count=sc.nextInt();

        System.out.println("Enter the numbers in Array ");

       for(int i=0;i<count;i++){


           number=sc.nextInt();
           sum =sum+number;
       }

        System.out.println("sum of all the number "  +sum);
    }
}
