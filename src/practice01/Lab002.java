package practice01;

import java.util.ArrayList;
import java.util.Collections;

public class Lab002 {
    public static void main(String[] args) {
        int a,b,c;
        a=5;
        b=10;
        c=15;
        ArrayList<Integer>x=new ArrayList<>();
        x.add(a);
        x.add(b);
        x.add(c);
        System.out.println(Collections.max(x) +" is the largest number");
    }
}
