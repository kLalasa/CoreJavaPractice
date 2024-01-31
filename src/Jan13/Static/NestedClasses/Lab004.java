package Jan13.Static.NestedClasses;



class Outer3Class{
    static int outer_x=10;
    int outer_y=20;
    private static int outer_private=30;
    static class NestedClass{
        void display(){
            //can access static member of outer class
            System.out.println("Outer_x=" +outer_x);
            //can access private static member of outer class
            System.out.println("Outer_private="  +outer_private);
            //cannot access non static members
            //System.out.println("Outer_y="  +outer_y);
            //to access we need to create an obj
            Outer3Class OC=new Outer3Class();
            System.out.println("Outer_y" + OC.outer_y);

        }
    }
}
public class Lab004 {
    public static void main(String[] args) {
        //accessing a static nested class
        Outer3Class.NestedClass ON= new Outer3Class.NestedClass();
        ON.display();
    }
}
