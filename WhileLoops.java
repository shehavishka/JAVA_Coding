import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String name = "";

        //While Loop
        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = scanner.nextLine();
        }


        String surname = "";

        //Do while
        do {
            System.out.println("Enter your surname: ");
            surname = scanner.nextLine();
        }while(surname.isBlank());

        System.out.println("Hi "+name+" "+surname);
    }
}
