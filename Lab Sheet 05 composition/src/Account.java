public class Account {
    private final int accNo;
    private final Customer customer;
    private double balance;

    public Account(int accNo, Customer customer) {
        this.accNo = accNo;
        this.customer = customer;
    }

    public Account(int accNo, Customer customer, double balance) {
        this.accNo = accNo;
        this.customer = customer;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString(){
        return String.format("%s(%d) balance = Rs %.2f", customer.getName(),customer.getId(),balance);
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        if(balance >= amount){
            balance = balance - amount;
        }else {
            System.out.println("Withdraw amount exceeded account balance.");
        }
    }

    public static void main(String[] args){
        Customer customer1 = new Customer(1234, "Kaveen", 'M');
        Account account = new Account(0001, customer1, 50000.05);

        System.out.println(account);
        account.deposit(20000.54);
        System.out.println(account);
        account.withdraw(15500);
        System.out.println(account);
    }
}
