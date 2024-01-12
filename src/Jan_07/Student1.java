package Jan_07;

public class Student1 {

    int rollno;
    String name;
    void  insertRecord(int r,String s){
        rollno=r;
        name=s;
    }
    void DisplayInfo(){
        System.out.println(rollno+ " " +name);
    }
}

class  StudentTest{

    public static void main(String[] args) {
        Student1 S1= new Student1();
        Student1 S2=new Student1();
        S1.insertRecord(102,"Anand");
        S2.insertRecord(104,"John");
        S1.DisplayInfo();
        S2.DisplayInfo();


    }
}

//Initializing variables through methods
