package Practice_Strings;

public class Lab019 {
    public static void main(String[] args) {
//        String str= "Welcome to Java programming";
//
//
//        int total=1;
//        int i=0;
//        while(i<str.length()){
//
//            if((str.charAt(i)== ' ' )&&(str.charAt(i+1)!= ' ')){
//                total++;
//
//
//            }
//            i++;
//        }
//
//        System.out.println(total);

        String str= "One two three four";
       String[]  words= str.split("\\s+");

       int count=words.length;
        System.out.println(count);

    }
}
