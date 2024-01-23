package Inheritance;

public class Animal {
    void eat() {
        System.out.println("eating....");
    }
}
    class  Dog extends Animal{
        void bark(){
            System.out.println("barking....");
        }
    }

class Singlelevel{
    public static void main(String[] args) {
        Dog dg=new Dog();
        dg.eat();
        dg.bark();
    }
}

