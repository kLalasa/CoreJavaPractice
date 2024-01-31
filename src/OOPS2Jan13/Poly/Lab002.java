package OOPS2Jan13.Poly;

public class Lab002 {
    public static void main(String[] args) {
        Parent a;
        a=new subclass1();
        a.print();
        a=new subclass2();
        a.print();
       // subclass1 obj=new Parent();This isnt possible

    }

}

class Parent{
    void print(){
        System.out.println("Parent class");
    }
}
class subclass1 extends Parent{
    void print(){
        System.out.println("Subclass1...");
    }
}
class subclass2 extends Parent{
    void print(){
        System.out.println("Subclass2...");
    }
}
