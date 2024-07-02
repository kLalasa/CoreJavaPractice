package PRACTICE_Arrays;

public class Lab012 {
    public static void main(String[] args) {
        int num=45678;
        int sum=0;

        while(num!=0){
            int lastDigit= num%10;
            num=num/10;

            sum=sum+lastDigit;
        }

        System.out.println(sum);
    }
}
