package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab010 {
    public static void main(String[] args) {
        int count;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the count");
        count= sc.nextInt();
        int sum=0;
        int number;

        for(int i=0;i<count;i++){

            System.out.println("Enter the numbers");
            number=sc.nextInt();
            sum=sum+number;

        }

        System.out.println("Sum of numbers " +sum);
    }
}
