package Dec24Arrays;

import java.util.Scanner;

public class Lab006 {
    public static void main(String[] args) {
        float[] marks= new float[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first subject");
        marks[0]= sc.nextFloat();
        System.out.println("Enter the second subject");
        marks[1]= sc.nextFloat();
        System.out.println("Enter the third subject");
        marks[2]= sc.nextFloat();
        System.out.println("Enter the fourth subject");
        marks[3]= sc.nextFloat();
        for(int i=0;i<marks.length;i++){
            if(marks[i]<35){
                System.out.println("You are failed in the subject   " +marks[i]);

            }
            System.out.println(marks[i]);
        }
    }
}