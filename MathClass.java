import java.util.Scanner;

public class MathClass {

    public static void main(String[] args){

        double x = 3.14;
        double y = -10;
        double r = 25;

        double z = Math.max(x, y);
        double w = Math.min(x, y);
        double v = Math.abs(y); //Absolute Method

        System.out.println("max => "+z);
        System.out.println("min => "+w);
        System.out.println("absValue => "+v);
        System.out.println("sqrtValue of 'a' => "+Math.sqrt(r));
        System.out.println("roundValue of 'x' => "+Math.round(x));
        System.out.println("roundUpValue of 'x' => "+Math.ceil(x));
        System.out.println("roundDownValue of 'x' => "+Math.floor(x));

        System.out.println("\n\nRight angled triangle: Solve for hypotenuse ");

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side a: ");
        a = scanner.nextDouble();

        System.out.println("Enter side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt((a*a)+(b*b));

        System.out.println("The hypotenuse is: "+c);

        scanner.close();

    }
}
