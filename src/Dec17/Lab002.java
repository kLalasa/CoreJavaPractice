package Dec17;

import java.util.Scanner;

public class Lab002 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks =sc.nextInt();

        if(marks>=90 && marks<=100){
            System.out.println("You got Grade--A");
            } else if (marks>=80 && marks<=89) {
            System.out.println("You got Grade--B");
            
        } else if (marks>=70 && marks<=79) {
            System.out.println("You got Grade --C");

        } else if (marks>=60 && marks<=69) {
            System.out.println("You got Grade--D");

        } else if (marks>=50 && marks<=59) {
            System.out.println("You got Grade--E");

        }else {
            System.out.println("You got Grade--F");
        }
    }
}
