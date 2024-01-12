package Jan_07;

public class Lab006 {
    public void fullThrottle(){
        System.out.println("The car is going as fast as it can");
    }
    public void Speed (int maxSpeed){
        System.out.println("Max speed is "  +maxSpeed);
    }

    public static void main(String[] args) {
        Lab006 mycar=new Lab006();
        mycar.fullThrottle();
        mycar.Speed(200);
    }
}
