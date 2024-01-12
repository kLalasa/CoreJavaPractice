package Jan06_strings;

public class Lab003 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2=new String("Hello");
        System.out.println(s1==s2);//string references are compared
        System.out.println(s1.equals(s2));//content  of the strings  compared
    }
}
