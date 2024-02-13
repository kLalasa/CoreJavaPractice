package Practice;

public class Lab004 {
    public static void main(String[] args) {
        int a=130;
        byte b=(byte)a;
        //byte in Java can only hold values from -128 to 127 (inclusive). Therefore, the value 130
        // is outside the range of a byte, and the conversion will result in an overflow.
        System.out.println(b);
    }
}
