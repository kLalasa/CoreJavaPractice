package Practice;

public class Lab012 {
    public static void main(String[] args) {
        for(int i=0;i<=10;i++){
            for (int j=0;j<=10;j++){
                for (int k=0;k<=10;k++){
                    System.out.println(i+ " " +j+ " " +k);
                    if(k==6)
                        break;
                }
            }
        }
    }
}
