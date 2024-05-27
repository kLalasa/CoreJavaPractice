package Practice04052024;

import java.util.Arrays;
import java.util.Collections;

public class ArraySort {

    public static void main(String[] args) {
        int a[]={23,45,67,11,24,78,89};

        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        Integer a1[]= {12,56,11,5,6,45,34};
        System.out.println(Arrays.toString(a1));
        Arrays.sort(a1, Collections.reverseOrder());
        System.out.println(Arrays.toString(a1));
    }
}
