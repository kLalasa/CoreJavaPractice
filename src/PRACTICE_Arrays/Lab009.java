package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        int num1, num2;

        System.out.println("Enter the number1");
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();

        System.out.println("Enter the number2");

        num2=sc.nextInt();

        int sum =num1+num2;

        System.out.println(sum);
    }
}
