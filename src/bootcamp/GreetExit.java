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

class GreetExit {

    //Method - Greets the User
    static String hello(Scanner scan) {
        //Greeting and UserName Request
        String user = Validator.getString(
        scan, "Hi. Welcome to the the Java Decision Maker App.\n" +
            "Please tell me your name?\n");

        return user;
    }

    //Method - Farewells the User
    static String bye(String userName) {
        return "\nFarewell " + userName + ",\nUntil Next Time!!!";
    }




}
