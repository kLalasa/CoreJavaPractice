package Jan_07;

public class Lab009 {

    String modelName;
    int modelYear;

    public Lab009(int year, String name){
       modelName=name;
       modelYear=year;
    }

    public static void main(String[] args) {
        Lab009 myobj=new Lab009(1969,"Mustang");
        System.out.println(myobj.modelYear+ " "   +myobj.modelName);
    }
}
