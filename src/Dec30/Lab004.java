package Dec30;

public class Lab004 {
    public static void main(String[] ref) {
        System.out.println("it works");

        main("Hello");
        int c=main(4);
        System.out.println(c);
    }

    static void main(String a){
        System.out.println("I am a main function but JVM doesnt recognise me");
    }
    static int main(int a){
        return a;
    }

}
