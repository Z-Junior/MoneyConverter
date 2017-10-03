/**
 * @author Z
 * @since 3 October 2017
 */

import java.util.Scanner;

public class MoneyConverter {
    private static int iQuarters, iDimes, iNickels, iPennies;
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        iQuarters = PromptInput("Number of quarters: ");
        iDimes = PromptInput("Number of dimes: ");
        iNickels = PromptInput("Number of nickels: ");
        iPennies = PromptInput("Number of pennies: ");
    }

    /**
     * Prompt user to enter an integer based on the question, and loop until integer only.
     * @param {Buffer} question
     * @return {Integer} User input
     */
    private static int PromptInput(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextInt())
        {
            System.out.flush();

            System.out.print("Whole number only: ");

            SCAN.next();
        }

        return SCAN.nextInt();
    }
}
