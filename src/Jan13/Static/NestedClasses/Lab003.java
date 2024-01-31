package Jan13.Static.NestedClasses;


class OClass{
    int x=20;
    class InnerClass{
        public int myInnerMethod(){
            return x;
        }
    }
}

public class Lab003 {
    public static void main(String[] args) {
        OClass OC=new OClass();
        OClass.InnerClass IN= OC.new InnerClass();
        System.out.println(IN.myInnerMethod());
    }
}
