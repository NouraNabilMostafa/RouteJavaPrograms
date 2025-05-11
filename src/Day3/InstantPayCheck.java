package Day3;

import java.util.Scanner;

public class InstantPayCheck {
    static double requiredSalary=25000; //global variables
    static int requiredCreditScore=700;
    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {
        //what we have


        //what we need to get
        //getEmployeeData();
        double salary=getSalary();
        int creditScore=getCreditScore();
        boolean qualified=isQualified(salary,creditScore); //arguments
        notifyUser(qualified);
        scanner.close();

        //What happened??
        // the returned value from getsalary,getcreditscore methods
        // saved in salary and creditscore variables
        // >>look to is qualified method


    }
//    public static void getEmployeeData(){
//        //each method should return only one value >> java rule
//        Scanner scanner=new Scanner(System.in);
//
//        System.out.println("enter your salary");
//        double salary=scanner.nextDouble();
//
//        System.out.println("enter your credit score ");
//        int creditScore= scanner.nextInt();
//        scanner.close();
//
//
//    }
    //we cut this method int two methods to return the values on it
    public static double getSalary(){

        System.out.println("enter your salary");
        double salary=scanner.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("enter your credit score ");
        int creditScore= scanner.nextInt();
        return creditScore;

    }

// here salary and creditscore parameters take their values from the main
    public static boolean isQualified(double salary, int creditScore){
        if (salary>=requiredSalary&&creditScore>=requiredCreditScore){
            return true;
        }
        else {
            return false;
        }

    }
    public static void notifyUser(boolean isQualified){
        if (isQualified){
            System.out.println("cograts you are qualified");
        }
        else {
            System.out.println("you are not qualified ");
        }
    }
}
