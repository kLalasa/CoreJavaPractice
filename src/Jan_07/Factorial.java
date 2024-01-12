package Jan_07;

public class Factorial {
    void fact(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*n;
        }
        System.out.println("Factorial is " +fact);
    }

    public static void main(String[] args) {
        new Factorial().fact(5);// calling method with anonymous object
    }

}
