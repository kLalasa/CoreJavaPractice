package PRACTICE_Arrays;

public class Lab005 {
    public static void main(String[] args) {
        String[] str=new String[]{"C","C++","Javascript","C#","Java","Java"};
        boolean flag=false;
        for(int i=0;i<str.length;i++){

            for(int j=i+1;j<str.length;j++){

                if(str[i]==str[j]) {
                    System.out.println("Found duplicate  " + str[i]);
                    flag = true;
                }

            }
        }

        if(flag==false){
            System.out.println("duplicates not found");
        }
    }
}
