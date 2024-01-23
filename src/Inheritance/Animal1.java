package Inheritance;

public class Animal1 {
    void eat(){
        System.out.println("eating ....");
    }
}
class Dog1 extends Animal1{
    void bark(){
        System.out.println("barking...");
    }
}
class Puppy extends Dog1{
    void weep(){
        System.out.println("Weeping...");
    }
}
class Multilevel{
    public static void main(String[] args) {
        Puppy pg=new Puppy();
        pg.eat();
        pg.bark();
        pg.weep();

    }
}
