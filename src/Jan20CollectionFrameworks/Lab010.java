package Jan20CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Lab010 {
    public static void main(String[] args) {
        ArrayList<String>colorList=new ArrayList<String>();
        colorList.add("Blue");
        colorList.add("Green");
        colorList.add("Yellow");
        colorList.add("White");
        System.out.println(colorList);

        colorList.add(0,"Red");
        System.out.println(colorList);
        System.out.println("element " + colorList.get(3));

        colorList.set(3,"Black");
        System.out.println("Modified list"  +colorList);

        colorList.remove(1);
        System.out.println("List after removal"  +colorList);

        Collections.sort(colorList);
        System.out.println("After sorting"  +colorList);

        if(colorList.contains("Black")){
            System.out.println("Found the element");
        }else {
            System.out.println("It doesnt contain any such ");
        }
        for(String color:colorList)
            System.out.println(color);

        Iterator<String>Itr=colorList.iterator();
        while (Itr.hasNext())
            System.out.println(Itr.next());
    }
}
