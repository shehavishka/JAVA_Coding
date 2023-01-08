public class PrintfMethod {

    public static void main(String[] args){

        System.out.printf("%d) This is a format string \n",1);

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Anu";
        int myInt = 50;
        double myDouble = 1000;

        //Conversion-character
        System.out.printf("BooleanValue: %b \n",myBoolean);
        System.out.printf("CharValue: %c \n",myChar);
        System.out.printf("StringValue: %s \n",myString);
        System.out.printf("IntegerValue: %d \n",myInt);
        System.out.printf("DoubleValue: %f \n",myDouble);

        //Width type - Minimum number of characters to be written as output
        System.out.printf("\nHello %10s\n", myString);

        //Precision - Sets number of digits of precision when outputting floating-point values
        System.out.printf("\nYou have this much money %.2f\n", myDouble);

        //Flags - Adds an effect to output based on the flag added to format specifier

        // - : left-justify
        System.out.printf("\nYou have this much money %-10f\n", myDouble);

        // + : (+) or (-) sign for a numeric value
        System.out.printf("You have this much money %+.2f\n", myDouble);

        // 0 : numeric values are zero
        System.out.printf("You have this much money %020f\n", myDouble);

        // , : comma grouping separation if numbers > 1000
        System.out.printf("You have this much money %,.2f\n", myDouble);

    }
}
