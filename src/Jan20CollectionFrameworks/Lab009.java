package Jan20CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab009 {
    public static void main(String[] args) {
        List<String> items=new ArrayList<String>();
        items.add("shoes");
        items.add("Toys");

        Collections.addAll(items,"bat","Mouse","Fruits");
        Collections.sort(items);
        for(int i=0;i<items.size();i++)
            System.out.println(items.get(i) + "  ");
        Collections.sort(items,Collections.reverseOrder());
        for(int i=0;i<items.size();i++)
            System.out.println(items.get(i) + "  ");
    }
}
