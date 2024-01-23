package ExceptionDec20;

public class Lab004 {
    public static void main(String[] args) {
        try{
            String s=null;
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println("Null pointer Exception");
        }
    }
}
