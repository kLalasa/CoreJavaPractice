package PRACTICE_Arrays;

import java.util.HashSet;

public class Lab006 {
    public static void main(String[] args) {
        String str[]=new String[]{"C","Java","C#","Javascript"};

        HashSet <String> langs=new HashSet<>();
        boolean flag=false;

        for(String l:str)
        {
            if(langs.add(l)==false){
                System.out.println("Found Duplicate element" +l);
                flag=true;
            }
        }

        if(flag==false)
            System.out.println("Duplicates not found");

    }
}
