package Day3;

import java.util.Scanner;

public class HomeAreaCalculatorRedo {
     private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        HomeAreaCalculatorRedo calculator=new HomeAreaCalculatorRedo();
        Rectangle kitchen= calculator.getDimentions();
        Rectangle bathroom=calculator.getDimentions();
        double totalArea=calculator.calculateArea(kitchen,bathroom);
        System.out.println("the total area is: "+totalArea);
        calculator.scanner.close();

    }
    public Rectangle getDimentions(){
        System.out.println("enter room length");
        double length=scanner.nextDouble();

        System.out.println("enter room width");
        double width=scanner.nextDouble();
//        Rectangle room =new Rectangle(length,width);
//        return  room;
        return new Rectangle(length,width);


    }
     public double calculateArea(Rectangle rectangle1, Rectangle rectangle2){
        return rectangle1.calculateArea()+rectangle2.calculateArea();
    }
}
