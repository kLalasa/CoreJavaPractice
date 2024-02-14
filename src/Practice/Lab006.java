package Practice;

public class Lab006 {
    public static void main(String[] args) {
        short a=10;
        short b=10;
        //short c=a+b; compile time error 10+10=20 now integer
        short c= (short)(a+b);
        System.out.println(c);

    }
}
