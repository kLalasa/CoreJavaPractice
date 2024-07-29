package Practice_collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab001 {
    public static void main(String[] args) {
        ArrayList mylist=new ArrayList();
//        List mylist1=new ArrayList();
//        ArrayList<String>mylist2=new ArrayList<String>();

        mylist.add(100);
        mylist.add("Hello");
        mylist.add("abc");
        mylist.add(100);
        mylist.add("");
        mylist.add(null);
        System.out.println(mylist.size());
        System.out.println(mylist);
        mylist.remove(4);
        System.out.println("After removing the element " +mylist);
        mylist.add(4,"xyz");
        System.out.println("After insertion: "  +mylist);
        mylist.set(1,"Java");
        System.out.println("After modifying: " +mylist);
        System.out.println(mylist.get(1));

//        for(int i=0;i< mylist.size();i++) {
//            System.out.println(mylist.get(i));
//        }


//        for(Object x:mylist)
//            System.out.println(x);


        Iterator iterator=mylist.iterator();
        while (iterator.hasNext()){

            System.out.println(iterator.next());
        }

        System.out.println(mylist.isEmpty());

        ArrayList mylist2= new ArrayList<>();
        mylist2.add("Java");
        mylist2.add("xyz");
        mylist.removeAll(mylist2);
        System.out.println(mylist);






    }
}
