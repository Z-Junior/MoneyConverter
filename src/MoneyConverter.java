/**
 * @author Z
 * @since 3 October 2017
 */

import java.util.Scanner;

public class MoneyConverter
{
    private final static Scanner SCAN = new Scanner(System.in);
    private final static Conversions CONVERSIONS = new Conversions();

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

            CONVERSIONS.InsertCoins(iQuarters, iDimes, iNickels, iPennies);

            System.out.println("Monetary worth: " + CONVERSIONS.GetWorth());
        } else if (iOption == 2)
        {
            double fWorth = PromptInputDouble("Enter monetary worth: ");

            int[] Coins = CONVERSIONS.GetCoinsFromMonetary(fWorth);

            System.out.println("Worth: " + Coins[0] + " Ten Dollars, " + Coins[1] + " Five Dollars, " + Coins[2] + " Dollars, " + Coins[3] + " Quarters, " + Coins[4] + " Dimes, " + Coins[5] + " Nickels, " + Coins[6] + " Pennies");
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

    /**
     * Prompt user to enter an integer based on the question, and loop until integer only.
     * @param {Buffer} question
     * @return {Double} User input
     */
    private static double PromptInputDouble(String question)
    {
        System.out.print(question);

        while (!SCAN.hasNextDouble())
        {
            System.out.flush();

            System.out.print("Decimal only: ");

            SCAN.next();
        }

        return SCAN.nextDouble();
    }
}
