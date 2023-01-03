import java.util.Scanner;

public class LogicalOperators {

    public static void main(String[] args){

        //AND
        int temp = 25;

        if(temp>30){
            System.out.println("It is hot outside");
        }
        else if(temp>20 && temp<=30){
            System.out.println("it is warm outside");
        }
        else{
            System.out.println("It is cold outside");
        }

        //OR
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n\nYou are playing a game! Press q or Q to quit");
        String response = scanner.next();

        if(response.equals("q") || response.equals("Q")){
            System.out.println("You quit the game!");
        }
        else{
            System.out.println("You are still playing the game!!!");
        }

        //NOT
        System.out.println("\n\nYou are playing a game! Press q or Q to quit");
        String response2 = scanner.next();

        if(!response2.equals("q") && !response2.equals("Q")){
            System.out.println("You are still playing the game!!!");
        }
        else{
            System.out.println("You quit the game!");
        }


    }
}
