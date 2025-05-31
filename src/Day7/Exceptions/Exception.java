package Day7.Exceptions;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
    public static void main(String[] args) throws IOException{
        //createFile();
        handlingNumbersException();
        try {
            createFileRethrow();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void createFile(){
        File file= new File("resources/grades.txt");
        try{
            file.createNewFile();
        }catch (IOException e){
            System.out.println("Path not found");
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Hello, after exception");
    }
    public static void handlingNumbersException(){
        File file = new File("resources/grades.txt");
        //Scanner scanner=null;
        try (Scanner scanner=new Scanner(file)){// try with resources
            //scanner=new Scanner(file);
            while (scanner.hasNext()){
                double grade= scanner.nextDouble();
                System.out.println(grade);
            }
        }catch (FileNotFoundException | InputMismatchException e){
            e.printStackTrace();
        }
//        finally {
//            scanner.close();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//        }catch (InputMismatchException e){
//            e.printStackTrace();
//        }catch (java.lang.Exception e){
//            e.printStackTrace();
//        }



    }
    public static void createFileRethrow()throws IOException{
        File file=new File("resource/grades.txt");
        file.createNewFile();
    }
}
