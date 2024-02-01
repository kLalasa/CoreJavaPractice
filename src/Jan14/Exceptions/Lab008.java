package Jan14.Exceptions;

public class Lab008 {
    public static void main(String[] args) {
        try {
            int[] arr = new int[5];

            arr[5] = 30/0;
        }catch (Exception e){
            System.out.println("Common task completed");
        }
//        catch (ArithmeticException e){
//            System.out.println("Task1 completed");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Task2 completed");
//        }
        //handle the exception without maintaining the order of exceptions
    }
}
