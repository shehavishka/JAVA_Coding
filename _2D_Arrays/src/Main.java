public class Main {
    public static void main(String[] args) {

        String[][] cars = new String[2][2];

        cars[0][0] = "Lamborghini";
        cars[0][1] = "Ferrari";
        cars[1][0] = "Prado";
        cars[1][1] = "Pagani";

        for(int i=0; i< cars.length; i++){
            for(int j=0; j< cars[i].length; j++){
                System.out.print(cars[i][j] + "\t");
            }
            System.out.println();
            
        }
    }
}