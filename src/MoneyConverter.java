/**
 * @author Z
 * @since 3 October 2017
 */

import java.util.Scanner;

public class MoneyConverter
{
    private final static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args)
    {
        int iOption = PromptInput("Enter 1 for coin conversion, enter 2 for float convert: ");

        if (iOption == 1)
        {
            int iQuarters, iDimes, iNickels, iPennies;

            iQuarters = PromptInput("Number of quarters: ");
            iDimes = PromptInput("Number of dimes: ");
            iNickels = PromptInput("Number of nickels: ");
            iPennies = PromptInput("Number of pennies: ");
        }
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
