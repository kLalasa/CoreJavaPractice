package Dec23;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any  number");
        int num= sc.nextInt();

        long fact=1;
       /* int i=1;
        while(i<=num){
            fact=fact*i;
            i++;
        }*/
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}
