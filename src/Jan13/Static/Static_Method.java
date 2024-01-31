package Jan13.Static;

class Student{
    int rollno;
    String name;
    static String college="ITS";

    static void change(){
        college="BBDIT";
    }
    Student(int r, String n){
        rollno=r;
        name=n;

    }
    void display(){
        System.out.println(rollno+ "  " +name+ "  " +college);
    }
}

public class Static_Method {
    public static void main(String[] args) {


        Student s1 = new Student(123, "Vinod");
        Student s2 = new Student(131, "Kushal");
        Student s3 = new Student(141, "Krishna");
        s1.display();
        s2.display();
        s3.display();

    }
}
