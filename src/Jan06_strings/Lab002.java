package Jan06_strings;

public class Lab002 {
    public static void main(String[] args) {
        String str= "Hello";
        str.concat("world");
        System.out.println(str);

        String a1="welcome";
        String a2="Welcome";
        if (a1.equalsIgnoreCase(a2)){
            System.out.println("yes");
        }
    }
}
