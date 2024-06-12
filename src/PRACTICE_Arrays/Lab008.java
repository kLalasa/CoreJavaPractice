package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number of elements");

        int n=sc.nextInt();

        int[] arr=new int[10];
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }


        for(int i=0;i<n;i++) {

            System.out.println(arr[i]);
        }

    }



}
