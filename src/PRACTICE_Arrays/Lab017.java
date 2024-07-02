package PRACTICE_Arrays;

public class Lab017 {
    public static void main(String[] args) {
        int n=5;
        long result=fact(n);
        System.out.println(result);


    }

    public static long  fact(int n){

        if(n==0 || n==1)
            return  1;
        else{
            return n* fact(n-1);
        }


    }
}
