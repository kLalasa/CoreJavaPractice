package Dec17;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int  number=sc.nextInt();

        if(number>20){
            System.out.println("Number is greater than 20");
            
        } else if (number>10) {
            System.out.println("Number is greater than 10");
            
        }else {
            System.out.println("number is less than 10");
        }
    }
}
