package ExceptionDec20;

public class Lab005 {
    public static void main(String[] args) {
        try{
            String s="abc";
            int i=Integer.parseInt(s);
        }catch (Exception e){
            System.out.println("NumberFormatException");
        }
    }
}
