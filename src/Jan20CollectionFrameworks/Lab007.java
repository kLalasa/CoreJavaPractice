package Jan20CollectionFrameworks;

import java.util.HashMap;
import java.util.Map;

public class Lab007 {
    public static void main(String[] args) {
        HashMap<Integer,String>hm=new HashMap<Integer,String>();
        hm.put(1,"Geeks");
        hm.put(2,"for");
        hm.put(3,"geeks");
        System.out.println("value of 1 is" +hm.get(1));
        for(Map.Entry<Integer,String> e:hm.entrySet())
            System.out.println(e.getKey()+ "  " +e.getValue());

    }
}
