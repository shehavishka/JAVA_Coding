public class ObjectsArray {

    public static void main(String[] args){

        //int[] numbers = new int[3]; //number array
        //char[] characters = new char[4];   //character array
        //String[] strings = new String[5];   //string array


        //Food[] tastyFoods = new Food[3];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Cheese");
        Food food3 = new Food("Lasagna");

        //tastyFoods[0] = food1;
        //tastyFoods[1] = food2;
        //tastyFoods[2] = food3;

        Food[] tastyFoods = {food1,food2,food3};

        System.out.println(tastyFoods[0].name);


    }
}
