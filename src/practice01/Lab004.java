package practice01;

public class Lab004 {

    public static void main(String[] args) {
        String test= "I am 45 years old  and  female, married";
        count(test);
    }

    public static void count(String x){

        char[] ch= x.toCharArray();

        int letter=0;
        int space=0;
        int digit=0;
        int others=0;

        for(int i=0;i<x.length();i++){
            if(Character.isAlphabetic(ch[i])){
                letter++;
            } else if (Character.isSpaceChar(ch[i])) {
                space++;

            } else if (Character.isDigit(ch[i])) {
                digit++;

            }else
                others++;
        }

        System.out.println("Letter-->" +letter);
        System.out.println(("Space-->"+space));
        System.out.println("digit-->"+digit);
        System.out.println("others--->"+others);
    }
}
