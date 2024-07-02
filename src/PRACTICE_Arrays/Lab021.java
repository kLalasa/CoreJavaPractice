package PRACTICE_Arrays;

import java.util.Arrays;
import java.util.Collections;

public class Lab021 {
    public static void main(String[] args) {
        Integer[] arr= {1,34,56,34,67,86,56,69};

        Arrays.sort(arr, Collections.reverseOrder());

        System.out.println("Modified String : " +Arrays.toString(arr));
    }
}
