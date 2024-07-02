package Practice_Strings;

public class Lab004 {

    public static void printWords(String str){

        String[] words=str.split("\\s+");

        for(String word:words){

            if(word.length()%2==0)

                System.out.println("Even length of words: " +word);
        }

    }

    public static void main(String[] args) {
        String str= "I am a good girl";

        printWords(str);
    }


}
