package Practice04052024;

public class RemoveSpaces {
    public static void main(String[] args) {
        String s="Hello Java Welcome";
        System.out.println(s);
        s=s.replaceAll("\\s","");
        System.out.println(s);
    }
}
