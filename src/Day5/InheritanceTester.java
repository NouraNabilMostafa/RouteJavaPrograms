package Day5;

public class InheritanceTester {
    public static void main(String[] args) {
        Person person=new Person();
        Employee employee=new Employee();
        Rectangle rectangle=new Rectangle();
        rectangle.setLength(20);
        rectangle.setWidth(10);
        System.out.println(rectangle.calculateParameter());
        rectangle.print();


        Square square=new Square();
        square.setLength(10);
        square.setSides(4);
        System.out.println(square.calculateParameter()); //call override method in child
        square.print("nn");
        square.print();
    }
}
