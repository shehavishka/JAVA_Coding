public class Swap2Variables {
    public static void main(String[] args){

        String x = "Disney";
        String y = "Magic";

        System.out.println("x: " +x);
        System.out.println("y: " +y);

        String temp;

        temp = x;
        x=y;
        y=temp;

        System.out.println("\nAfter swapping\n");

        System.out.println("x: " +x);
        System.out.println("y: " +y);

    }
}
