/**
 * James Bryant II
 * 1/31/17
 * DecisionMaker.java
 *
 * This program prompts the user to enter an integer between
 * 1-100 and displays the result based on the integer range entered.
 *
 * Extended Challenges :
 * (1)Include a set of parameters to officially end the program
 *
 * (2)Ask for user information (ex. name) at the beginning of the application,
 * and use it to refer to the user throughout the application.
 *
 * (3)Add validation to guarantee that a user enters a positive integer
 * between 1 and 100
 */

package bootcamp;
import java.util.Scanner;

public class Validator {

    public static String getString(Scanner sc, String prompt) {
        System.out.print(prompt);
        String s = sc.next();  // read user entry
        sc.nextLine();  // discard any other data entered on the line
        return s;
    }

    public static int getInt(Scanner sc, String prompt) {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            System.out.print(prompt);
            if (sc.hasNextInt())
            {
                i = sc.nextInt();
                isValid = true;
            }
            else
            {
                System.out.println("Error! That's not a valid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return i;
    }

    public static int getInt(Scanner sc, String prompt,
                             int min, int max)
    {
        int i = 0;
        boolean isValid = false;
        while (isValid == false) {
            i = getInt(sc, prompt);
            if (i < min) {
                System.out.println("Sorry, That's not a valid number. Please Try Again.");
            }
            else if (i > max)
                System.out.println("Sorry, That's not a valid number. Please Try Again.");
            else
                isValid = true;
        }
        return i;
    }







}






