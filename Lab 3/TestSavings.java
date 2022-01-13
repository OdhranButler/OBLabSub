// Student Name 	: Odhrán Butler
// Student Id Number: C00263565
// Date 			: Oct-2021
// Purpose 			: class implementation

public class TestSavings {
    public static void main(String[] args) throws Exception {
        
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        SavingsAccount.setInterest(4);
        saver1.setBalance(2000);
        saver2.setBalance(3000);

        saver1.calculateMontlyInterest();
        saver2.calculateMontlyInterest();

        System.out.println(saver1.getBalance());
        System.out.println(saver2.getBalance());

        SavingsAccount.modifyInterestRate(5);

        saver1.calculateMontlyInterest();
        saver2.calculateMontlyInterest();

        System.out.println(saver1.getBalance());
        System.out.println(saver2.getBalance());
        


    }
}