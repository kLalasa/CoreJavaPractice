package Jan14.Exceptions;

public class Lab004 {
    public static void main(String[] args) {
        String str=null;
        try {
            System.out.println(str.length());
        }
        catch (NullPointerException e) {

            System.out.println(e.toString());
        }
    }
}
