package practice01;

import java.util.Locale;

public class Lab023 {
    public static void main(String[] args) {
        String str= "This is a simple sentence";

        str=str.toLowerCase();
        int vcount=0;
        int Ccount=0;

        for(int i=0;i<str.length();i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
                vcount++;
            else if (str.charAt(i)>'a' && str.charAt(i)<'z') {
                Ccount++;
            }

        }

            System.out.println(vcount);
            System.out.println(Ccount);

    }
}
