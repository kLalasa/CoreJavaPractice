package Practice240424;

import java.util.Arrays;

public class Lab007 {

    public static void main(String[] args) {


       String str= "Java is a programming language";
       String [] words=str.split("");

       String reverseStr="";
       for(String w: words){

           String reversewords="";

           for(int i=w.length()-1;i>=0;i--){

               reversewords=reversewords+w.charAt(i);
           }

           reverseStr=reverseStr+reversewords+"";


       }



    }
    }



