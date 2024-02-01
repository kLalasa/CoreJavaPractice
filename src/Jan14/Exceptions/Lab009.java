package Jan14.Exceptions;

public class Lab009 {
    void m(){
        int data =50/0;
    }
    void n(){
        m();
    }
    void p(){
        try{
            n();
        }catch (Exception e){
            System.out.println("Exception handled");
        }

    }

    public static void main(String[] args) {
        Lab009 obj= new Lab009();
        obj.p();

    }
}
