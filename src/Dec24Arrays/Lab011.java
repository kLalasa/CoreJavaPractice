package Dec24Arrays;

public class Lab011 {
    public static void main(String[] args) {
        int[][] arr=new int[3][3];
        arr[0][0]=12;
        arr[0][1]=14;
        arr[0][2]=16;

        arr[1][0]=34;
        arr[1][1]=17;
        arr[1][2]=78;

        arr[2][0]=67;
        arr[2][1]=45;
        arr[2][2]=78;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println(" ");
        }


    }
}
