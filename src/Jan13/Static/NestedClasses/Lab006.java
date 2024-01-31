package Jan13.Static.NestedClasses;

class Parent{

    String name;
    void method(){
        System.out.println("Method from Parent");
    }
}
class Child extends Parent{
    int id;

    @Override
    void method() {
        System.out.println("Method from child");
    }
}


public class Lab006 {
    public static void main(String[] args) {
        Parent p=new Child();
        p.name="Hello Java";
        System.out.println(p.name);
        Child c= (Child)p;
        c.id=1;
        System.out.println(c.id);
        System.out.println(c.name);
        c.method();
    }
}
