package Dec30;

import java.util.Scanner;

public class Lab009 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number a ");
        int a= sc.nextInt();
        System.out.println("Enter the number b");
        int b=sc.nextInt();

        int temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a"  + a);
        System.out.println("Value of b" + b);
    }
}
