package day6;

public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("woof");
    }
    public void bite(){
        System.out.println("I am a dog, I bite");
    }
}
