public class Conversions
{
    private int iQuarters = 0, iDimes = 0, iNickels = 0, iPennies = 0;
    final double QUARTER_WORTH = 0.25, DIME_WORTH = 0.1, NICKEL_WORTH = 0.05, PENNY_WORTH = 0.01, DOLLAR_WORTH = 1.0, FIVE_DOLLAR_WORTH = 5.0, TEN_DOLLAR_WORTH = 10.0;
    double fWorth;

    public Conversions()
    {

    }

    public void InsertCoins(int iQ, int iD, int iN, int iP)
    {
        this.iQuarters += iQ;
        this.iDimes += iD;
        this.iNickels += iN;
        this.iPennies += iP;

        CalculateWorth();
    }

    public double GetWorth()
    {
        CalculateWorth();

        return fWorth;
    }

    private void CalculateWorth()
    {
        fWorth = (iQuarters * QUARTER_WORTH) + (iDimes * DIME_WORTH) + (iNickels * NICKEL_WORTH) + (iPennies * PENNY_WORTH);
    }
}
