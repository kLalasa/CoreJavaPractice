package Practice04052024;

import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int num=sc.nextInt();
        int rev=0;

//        while(num!=0){
//
//            rev=rev*10+num%10;
//            num=num/10;
//        }
//        System.out.println(rev);


//        StringBuffer sb=new StringBuffer(String.valueOf(num));
//
//        StringBuffer rev1=sb.reverse();
//        System.out.println(rev1);

        StringBuilder sb=new StringBuilder();
        sb.append(num);
        StringBuilder rev2= sb.reverse();
        System.out.println(rev2);



    }
}
