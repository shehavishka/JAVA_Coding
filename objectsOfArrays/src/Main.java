public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //create array as the normal int array
        Ship[] shipList = new Ship[3];

        Ship ship1 = new Ship("boomSour","Argentina");
        Ship ship2 = new Ship("karan", "Portugal");

        shipList[0] = ship1;
        shipList[1] = ship2;

        for(Ship k : shipList){
            if(k != null){
                System.out.println(k.toString());
            }
        }
    }
}