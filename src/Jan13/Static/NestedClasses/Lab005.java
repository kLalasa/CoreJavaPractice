package Jan13.Static.NestedClasses;

class Outer4Class{
    static int outer_x=10;
    int outer_y=20;
    private int outer_private=30;

    class InnerClass{
        void display(){
            //can access static member of the outer class
            System.out.println("outer_x ="  +outer_x);
            //can also access non static member of the outer class
            System.out.println("outer_y=" +outer_y);
            //can access private member of the outer class
            System.out.println("outer_private=" +outer_private);
        }
    }
}




public class Lab005 {
    public static void main(String[] args) {
        //accessing an Inner class
        Outer4Class OC=new Outer4Class();
        Outer4Class.InnerClass OI=OC .new InnerClass();
        OI.display();
    }
}
