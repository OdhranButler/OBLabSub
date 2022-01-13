public class SavingsAccount {
    
    private static int accountNum = 0;
    private static int annualInterestRate = 0;
    private int savingsBalance = 0;

    public SavingsAccount()
    {
        accountNum++;
    }

    public void setBalance(int balanceIn)
    {
        savingsBalance = balanceIn;
    }

    public int getBalance()
    {
        return savingsBalance;
    }

    public static void setInterest(int interestIn)
    {
        annualInterestRate = interestIn;
    }

    public int getInterest()
    {
        return annualInterestRate;
    }

    public static void modifyInterestRate(int newInterestIn)
    {
       annualInterestRate = newInterestIn;
    }


    public int calculateMontlyInterest()
    {
        int temp = ((getBalance() * getInterest()) / 12);
        setBalance(getBalance()+temp);
        return temp;
    }

}
