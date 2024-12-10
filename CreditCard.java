
package first;



    public class CreditCard {
    private String customer;    
    private String bank;        
    private String account;    
    private int limit;          
    private double balance;     
    
    public CreditCard(String customer, String bank, String account, int limit, double initialBalance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = initialBalance;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false; 
        }
        balance += price;
        return true; 
    }

    public void makePayment(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    public void updateLimit(int newLimit) {
        if (newLimit > 0) {
            this.limit = newLimit;
        } else {
            System.out.println("Credit limit must be positive.");
        }
    }

    public void displayCardDetails() {
        System.out.println("Customer: " + customer);
        System.out.println("Bank: " + bank);
        System.out.println("Account: " + account);
        System.out.println("Limit: " + limit);
        System.out.println("Balance: $" + balance);
    }

    public static void main(String[] args) {

        CreditCard card = new CreditCard("John Doe", "ABC Bank", "1234-5678-9012", 5000, 1000.0);

        card.displayCardDetails();

        System.out.println("\nUpdating credit limit to $7500...");
        card.updateLimit(7500);

        card.displayCardDetails();
    }
}

