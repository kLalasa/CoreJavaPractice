package Jan_07;

public class Student3 {
    int rollno;
    String name;
    float fee;

    Student3(int rollno, String name, float fee) {
        rollno = rollno;
        name = name;
        fee = fee;
    }

    void display_student() {
        System.out.println(rollno + " " + name + "  " + fee);
    }
}

    class Test{
        public static void main(String[] args) {
            Student3 s1=new Student3(101,"Kritin",35456.56f);
            Student3 s2=new Student3(102,"Kishore",5678f);
            s1.display_student();
            s2.display_student();
        }
    }

//we need to use yhis keyword to distingusih the instance variables and local variables