package Dec30;

public class Lab001 {
    public static void main(String[] args) {
        int c1 = sum(2, 9);
        System.out.println(c1);
        int c2 = ex(4);
        System.out.println(c2);
    }

    static int sum(int input_1, int input_2) {
        return input_1 + input_2;
    }

    static int ex(int input_1) {
        return input_1;
    }
}