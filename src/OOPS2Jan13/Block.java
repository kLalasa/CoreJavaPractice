package OOPS2Jan13;

public class Block {
    {
        System.out.println("I am IIB");
        //Instance Initialization block
    }
    Block(){
        System.out.println("I am DC");
    }
}
class Block_main{
    public static void main(String[] args) {
        Block b=new Block();
        new Block();
        Block b1;//obj not created
    }
}
