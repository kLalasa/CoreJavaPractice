package PRACTICE_Arrays;

public class Lab015 {
    public static void main(String[] args) {
        String str= "Lalasa";
        String rev_str="";
        char ch;

        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            rev_str = ch+rev_str;
        }

        System.out.println(rev_str);

    }
}
