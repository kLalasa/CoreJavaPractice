package Dec23;

import java.util.Scanner;

public class Lab001 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of x ");

        double x=sc.nextDouble();

        System.out.println("Enter the value of Y");
        double Y= sc.nextDouble();

        System.out.println("Enter the value of Z ");
        double Z=sc.nextDouble();

        double result=0;

        result= Math.cbrt(Math.pow(x,2)+Math.pow(Y,2)-Math.abs(Z));
        System.out.println(result);

        sc.close();


    }
}
