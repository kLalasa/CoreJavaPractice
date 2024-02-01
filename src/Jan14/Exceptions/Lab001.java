package Jan14.Exceptions;

public class Lab001 {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
        int data=12/0;
        System.out.println(data);
        }
        //catch (NullPointerException e)
        //exception not handled
        catch (ArithmeticException e){
            System.out.println(e);
        }
        finally {
            System.out.println("Its always executed");
        }
        System.out.println("rest of the code");
    }
}
