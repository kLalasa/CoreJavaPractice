package OOPS2Jan13.Poly;

public class IV2 {
    public static void main(String[] args) {
        Person1 h=new Person1();
        System.out.println(h.b);
        System.out.println(h.a);
        System.out.println(Person1.b);
       // System.out.println(Person1.a);
        // non-static variable a cannot be referenced from a static context
        //System.out.println(Person1.run());
         h.run();
    }
}
class Person1{

    int a;
    static int b;
    static void run(){
        System.out.println("Its called");
    }
    public int call(){
        return 23;
    }



}