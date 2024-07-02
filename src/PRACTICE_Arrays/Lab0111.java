package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab0111 {

    public static void main(String[] args) {
        int count;
        int number;
        float  avg=0;
        int sum=0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the count of numbers");
        count= sc.nextInt();

        System.out.println("Enter the numbers");
        for(int i=0;i<count;i++)
        {
            number=sc.nextInt();
            sum=sum+number;
            avg=sum/count;

        }

        System.out.println("Sum of the numbers " +sum);
        System.out.println(avg);
    }
}
