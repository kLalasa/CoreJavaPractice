package Jan13.Static.NestedClasses;

public class OuterClass {
    static int x=100;
    int y=90;
    static class Inner{
        void show(){
            //System.out.println(y);
            //only static member of Outer class can be accesses directly
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        OuterClass.Inner OO=new OuterClass.Inner();
        OO.show();
    }
}
