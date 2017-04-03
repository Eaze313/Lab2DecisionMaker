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

public class DecisionMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Greeting Invocation and Initialized Variables
        String userName = GreetExit.hello(scan);

        String answer = "y";

        //While Loop for Repeated Use
        while (answer.toLowerCase().charAt(0) == 'y') {

        //Get User Number
        int num = Validator.getInt(scan, userName + ", " + "Enter a Number "
                    + "between 1 and 100: \n", 1, 100);

            //Positive Integer Validation
            while (num < 1 || num > 100) {
                System.out.println("Sorry, Invalid Choice. Try Again.");
            }

        //Output Results
        System.out.println(evenOdd(userName, num));


        //Continue? (To Lowercase)
        answer = Validator.getString(scan, "Would like to continue?\n" +
                "(Type \"yes\" or \"no\")\n").toLowerCase();
        }

        //Issues Goodbye
        System.out.println(GreetExit.bye(userName));
        scan.close();
    }

//Method - Determines if Number is Even or Odd
public static String evenOdd(String userName, int num) {

    //Statements - If Even
    if (num %2 ==0) {
       if (num < 25) {
           return userName + ", Your number is Even and Less Than 25.";
       }
       else if (num > 60) {
           return userName + ", Your number is: " + num + " Even.";
       }
       else {
           return userName + ", Your number is Even";
       }
    }
    //Statements - If Odd
    else {
        return userName + ", Your number is: " + num + " Odd";
    }

}

}