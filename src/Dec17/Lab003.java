package Dec17;

import java.util.Scanner;

public class Lab003 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        if((a==b) && (b==c)&&(c==a)){
            System.out.println("This is equilateral triangle");
        } else if ((a==b) ||(b==c)||(c==a)) {
            System.out.println("This is an isosceles triangle");
        } else{
                System.out.println("This is scalene ");
            }
            
        }
    }

