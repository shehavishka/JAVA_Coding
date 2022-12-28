import java.util.Random;

public class RandomValues {

    public static void main(String[] args){

        Random random = new Random();

        int x = random.nextInt();
        System.out.println("Int x: "+x);

        double a = random.nextDouble();
        System.out.println("Double a: "+a);    //Generate (0-1)

        boolean b = random.nextBoolean();
        System.out.println("Boolean b: "+b);

        //Limit the size
        int y = random.nextInt(6);  //Generate 0-5
        System.out.println("y: "+y);

        int z = random.nextInt(6)+1;  //Generate 1-6
        System.out.println("z: "+z);



    }


}
