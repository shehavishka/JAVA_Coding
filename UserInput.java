import java.util.Scanner;

public class UserInput {

        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String fname = myScanner.nextLine();

            System.out.println("Enter your fav food: ");
            String food = myScanner.nextLine();

            System.out.println("Hello " + fname + "\nYour fav food is " + food );

        }
}
