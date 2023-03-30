import java.util.Scanner;

/* A program that takes user input to a boolean variable.
 * It does a number of operations on it to determine 
 * how the boolean variables compare that were given.
 * */
public class UserInputOperators {
    public static void main(String[] args) {
        // Create the variables to hold a true or false expression.
        String user_string1, user_string2;
        boolean user_value1, user_value2;

        // Create an instance of the Operators class to use the methods within it.
        Operators operations = new Operators();

        // Create the scanner object that accepts user input.
        Scanner user_input = new Scanner(System.in);

        // Ask the user how they will input there data.
        System.out.println("Please input a variable. T or t = true and F or f = false.");
        user_string1 = user_input.nextLine();

        // Get the value of the next variable.
        System.out.println("Please input another variable. T or t = true and F or f = false.");
        user_string2 = user_input.nextLine();

        // Create if statements to check what the user input and give the boolean
        // variables values depending on it.
        if (user_string1.charAt(0) == 't' || user_string1.charAt(0) == 'T') {
            user_value1 = true;
        } else {
            user_value1 = false;
        }

        // Checks the next string and assigns a value to the variable.
        if (user_string2.charAt(0) == 't' || user_string2.charAt(0) == 'T') {
            user_value2 = true;
        } else {
            user_value2 = false;
        }

        // Close the scanner object.
        user_input.close();

        // Call each method from the Operators class on the user input.
        System.out.println("Logical Implication: " + operations.Logical_Implication(user_value1, user_value2));
        System.out.println("Logical Equality: " + operations.Logical_Equality(user_value1, user_value2));
        System.out.println("XOR: " + operations.XOR(user_value1, user_value2));
        System.out.println("NAND: " + operations.NAND(user_value1, user_value2));
        System.out.println("NOR: " + operations.NOR(user_value1, user_value2));
    }
}
