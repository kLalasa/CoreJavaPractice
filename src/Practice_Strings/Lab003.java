package Practice_Strings;

import java.util.Arrays;
import java.util.Collections;

public class Lab003 {
    public static void main(String[] args) {
        String [] str= {"Red", "Orange", "Blue"};

        Arrays.sort(str);

        System.out.println(Arrays.toString(str));

        Arrays.sort(str, Collections.reverseOrder());

        System.out.println(Arrays.toString(str));
    }
}
