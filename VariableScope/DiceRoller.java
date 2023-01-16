import java.util.Random;

public class DiceRoller {

   /*

        DiceRoller(){
            Random random = new Random();
            int number = 0;
            roll(random, number);

        }
    */

    Random random;
    int number = 0;

    DiceRoller(){
        random = new Random();

        roll();

    }

    void roll(){
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
