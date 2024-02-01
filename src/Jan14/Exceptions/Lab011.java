package Jan14.Exceptions;

public class Lab011 {
    public static int intDivide(int m,int n)throws ArithmeticException{
        int div=m/n;
        return div;
    }

    public static void main(String[] args) {
        Lab011 obj=new Lab011();
        try {
            System.out.println(obj.intDivide(23, 0));
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("Number cant be divided by zero");

        }
    }
}
