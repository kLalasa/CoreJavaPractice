package Jan_07;

public class Lab005 {
    static void myStaticMethod(){
        System.out.println("Static methods can be called without creating objects");
    }

    public void myMethod(){
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStaticMethod();

        Lab005 myObj=new Lab005();
        myObj.myMethod();
    }
}
//difference between static and public methods