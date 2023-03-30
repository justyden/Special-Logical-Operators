/* Create a class that holds many unique boolean operations.
 * The user will be able to pass a boolean expression or variable into 
 * the program and it will return a boolean value.
*/

public class Operators {
    // This class will only hold methods as it does not need a constructor or
    // instance fields.

    // Takes two variables and compares different options. It will return false for
    // only one unique input.
    public boolean Logical_Implication(boolean user_input1, boolean user_input2) {
        boolean value;

        if (user_input1 && !user_input2) {
            value = false; // Sets value equal to false since the unique case was triggered.
        } else {
            value = true;
        }
        return value; // Returns value back to the method.
    }

    // Takes two variables and compares them. Will only be true if both boolean
    // values are the same.
    public boolean Logical_Equality(boolean user_input1, boolean user_input2) {
        boolean value;

        // Checks to make sure both user_input1 and user_input2 are equal.
        if ((user_input1 && user_input2) || (!user_input1 && !user_input2)) {
            value = true;
        } else {
            value = false;
        }
        return value; // Returns value back to the method.
    }

    // Takes user input variables and compares them making sure if they
    // are both the same value to return false and true if it is the other way.
    public boolean XOR(boolean user_input1, boolean user_input2) {
        boolean value;

        // Checks to see if they are equal.
        if ((user_input1 && user_input2) || (!user_input1 && !user_input2)) {
            value = false;
        } else {
            value = true;
        }
        return value; // Returns value back to the method.
    }

    // Checks boolean arugments and makes sure they are both not true. If they
    // are not then it returns true.
    public boolean NAND(boolean user_input1, boolean user_input2) {
        boolean value;

        // Compares the variables making sure they are both not true.
        if (user_input1 && user_input2) {
            value = false;
        } else {
            value = true;
        }
        return value; // Returns value back to the method.
    }

    // Takes boolean user input variables and checks to see if they if they are both
    // not true.
    // If so it returns true.
    public boolean NOR(boolean user_input1, boolean user_input2) {
        boolean value;

        // Checks the variables making sure they are both false.
        if (!user_input1 && !user_input2) {
            value = true;
        } else {
            value = false;
        }
        return value; // Returns value back to the method.
    }
}