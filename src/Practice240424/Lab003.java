package Practice240424;

import java.util.Arrays;
import java.util.Collections;

public class Lab003 {
    public static void main(String[] args) {
        Integer [] arr={12,17,45,13,67};

        //Arrays.sort(arr);
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Array after sorting");
        for(int i=1;i<arr.length;i++)
            System.out.println(arr[i]);
        System.out.println(Arrays.toString(arr));
    }
}
