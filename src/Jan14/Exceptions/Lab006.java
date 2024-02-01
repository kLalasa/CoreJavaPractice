package Jan14.Exceptions;

public class Lab006 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];
            arr[5] = 30 / 0;
        }
        catch (ArithmeticException e){
            System.out.println("Arithmetic exception occurs");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBounds Exception occurs");
        }
        catch (Exception e){
            System.out.println("Parent exception occurs");
        }
    }
}
