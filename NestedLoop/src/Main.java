import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol = "";

        System.out.print("Enter # of rows: ");
        rows = scanner.nextInt();
        System.out.print("Enter # of columns: ");
        columns = scanner.nextInt();
        System.out.print("Enter the symbol: ");
        symbol = scanner.next();


        for(int i=0; i<rows; i++){
            for(int j =0; j<columns; j++){
                System.out.print(symbol);
            }
            System.out.println();
        }


    }
}