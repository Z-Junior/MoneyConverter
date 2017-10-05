class Conversions
{
    private int iQuarters = 0, iDimes = 0, iNickels = 0, iPennies = 0;
    private final double QUARTER_WORTH = 0.25, DIME_WORTH = 0.1, NICKEL_WORTH = 0.05, PENNY_WORTH = 0.01, DOLLAR_WORTH = 1.0, FIVE_DOLLAR_WORTH = 5.0, TEN_DOLLAR_WORTH = 10.0;
    private double fWorth;

    Conversions()
    {

    }

    void InsertCoins(int iQ, int iD, int iN, int iP)
    {
        this.iQuarters += iQ;
        this.iDimes += iD;
        this.iNickels += iN;
        this.iPennies += iP;

        CalculateWorth();
    }

    double GetWorth()
    {
        CalculateWorth();

        return fWorth;
    }

    int[] GetCoinsFromMonetary(double fWorth)
    {
        int Tens = (int) Math.floor(fWorth / TEN_DOLLAR_WORTH);
        int Fives = (int) Math.floor((fWorth % TEN_DOLLAR_WORTH) / FIVE_DOLLAR_WORTH);
        int Ones = (int) Math.floor(((fWorth % TEN_DOLLAR_WORTH) % FIVE_DOLLAR_WORTH) / DOLLAR_WORTH);
        int Quarters = (int) Math.floor((fWorth % TEN_DOLLAR_WORTH % FIVE_DOLLAR_WORTH % DOLLAR_WORTH) / QUARTER_WORTH);
        int Dimes = (int) Math.floor((fWorth % TEN_DOLLAR_WORTH % FIVE_DOLLAR_WORTH % DOLLAR_WORTH % QUARTER_WORTH) / DIME_WORTH);
        int Nickles = (int) Math.floor((fWorth % TEN_DOLLAR_WORTH % FIVE_DOLLAR_WORTH % DOLLAR_WORTH % QUARTER_WORTH % DIME_WORTH) / NICKEL_WORTH);
        int Pennies = (int) Math.ceil((fWorth % TEN_DOLLAR_WORTH % FIVE_DOLLAR_WORTH % DOLLAR_WORTH % QUARTER_WORTH % DIME_WORTH % NICKEL_WORTH) / PENNY_WORTH);

        return new int[]{Tens, Fives, Ones, Quarters, Dimes, Nickles, Pennies};
    }

    private void CalculateWorth()
    {
        fWorth = (iQuarters * QUARTER_WORTH) + (iDimes * DIME_WORTH) + (iNickels * NICKEL_WORTH) + (iPennies * PENNY_WORTH);
    }
}
