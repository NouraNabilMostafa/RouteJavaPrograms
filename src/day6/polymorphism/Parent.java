package day6.polymorphism;

public class Parent {
    //overloading
    public void show(String s){
        System.out.println("parent string");
    }
    public void show(Object o){
        System.out.println("parent object");
    }
}
