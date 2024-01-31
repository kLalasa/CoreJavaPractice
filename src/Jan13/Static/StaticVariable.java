package Jan13.Static;





class Student1{
    int rollno;
    String name;
    static String college="TTB";

    Student1(int r,String n){
        rollno=r;
        name=n;

    }
    void display(){
        System.out.println(rollno+ " " +name+ "  " +college );
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        Student1 s1=new Student1(121,"Vishal");
        Student1 s2=new Student1(123,"Mohan");
        s1.display();
        s2.display();
    }
}
