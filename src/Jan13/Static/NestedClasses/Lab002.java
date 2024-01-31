package Jan13.Static.NestedClasses;

class Inner{
    int a=10;
    static class Outer{
        int b=20;

    }



}




public class Lab002 {
    public static void main(String[] args) {
        Inner In=new Inner();
        System.out.println(In.a);
        Inner.Outer OO=new Inner.Outer();
        System.out.println(OO.b);

    }
}
