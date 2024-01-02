package src.Basics;

public class Lab0019 {
    public static void main(String[] args) {
        byte a =10;
     //   int b =a; widening - both explicit and implicit casting are allowed
        int b =(int)a;

        int a1 = 300;
        byte b1 =(byte)a1; // narrowing -only explicit casting allowed
        System.out.println(b1);
    }
}
