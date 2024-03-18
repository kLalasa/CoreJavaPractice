package practice01;

import java.util.Scanner;

public class Lab008 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int revnum=0;


        while(num!=0){
            int remainder=revnum*10;
            revnum=remainder+num%10;
            num=num/10;
        }
        System.out.println(revnum);
    }
}
