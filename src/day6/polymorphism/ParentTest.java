package day6.polymorphism;

public class ParentTest {
    public static void main(String[] args) {
        Parent obj=new Child();
        //does not see methods in child
        // static binding overriding  depend on reference type
        //dynamic binding depend on object type in run time "overriding"
        obj.show(100);

    }
}
