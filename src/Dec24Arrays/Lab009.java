package Dec24Arrays;

import java.util.Scanner;

//A year is a leap year if the following conditions are satisfied:

//The year is multiple of 400.
//The year is a multiple of 4 and not a multiple of 100.

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year");
        int year= sc.nextInt();

        if(((year%4==0)&&!(year%100==0)) || (year%400==0))
            System.out.println("Leap year");
        else
            System.out.println("Not a leap year");
    }
}
