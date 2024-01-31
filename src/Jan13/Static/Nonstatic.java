package Jan13.Static;

public class Nonstatic {
     static int a=20;
     //int a=20;

    public static void main(String[] args) {

        System.out.println(a);

        //non static variable cannot be referenced from a static context
    }
}
