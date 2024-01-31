package Jan13.Static.NestedClasses;

interface Age{
    int x=21;
    void getAge();
}
class MyClass implements Age{
    @Override
    public void getAge() {
        System.out.println("Age is " +x);
    }
}
// Class 2
// Main class
// AnonymousDemo

public class Anonymous {
    public static void main(String[] args) {
         MyClass obj=new MyClass();
         obj.getAge();

    }
}
