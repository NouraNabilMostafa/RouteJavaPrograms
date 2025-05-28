package day6;

public class Cat extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
    public void scratch(){
        System.out.println("I am cat, I scratch things");
    }
}
