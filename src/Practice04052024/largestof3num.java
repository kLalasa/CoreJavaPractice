package Practice04052024;

import java.util.Scanner;

public class largestof3num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int a= sc.nextInt();

        System.out.println("Enter the second number");
        int b= sc.nextInt();

        System.out.println("Enter the third number");
        int c= sc.nextInt();

//        if(a>b && a>c){
//            System.out.println("a is the largest number");
//
//        }
//        else if(b>a && b>c){
//            System.out.println("b is the largest number");
//
//        }
//        else
//            System.out.println("c is the largest");


//        int lar1= a>b?a:b;
//        int lar2=c>lar1?c:lar1;
//        i
        int largest= c>(a>b?a:b)?c:(a>b?a:b);

        System.out.println(largest);
    }
}
