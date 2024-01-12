package Jan_07;

public class Method_this {
    void m(){
        System.out.println("Hello m");
    }
    void  n(){
        System.out.println("Hello n");
        this.m();
    }
}

class This_Method{
    public static void main(String[] args) {
        Method_this A=new Method_this();
        A.n();
    }
}
