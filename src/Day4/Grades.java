package Day4;

import java.util.Scanner;

public class Grades {
    private static int [] grades;
    private static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades do you want to enter ");
        grades=new int [scanner.nextInt()];
        getGrades();
        printGrades();
        System.out.println("the average is "+String.format("%.2f",calculateAvg()));


    }
    public static void getGrades(){
        for (int i=0;i<grades.length;i++){
            System.out.println("enter the grade "+(i+1));
            grades[i]=scanner.nextInt();
        }
    }
    public static void  printGrades(){
        for (int grade:grades){
            System.out.println(grade);
        }
    }
    public static int calculateSum()
    {
        int sum=0;
        for (int i=0;i<grades.length;i++){
            sum+=grades[i];

        }
        return sum;

    }
    public static double calculateAvg(){
        return calculateSum()/ grades.length;
    }


}
