package Jan20CollectionFrameworks;

import java.util.HashSet;
import java.util.Iterator;

public class Lab006 {
    public static void main(String[] args) {
        HashSet<String>hs=new HashSet<String>();
        hs.add("Geeks");
        hs.add("for");
        hs.add("geeks");
        hs.add("very");
        hs.add("helpful");

        Iterator<String>itr= hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next()+"");
        }
    }
}
