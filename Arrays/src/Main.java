import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] cars = {"lamborghini", "Ferrari", "Mustang", "Supra"};

        for(int i=0; i<cars.length; ++i){
            System.out.println(cars[i]);
        }

        //get user input from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of cars that you going to be insert: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] carNames = new String[n];

        for(int i=0; i < n; ++i){
            System.out.println("Enter the "+ (i+1) + " car: ");
            carNames[i] = scanner.nextLine();
        }

        System.out.println("\nAll the names have got successfully.\n");

        //print the list of the cars
        for(String x : carNames){
            System.out.println(x);
        }

        scanner.close();

    }
}