package Practice04052024;

public class PrimeNums {
    public static void main(String[] args) {
        int num = 10;
        int count = 0;

        if (num > 1) {

            for (int i = 1; i <= num; i++) {
             if(num%i ==0)

                count++;

            }

            if (count == 2)
                System.out.println("Its a prime number");
            else
                System.out.println("Its not a prime number");
        }
        else
            System.out.println("Its not a prime number");
    }
}
