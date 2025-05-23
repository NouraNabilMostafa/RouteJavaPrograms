package Day5;

public class Square extends Rectangle{
    //method overriding
    @Override
    public double calculateParameter(){
        return (length*sides);
    }
    //overloading
    public void print(String name){
        System.out.println("I am square");
    }

}
