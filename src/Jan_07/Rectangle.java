package Jan_07;

public class Rectangle {
    float length;
    float width;

    void insert(float l,float w){
        length=l;
        width=w;
    }
    void area(){
        System.out.println("Area= " +(length*width));
    }
}

class TestRectangle{
    public static void main(String[] args) {
        Rectangle robj=new Rectangle();
        robj.insert(3.45f,6.78f);
        robj.area();
    }
}
