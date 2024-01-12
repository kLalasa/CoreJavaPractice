package Jan_07;

public class This_ex {
    int no;
    String name;
    float fee;

    This_ex(int no, String name,float fee){
        this.no=no;
        this.name=name;
        this.fee=fee;
    }
    void display_this(){
        System.out.println(no+ " " +name+ " " +fee);
    }
}
class Example{
    public static void main(String[] args) {
        This_ex E1= new This_ex(102, "Kiran",4567f);
        This_ex E2=new This_ex(105,"Arun", 3456f);
        E1.display_this();
        E2.display_this();
    }
}