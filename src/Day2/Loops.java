package Day2;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        //while loop
       /* //what we have
        int rate =15;
        int maxWeeklyHours=40;
        //what we need to get
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your weekly hours");
        double workedWeeklyHours =scanner.nextDouble();
        //validate the input
        while (workedWeeklyHours>maxWeeklyHours){
            System.out.println("invalid input, please enter another number: ");
            workedWeeklyHours =scanner.nextDouble();
        }
        scanner.close();
        //calculate salary
        double salary=workedWeeklyHours*rate;
        System.out.println("the gross salary is "+ salary);*/

        //do while
        /*Scanner scanner =new Scanner(System.in);
        boolean again =false;
        do {
            System.out.println("enter first number: ");
            double num1= scanner.nextDouble();
            System.out.println("enter second number:");
            double num2= scanner.nextDouble();
            double sum= num1+num2;
            System.out.println("the sum is "+sum);
            System.out.println("do you need to repeat");
            again=scanner.nextBoolean();

        }while (again);
        scanner.close();*/
// total price
        /*Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number of items: ");
        int quantity= scanner.nextInt();
        double total =0;
        for (int i=0; i<quantity;i++){
            System.out.println("enter item price: "+(i+1));
            double price = scanner.nextDouble();
            total+= price;
        }
        System.out.println("the total price is "+total);
        scanner.close();*/

        /*Scanner scanner=new Scanner(System.in);
        System.out.println("enter your text: ");
        String text=scanner.nextLine();
        scanner.close();
        boolean found =false;
        for (int i=0; !found&&i<text.length();i++){
           char currentLetter= text.charAt(i);
           if (currentLetter=='a'||currentLetter=='A'){
               found=true;
               //break;
           }
        }
        if (found){
            System.out.println("the text has an A");
        }
        else
            System.out.println("the text does not have an a");*/

        //average score calculator
       /* int numOfStudents=3;
        int numOfCourses=4;
        Scanner scanner= new Scanner(System.in);
        for (int i=0; i<numOfStudents;i++){
            int total=0;
            for (int j=0; j<numOfCourses;j++){
                System.out.println("enter score for corse "+(j+1)+ "for student"+(i+1));
                double score= scanner.nextDouble();
                total+=score;

            }
            double average= total/4;
            System.out.println("average for student"+(i+1)+"is: "+average);
        }*/
        /*for (int i=1; i<=10;i++){
            if (i==5)
                break;
            System.out.println(i);
        }*/

        /*for (int i=1; i<=10;i++) {
            if (i == 5||i==7)
                continue;
            System.out.println(i);
        }*/

        //greeting

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        String name= scanner.nextLine();
        scanner.close();
        greetUser(name);
        //System.out.println("hello"+name);


    }
   static void greetUser(String n){
        System.out.println("hello"+n);

    }
}
