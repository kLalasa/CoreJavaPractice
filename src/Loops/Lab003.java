package Loops;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter any number");
        int a =sc.nextInt();

        if(a%2 ==1) {
            System.out.println("Its an odd number");
        }else{
                System.out.println("Its even number");
            }
        }
    }
