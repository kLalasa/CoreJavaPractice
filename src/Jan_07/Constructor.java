package Jan_07;

public class Constructor {

    int id;
    String name;
    Constructor(int i,String s){
        id=i;
        name=s; //parametrised constructor
    }
    void Dis(){
        System.out.println("name: " +name+ "id: " +id);
    }

    public static void main(String[] args) {
        Constructor c1=new Constructor(101,"Mohan");
                c1.Dis();
        Constructor c2=new Constructor(102,"Kiran");
        c2.Dis();
    }
}
