package src.Basics;

public class Lab0023 {
    public static void main(String[] args) {
        String s1 ="Bhagyalakshmi Lalasa";//SCP
        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        String s2= new String("Bhagyalakshmi Lalasa");//OA
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        String s3= "bhagyalakshmi lalasa";
        System.out.println(s1.equalsIgnoreCase(s3));

        String s4="Hello";
        String s5="  world";
        String s6=s4.concat(s5);
        System.out.println(s6);

        System.out.println( s1 instanceof String);
        System.out.println(s2 instanceof Object);//Object is superior to all ,both are true


    }
}
