package practice01;

public class Lab007 {
    public static void main(String[] args) {
        int row, column, noOfRows=5;

        for(row=0;row<noOfRows;row++){
            for(column=0;column<=row;column++){

                System.out.print("* ");
            }

            System.out.println( "  " );
        }
    }
}
