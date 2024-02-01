package Jan14.Exceptions.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Lab001 {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("Ravi");
        list.add("Kiran");
        list.add("vinod");
        list.add("Ram");

        Iterator itr=list.iterator() ;
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
