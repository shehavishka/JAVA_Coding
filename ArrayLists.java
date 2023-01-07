import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args){

        //Array List => Resizable array
        //              Elements can be added and removed after compilation phase
        //              Store reference data types

        ArrayList<String> food = new ArrayList<String>();

        food.add("Pizza");
        food.add("cheese");
        food.add("Lasagna");

        food.set(0, "Sushi");
        food.remove(2);
        food.clear();

        for(int i=0; i<food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
