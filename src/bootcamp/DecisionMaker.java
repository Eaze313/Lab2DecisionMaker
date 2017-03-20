package bootcamp;
import java.util.Scanner;

/**
 * James Bryant II
 * 1/31/17
 * DecisionMaker.java
 * This program prompts the user to enter an integer between
 * 1-100 and displays the result based on the integer range entered.
 */
public class DecisionMaker {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Greeting
        System.out.println("Welcome to Lab2!");
        System.out.println(" ");

        //User Interaction

        String userName = Validator.getString(scan, "What is you're name? ");

        System.out.println("Hello, " + userName);

        //Initialized Variable for close
        String answer;

    do {
        int num = Validator.getInt(scan, "Enter a Number between 1 and 100: ",1,100 );

        //IF-Else Statements to decide what prints to screen
        if (num %2 != 0 && num < 60){
            System.out.println(num + " Odd");
        }
        else if (num %2 == 0 && num >=2 && num < 26){
            System.out.println("Even and less than 25");
        }
        else if (num %2 == 0 && num > 60) {
            System.out.println(num + " Even");
        }
        else {
            System.out.println("Odd");
        }
        System.out.println("Do You Want to Continue? (Type 'no' to quit.)");

        //get the response, turn it lower case
         answer = scan.next().toLowerCase();
    } while (!answer.equals("no"));

        System.out.println("Thanks. See You Next Time");









    }//end main
}//end class