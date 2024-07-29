package Practice_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab003 {

    public static void main(String[] args) {
       // Map map=new HashMap<>();

        HashMap<Integer,String> hm=new HashMap<Integer,String>();
        hm.put(1,"David");
        hm.put(2,"Kalesh");
        hm.put(3,"Coles");
        hm.put(4,"John");
        hm.put(5,"Mark");
        hm.put(2,"Mahesh");
        System.out.println(hm);
        System.out.println(hm.size());
        hm.remove(1);
        System.out.println(hm);
        System.out.println(hm.get(2));
        System.out.println(hm.keySet());
        System.out.println(hm.values());
        System.out.println(hm.entrySet());

//        for( int x:hm.keySet()){
//
//            System.out.println(x+ " " +hm.get(x));
//        }

        Iterator<Map.Entry<Integer,String>>it=hm.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry<Integer,String> entry=it.next();
            System.out.println(entry.getKey()+" " +entry.getValue());
        }

        //hm.clear();
        //System.out.println(hm.isEmpty());





    }
}
