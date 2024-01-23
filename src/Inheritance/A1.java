package Inheritance;

 class A1 {
    void Print_A(){
        System.out.println("Class A");
    }
}
class B extends A1{
     void Print_B(){
         System.out.println("class B");
     }
}
class C extends A1{
     void Print_C(){
         System.out.println("Class C");
     }
}
class D extends A1{
     void Print_D(){
         System.out.println("class D");
     }
}
class Hierarchical{
    public static void main(String[] args) {
        B obj_B=new B();
        obj_B.Print_A();
        obj_B.Print_B();

        C obj_C=new C();
        obj_C.Print_A();
        obj_C.Print_C();

        D obj_D=new D();
        obj_D.Print_A();
        obj_D.Print_D();

    }
}
