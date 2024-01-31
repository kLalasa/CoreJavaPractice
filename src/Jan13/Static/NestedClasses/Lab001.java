package Jan13.Static.NestedClasses;
class Outer{
    int a=100;
    private class Inner{
        int b=50;
    }

}





public class Lab001 {
    public static void main(String[] args) {
        Outer oo=new Outer();
        //Outer.Inner myinner=oo.new Inner();
        System.out.println(oo.a);
        //System.out.println(myinner.b);
        //you cannot access a private inner class from outer class
    }

}
