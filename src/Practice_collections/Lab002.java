package Practice_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab002 {
    public static void main(String[] args) {
//        Set myset=new HashSet<>();
//        HashSet myset1=new HashSet<>();
//        HashSet<String>myset2=new HashSet<String>();

        HashSet myset= new HashSet<>();

        myset.add(100);
        myset.add(100);
        myset.add("abc");
        myset.add("Hello");
        myset.add("abc");
        myset.add(12.7);
        myset.add("Java");
        myset.add(null);
        myset.add(null);
        myset.add("");
        myset.add("");

        System.out.println(myset);
        myset.remove("abc");
        System.out.println(myset);
        ArrayList al=new ArrayList<>(myset);
        System.out.println(al);


        System.out.println(al.get(2));

//        for(Object x:myset){
//            System.out.println(x);
//        }

        Iterator iterator=myset.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

      myset.clear();

        System.out.println(myset);
        System.out.println(myset.isEmpty());


    }
}
