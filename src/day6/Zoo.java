package day6;

public class Zoo {
    public static void main(String[] args) {
        Dog rockey=new Dog();
        rockey.makeSound();
        rockey.bite();

        Animal animal=new Dog();
        animal.makeSound();
        ((Dog)animal).bite();
        feed(animal);
        animal=new Cat();
        animal.makeSound();
        ((Cat)animal).scratch();
        feed(animal);
    }
    public static void feed(Animal animal){
        if (animal instanceof Dog){
            System.out.println("here is your dog food ");
        } else if (animal instanceof Cat) {
            System.out.println("here is your cat food ");


        }
    }
    
}
