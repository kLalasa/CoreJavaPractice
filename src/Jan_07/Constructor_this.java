package Jan_07;

public class Constructor_this {

    Constructor_this(){
        System.out.println("Hello x");
    }
    Constructor_this(int x){
        this();
        System.out.println(x);
    }
}

class This_cons{
    public static void main(String[] args) {
        Constructor_this A=new Constructor_this(5);
    }
}
//Calling default constructor from parameterized constructor
