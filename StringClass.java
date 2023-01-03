import java.util.Locale;

public class StringClass {

    public static void main(String[] args){

        //String = a reference data type

        String name = "Anu";

        //boolean result = name.equals("anu");
        boolean result1 = name.equalsIgnoreCase("Anu");
        System.out.println(result1);

        int result2 = name.length();
        System.out.println(result2);

        char result3 = name.charAt(0);
        System.out.println(result3);

        int result4 = name.indexOf("u");
        System.out.println(result4);

        boolean result5 = name.isEmpty();
        System.out.println(result5);

        String result6 = name.toUpperCase();
        System.out.println(result6);

        String result7 = name.toLowerCase();
        System.out.println(result7);


        String nameex = "   Anu   ";
        String result8 = nameex.trim(); //To remove empty spaces
        System.out.println("Trim Method: "+result8);

        String result9 = name.replace('u','i');
        System.out.println("Replace Method: "+result9);

    }
}
