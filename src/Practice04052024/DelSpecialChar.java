package Practice04052024;

public class DelSpecialChar {
    public static void main(String[] args) {
        String s= "@#$%%%^%^  Hello world 9849580985";

        s=s.replaceAll("[^A-Za-z0-9]","");
        System.out.println(s);
    }
}
