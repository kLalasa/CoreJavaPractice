package Jan_07;

public class Employee {
    int id;
    String name;
    float salary;
    void ins(int i,String s, float f){
        id=i;
        name=s;
        salary=f;
    }
    void Disp(){
        System.out.println(id+ " "  +name+ "  "  +salary);
    }

}
 class TestEmployee{
     public static void main(String[] args) {
         Employee e1=new Employee();
         Employee e2=new Employee();
         Employee e3=new Employee();

         e1.ins(101,"Mohan",34000);
         e2.ins(102,"Kiran", 67000);
         e3.ins(103,"Anand", 78000);
         e1.Disp();
         e2.Disp();
         e3.Disp();
     }
}

