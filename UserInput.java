import java.util.Scanner;

public class UserInput {

        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);

            System.out.println("Enter your name: ");
            String name = myScanner.nextLine();

            System.out.println("How old are you?");
            int age = myScanner.nextInt();
            myScanner.nextLine();

            System.out.println("Enter your fav food: ");
            String food = myScanner.nextLine();

            System.out.println("\nHello " + name);
            System.out.println("Your age is " + age);
            System.out.println("Your fav food is " + food );


        }
}
