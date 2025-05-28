package day6.abstraction;

public class Customer {
    public static void main(String[] args) {
       Product book = new Book();
       book.setPrice(30);
        System.out.println(book.getPrice());
    }
}
