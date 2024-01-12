package Jan_07;

public class Student2 {
    int id;
    String name;
}

class  StudentTest3{
    public static void main(String[] args) {
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.id=101;
        s1.name="Vipul";
        s2.id=107;
        s2.name="Mark";
        System.out.println(s1.id+ "  "  +s1.name);
        System.out.println(s2.id+ "  "  +s2.name);
    }
}
//creating multiple objects and storing information in it through reference variables
