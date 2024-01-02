package Dec17;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float x= sc.nextFloat();
        float y=sc.nextFloat();
        float z= sc.nextFloat();

        float A=x*x;
        float B=y*y;
        float C=Math.abs(z);

        float d=A+B+C;
        double e=Math.pow(d,1f/3f);
        System.out.println("result is " +e);
    }
}
