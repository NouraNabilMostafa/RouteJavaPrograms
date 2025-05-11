package Day3;
//encapsulation principles
//all fields should be private
//methods that access fields should be public
public class Rectangle {
    private double length; //fields,attributes
    private double width;

    public void setLength(double l) {
        //this.length = length;
        length=l;
    }
    //default constructor
    //run automatically when you make an object from the class
    public Rectangle(){
        length=0;
        width=0;
    }
    //over-loaded constructor>>
    // must change in parameters(number of parameters, order of parameters, type of parameters)
    public Rectangle(double length,double width){
        setLength(length);
        setWidth(width);


    }

    //setters

    public void setWidth(double width) {
        this.width = width;
    }
//getters
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //methods

    public double calculateParameter(){
        return (length*2)+(width*2);
    }

    public double calculateArea(){
        return length*width;
    }



}
