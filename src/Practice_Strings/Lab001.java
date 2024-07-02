package Practice_Strings;

public class Lab001 {

    public static void printEvenLengthWords(String s) {
        // Split the string into words using space as the delimiter
        for (String word : s.split(" ")) {
            // Check if the length of the word is even
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        String s = "i am Geeks for Geeks and a Geek";

        printEvenLengthWords(s);
    }
}
