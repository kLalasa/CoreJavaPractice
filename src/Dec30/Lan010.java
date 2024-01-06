package Dec30;

public class Lan010 {
    public static void main(String[] args) {
        String str="Welcome", rev_str="";
        char ch;
        System.out.println("Original word" );
        System.out.println("Welcome");

        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev_str=ch+rev_str;
        }
        System.out.println("Reversed string  " +rev_str);
    }
}
