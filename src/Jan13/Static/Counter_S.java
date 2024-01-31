package Jan13.Static;

public class Counter_S {
    static int count=0;

    Counter_S(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter_S s1=new Counter_S();
        Counter_S s2=new Counter_S();
        Counter_S s3=new Counter_S();
    }
}
// static variable will get the memory only once,
// if any object changes the value of the static variable, it will retain its value.
