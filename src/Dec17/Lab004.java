package Dec17;

import java.util.Scanner;

public class Lab004 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int number= sc.nextInt();

        switch (number){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tues");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("Thrus");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Invalid numnber");
        }
    }
}
