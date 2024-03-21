package practice01;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        if (n <= 1) {
            System.out.println("This is not a prime number");
        } else {
            for (int i = 2; i <= n / 2; i++) {
                if (n % i == 0) {
                    count++;
                    break; // Break out of the loop once a factor is found
                }
            }
            if (count > 0) {
                System.out.println("This is not a prime number");
            } else {
                System.out.println("This is a prime number");
            }
        }
    }
}
