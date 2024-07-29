package Practice_Strings;

import java.util.Arrays;

public class Lab020 {

    public static int removeDuplicates(int[] ar){

        int rd=0;

        for(int i=1;i< ar.length;i++){

            if(ar[rd]!=ar[i]){

                rd++;
                ar[rd]=ar[i];
            }
        }

        return  rd+1;
    }

    public static void main(String[] args) {
        int[] ar= {2,3,4,5,2,3,4,5};
        Arrays.sort(ar);
        for(int i=0;i< ar.length;i++) {
            System.out.print(ar[i] + " ");

        }

        int rd= removeDuplicates(ar);
        System.out.println();

        for(int i=0;i<rd;i++)
            System.out.print(ar[i] + " " );
    }





}
