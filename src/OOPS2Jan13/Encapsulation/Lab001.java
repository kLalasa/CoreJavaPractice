package OOPS2Jan13.Encapsulation;

public class Lab001 {
    String name;
    long bal;
    public Lab001(String name,long bal){
        this.name=name;
        this.bal=bal;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
        System.out.println(name);
    }
    public long getBal(){
        return bal;
    }
    public void setBal(long bal){
        if (bal>0){
            this.bal=bal;
        }else{
            System.out.println("Not allowed");
        }
    }

    public static void main(String[] args) {
        Lab001 obj=new Lab001("Vinod",1000);
        obj.setName("Mohan");
        obj.setBal(-1);
    }
}
