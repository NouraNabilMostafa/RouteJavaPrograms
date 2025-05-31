package Day7.Collections;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        setDemo();
        listDemo();
        queueDemo();
        mapDemo();

    }
    public static void setDemo(){
        // HashSet - LinkedHashSet(Insertion order) - EntrySet - TreeSet(sorting order)
        System.out.println("This is set collection");
        Set<String> fruit = new HashSet();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Lemon");
        fruit.add("Orange");
        System.out.println(fruit.size());
        System.out.println(fruit); // convert elements to string then print them
        var i=fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("****************************************************");


        for (String fruits:fruit){
            System.out.println(fruits);
        }
        System.out.println("****************************************************");


        fruit.forEach(x-> System.out.println(x));

        System.out.println("****************************************************");

        fruit.forEach( System.out::println);
    }

    public static void listDemo(){
        // ordered>> list have index as array
        // ArrayList - LinkedList - Stack - Vector
        System.out.println("****************************************************");
        System.out.println("This is list collection");
        List<String> fruit = new ArrayList();
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Lemon");
        fruit.add("Orange");
        System.out.println(fruit.size());
        System.out.println(fruit);
        System.out.println(fruit.get(2));
        fruit.remove(0);
        System.out.println(fruit);
        var i=fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("****************************************************");


        for (String fruits:fruit){
            System.out.println(fruits);
        }
        System.out.println("****************************************************");


        fruit.forEach(x-> System.out.println(x));

        System.out.println("****************************************************");

        fruit.forEach( System.out::println);
    }
    public static void queueDemo(){
        //LinkedList - PriorityQueue
        System.out.println("****************************************************");
        System.out.println("This is queue collection");
        Queue<String> fruit = new LinkedList()  ;
        fruit.add("Apple");
        fruit.add("Lemon");
        fruit.add("Banana");
        fruit.add("Lemon");
        fruit.add("Orange");
        System.out.println(fruit.size());
        System.out.println(fruit);
        fruit.remove();
        System.out.println(fruit.peek());
        var i=fruit.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("****************************************************");


        for (String fruits:fruit){
            System.out.println(fruits);
        }
        System.out.println("****************************************************");


        fruit.forEach(x-> System.out.println(x));

        System.out.println("****************************************************");

        fruit.forEach( System.out::println);
    }

    public static void mapDemo(){
        //HashMap - TreeMap - LinkedHashMap
        System.out.println("****************************************************");
        System.out.println("This is map ");
        Map<String,Integer> fruitCalories = new HashMap();
        fruitCalories.put("apple",30);
        fruitCalories.put("lemon",40);
        fruitCalories.put("orange",50);
        fruitCalories.put("banana",60);
       // fruitCalories.put("lemon",10); //overriding
        fruitCalories.putIfAbsent("lemon",10);
        System.out.println(fruitCalories.size());
        System.out.println(fruitCalories); // toString
        System.out.println(fruitCalories.entrySet()); //set of map entries

        //to loop in maps should convert map to entry set

        for (var entry:fruitCalories.entrySet()){
            System.out.println("the fruit "+entry.getKey()+" has calories "+entry.getValue());

        }
        System.out.println("****************************************************");

        fruitCalories.forEach((x,y)-> System.out.println("the fruit "+x+" has calories "+y));


    }
}
