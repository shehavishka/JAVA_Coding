public class Constructors {

    public static void main(String[] args){

        Human human = new Human("Rick", 65, 57.5);
        Human human2 = new Human("Jack", 55, 67.5);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();

    }
}
