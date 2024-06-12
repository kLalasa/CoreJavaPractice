package Practice04052024;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine().trim();


        if(str.isEmpty()){

            System.out.println("Empty String");
            sc.close();
            return;
        }

        int count=0;

        for(int i=1; i<str.length()-1;i++){

            if(str.charAt(i) == ' '  &&  str.charAt(i+1)!= ' '){
                count++;
            }
        }

        System.out.println("Number of words " +(count+1));
        sc.close();

    }
}
