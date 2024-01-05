package Dec24Arrays;

public class Lab012 {
    public static void main(String[] args) {
       // int[] arr=new int[2][3];
        //int[] arr2=new int[5][5];
        int[][] mat={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i< mat.length;i++){
            for(int j=0;j< mat[i].length;j++){
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println(" ");
        }

    }
}
