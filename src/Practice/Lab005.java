package Practice;

public class Lab005 {
    public static void main(String[] args) {
        byte a=10;
        byte b=10;
        //byte c=a+b; Java performs arithmetic operations with int by default,
        // which means the result of the addition a + b will be of type int.
        byte c=(byte)(a+b);
        System.out.println(c);
    }
}
