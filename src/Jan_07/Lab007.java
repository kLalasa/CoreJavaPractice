package Jan_07;

public class Lab007 {

    int x;
    public Lab007(){
        x=5;
    }
    //create a class constructor for Lab007 class and
    //setting the initial value for class attribute x

    public static void main(String[] args) {
        Lab007 myobj=new Lab007();//This will call the constructor
        System.out.println(myobj.x);
    }
}
