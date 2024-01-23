package ExceptionDec20;

public class Lab003 {
    public static void main(String[] args) {
        try{
            int a=100/0;
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
    }
}
