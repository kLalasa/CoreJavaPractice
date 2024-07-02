package Practice_Strings;

public class Lab005 {

    public static void main(String[] args) {

        String str= " The quick brown fox jumps over the lazy dog";
        boolean result= isPanagram(str.toLowerCase());
        System.out.println(result);


    }

    private static boolean isPanagram(String str){
        if(str.length()<26){
            return false;

        }else {

            for(char ch='a';ch<='z';ch++){

                if(str.indexOf(ch)<0){
                    return false;
                }
            }
        }

        return true;


    }
}
