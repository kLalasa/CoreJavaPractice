package OOPS2Jan13.abstraction;

public abstract class Animal {
    Animal(){

    }
    void m1(){
        System.out.println("I am m1()");
    }//concrete method
    abstract void m2();
    //not completed
}
 class Dog extends Animal{
     @Override
     void m2() {
         System.out.println("Running safely...");
     }

     public static void main(String[] args) {
         //Animal obj=new Animal();
         //It appears that you are trying to create an instance of the Animal class directly, which is not allowed because Animal is an abstract class.
         // You should create an instance of a concrete subclass, such as Dog, to instantiate an object
         Animal obj=new Dog() ;//// Creating an instance of the Dog class
         obj.m2();

     }
 }