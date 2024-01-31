package OOPS2Jan13.Poly;

public class Lab001 {
    public static void main(String[] args) {
        Overload Obj=new Overload();
        System.out.println(Obj.Multiply(3,4));
        System.out.println(Obj.Multiply(2,3,4));
    }


}
class Overload{
    public int Multiply(int a, int b){
        return a*b;
    }
    public int Multiply(int a,int b,int c){
        return a*b*c;
    }
}
