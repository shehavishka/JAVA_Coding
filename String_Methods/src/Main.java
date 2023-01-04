public class Main {
    public static void main(String[] args) {

        String name = "Sammy";
        boolean result = name.equals("sammy");
        boolean result2 = name .equalsIgnoreCase("sammy");
        char x = name.charAt(0);
        String lastName  = "        Fuck College            ";
        String upperName = name.toUpperCase();

        System.out.println("result 1: " + result);
        System.out.println("result 2: " + result2) ;
        System.out.println(x);
        System.out.println(lastName.isEmpty());
        System.out.println(upperName);
        System.out.println(lastName.trim());
    }
}