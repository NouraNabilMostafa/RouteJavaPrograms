package day6.abstraction;

public class ShapeTester {
    public static void main(String[] args) {
        Shape shape= new Rectanglee(20,30);
        System.out.println("area is: " +shape.calculateArea());
        shape.print();

    }
}
