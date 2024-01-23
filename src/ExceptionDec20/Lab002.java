package ExceptionDec20;

public class Lab002 {
    public static void main(String[] args) {
        try{
            int[] Numbers={1,2,3};
            System.out.println(Numbers[10]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally {
            System.out.println("The try catch is finished");
        }
    }
}
