package Jan14.Exceptions;

public class Lab005 {
    public static void main(String[] args) {
        int i=50;
        int j=0;
        int data;
        try {

            data = i / j;
            System.out.println("It doesnt execute if exception occurs");
        }
        catch (Exception e){
            System.out.println(i/(j+2));
            System.out.println("Its executed");
        }
    }
}
