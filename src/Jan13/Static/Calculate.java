package Jan13.Static;

public class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result=Calculate.cube(5);
        System.out.println(result);
        //The static method can not use non static data member or call non-static method directly.
        //this and super cannot be used in static context.
    }
}
