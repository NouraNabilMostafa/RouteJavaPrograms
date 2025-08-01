package day6.abstraction;

public class Rectanglee extends Shape{
    private double length;
    private double width;
    public Rectanglee(double length,double width){
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;

    }
}
