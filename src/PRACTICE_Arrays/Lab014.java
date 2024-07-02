package PRACTICE_Arrays;

import java.util.Scanner;

public class Lab014 {
    public static void main(String[] args) {
         int number;
         int flag =0;

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number");
        number= sc.nextInt();

        if(number==0 || number==1)
            System.out.println("This is not a primenumber");

        else {

            int middlenumber=number/2;
            for(int i=2;i<=middlenumber;i++){

                if(number%i==0){
                    System.out.println(number+ "  not a prime number");
                    flag=1;
                    break;
                }
            }
        if(flag==0)
            System.out.println("Entered  is a prime number");
        }


    }
}
