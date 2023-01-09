public class Main {
    public static void main(String[] args) {
        /**
         *  In Method call through static method then that function also should be STATIC
         */
        System.out.println("Add Two Numbers.");
        System.out.println(addTwoNumbers(23,7));
    }

    static int addTwoNumbers(int x, int y){
        return x + y;
    }
}