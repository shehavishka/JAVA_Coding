import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = myScanner.nextLine();

        System.out.println("Enter your birsth year: ");
        int birthYear = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("Hey " + firstName + "\nYou're " + (2022-birthYear)+ " years old.");
        
    }
}