package PRACTICE_Arrays;

public class Lab016 {
    public static void main(String[] args) {

        int firstnum=0;
        int secondnum=1;
        int nextnum;
        int n=20;

        for(int i=1;i<=20;i++){
            System.out.println(firstnum);

            nextnum=firstnum+secondnum;
            firstnum=secondnum;
            secondnum=nextnum;

        }


    }
}
