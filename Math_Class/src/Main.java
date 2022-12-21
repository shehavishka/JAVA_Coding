import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x;
        double y;

        Scanner scanner = new Scanner(System.in);

        System.out.print ("Enter the side x: ");
        x = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter the side y: ");
        y = scanner.nextInt();
        scanner.nextLine();

        // use maths function here
        double hypotenuse = Math.sqrt((x*x)+(y*y));

        System.out.println("Hypotenuse of triangle : " + hypotenuse);

        scanner.close();
    }
}