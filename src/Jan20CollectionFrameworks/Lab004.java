package Jan20CollectionFrameworks;

import java.util.Iterator;
import java.util.Stack;

public class Lab004 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<String>();
        stack.push("Geeks");
        stack.push("for");
        stack.push("geeks");
        stack.push("geeks");
        Iterator<String> itr=stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+  "  ");

        }
        System.out.println();
        stack.pop();
        itr=stack.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next()+ " ");
        }
    }
}
