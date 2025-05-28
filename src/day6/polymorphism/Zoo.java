package day6.polymorphism;

public class Zoo {
    public static void main(String[] args) {
        Dog rockey=new Dog();
        rockey.makeSound();
        rockey.bite();

        //Polymorphism
        //Polymorphic object: reference is parent and assign to him child of subclasses
        //see only methods of object type
        Animal animal1=new Dog();
        animal1.makeSound();
        //casting to see methods in child
        ((Dog)animal1).bite();
        feed(animal1);

        Animal animal2=new Cat();
        animal2.makeSound();
        ((Cat)animal2).scratch();
        feed(animal2);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here is your dog food ");
        } else if (animal instanceof Cat) {
            System.out.println("here is your cat food ");


        }
    }
    
}
