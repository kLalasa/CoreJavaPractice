package Jan14.Exceptions;

public class Lab003 {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try {
            System.out.println(a / b);
        }
        catch (ArithmeticException e){
            //e.printStackTrace();
            System.out.println(e.toString());
        }
    }
}
