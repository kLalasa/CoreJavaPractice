package OOPS2Jan13.accessmodifiers.Police;

public class JrCop {
    public static void main(String[] args) {
        Cop JrCop=new Cop(2);
        System.out.println(JrCop.gun);
        JrCop.canIshoot();
    }
}
