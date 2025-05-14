package Day4;

import java.util.Arrays;
import java.util.Random;

public class LottaryTicketUpdate {

    private static final int LENGTH=6;
    private static final int MAX_TICKET_NUMBER=69;
    public static void main(String[] args) {
        int [] ticket=generateTicketNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int [] generateTicketNumbers(){
        int [] ticket= new int [LENGTH];
        Random random =new Random();
        for (int i=0; i<LENGTH;i++){
            int randomNumber;
            do {
                randomNumber=random.nextInt(MAX_TICKET_NUMBER)+1;

            }while(search(ticket,randomNumber));
            ticket[i]=randomNumber;
        }
        return ticket;

    }
    public static void printTicket(int [] ticket){
        for (int i=0; i<LENGTH;i++){
            System.out.print(ticket[i]+"|");

        }


    }

    /**
     * serach sequentially
     * @param array to search through
     * @param numberToSearchFor
     * @return return true if found and false if not found
     */
    public static boolean search(int [] array, int numberToSearchFor){
        for (int value:array){
            if (value==numberToSearchFor){
                return true;
            }

        }
        return false;

    }
    public static boolean binarySearch(int [] array, int numberToSearch){
        Arrays.sort(array);
        int index=Arrays.binarySearch(array,numberToSearch);
        if (index>=0){
            return true;
        }
        else return false;


    }
}
