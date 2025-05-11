package Day3;

public class HomeAreaCalculator {
    public static void main(String[] args) {
        Rectangle room1=new Rectangle(); //default constructor
        room1.setLength(10);
        room1.setWidth(30);
        double room1Area= room1.calculateArea();
        System.out.println("the area of room1 is "+ room1Area);

        Rectangle room2=new Rectangle(30,15); //default constructor
        double room2Area= room2.calculateArea();
        System.out.println("the area of room2 is "+ room2Area);

        double toatalArea= room1Area+room2Area;
        System.out.println("the area of two rooms = "+toatalArea);


    }
}
