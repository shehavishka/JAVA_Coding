import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] carList = {"Lamborghini", "Ferrari", "Maserati", "Camaro"};

        for(String i : carList){
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of element that you want to insert: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        ArrayList<String> mobileBrand = new ArrayList<>();
        for (int i=0; i<count; ++i){
            System.out.println("Enter the mobile brand name: ");
            String mobBrand = scanner.nextLine();
            mobileBrand.add(mobBrand);
        }

        //extract the mobileBrand arrayList using for each loop
        for(String i: mobileBrand){
            System.out.print(i + " ");
        }

    }
}