package Day5;

public class Person {
    private String name;
    private int age;
    private String gender;
    public Person(){
        System.out.println("I am person default constructor");
        setGender("female person");
    }
    public Person(String name){
        System.out.println("I am person prameterized constructor");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
