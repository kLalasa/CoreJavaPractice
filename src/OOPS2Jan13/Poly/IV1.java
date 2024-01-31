package OOPS2Jan13.Poly;

public class IV1 {
    public static void main(String[] args) {
        Person a= new Person();
        Person a1=new Person();
        Person a3=null;

        a3.run();// exception Null pointer

    }
}

class Person{
    int a;
    void run(){
        System.out.println("Run called");
    }
}
