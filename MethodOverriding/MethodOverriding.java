public class MethodOverriding {

    public static void main(String[] args){

        //method overriding: Declaring method in a subclass
        //                   which is already in parent class
        //                  ~Done so that a child class can give its own implementation.

        Animal animal = new Animal();
        animal.speak();

        Dog dog = new Dog();
        dog.speak();

    }
}
