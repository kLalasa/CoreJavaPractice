package OOPS2Jan13;

public class Block1 {

    { // Instance Initialization Block
        System.out.println("I am IIB");
    }

    Block1(){
        System.out.println("I am DC");
    }

    static { // SIB Static Initialization Block
        System.out.println("I am SIB");
    }



}


class Lab146 {
    public static void main(String[] args) {

        new Block1();
        Block1 b = new Block1();
    }
}


