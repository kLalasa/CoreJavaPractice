package Loops;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the numbers a and b ");
        int a = sc.nextInt();
        int b=sc.nextInt();

        if(a>b){
            System.out.println("Max is" +a);
        }else {
            System.out.println("Max is" +b);
        }
    }
}
