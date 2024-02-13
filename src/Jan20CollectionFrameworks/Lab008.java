package Jan20CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab008 {
    public static void main(String[] args) {
        List<String> items=new ArrayList<String>();
        items.add("Orange");
        items.add("Banana");
        Collections.addAll(items,"Mango","pears","watermelon");
        for (int i=0;i<items.size();i++)
            System.out.println(items.get(i)+ " ");

    }
}
