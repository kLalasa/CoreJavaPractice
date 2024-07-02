package Practice_Strings;

public class Lab006 {
    public static void main(String[] args) {

        String str= "Java is an easy programming Language";

        wordsSplit( str);
    }

    private static void wordsSplit(String str){

        String words[] =str.split(" ");

        for(int i=0;i<words.length;i++){
            String s= words[i];
            System.out.println(s.charAt(0));

        }
    }
}
