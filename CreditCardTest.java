
package first;


    public class CreditCardTest {
    public static void main(String[] args) {        CreditCard[] wallet = new CreditCard[3];
        wallet[0] = new CreditCard("John Bowman", "California Savings", "5391 0375 9387 5309", 2500, 0.0);
        wallet[1] = new CreditCard("John Bowman", "California Federal", "3485 0399 3395 1954", 3500, 0.0);
        wallet[2] = new CreditCard("John Bowman", "California Finance", "5391 0375 9387 5309", 5000, 0.0);

        for (int j = 1; j <= 16; j++) { 
            wallet[0].charge(200); 
            wallet[1].charge(300); 
            wallet[2].charge(400); 
        }

        for (CreditCard card : wallet) {
            System.out.println("\nCustomer = " + card.getCustomer());
            System.out.println("Bank = " + card.getBank());
            System.out.println("Account = " + card.getAccount());
            System.out.println("Balance = $" + card.getBalance());
            System.out.println("Limit = $" + card.getLimit());
            System.out.println("Exceeds limit? " + (card.getBalance() > card.getLimit()));
        }
    }
}


