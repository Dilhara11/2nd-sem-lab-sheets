class BankTransaction{
    public void describeTransaction(){
        System.out.println("Generic Bank Transaction: \nThis is Generic Bank Transaction.\n");
    }
}

class DepositTransaction extends  BankTransaction{
    @Override
    public void describeTransaction(){
        System.out.println("Deposit Transaction: \nThis is Deposit Transaction.Adding Funds to Your Account\n");
    }
}

class WithdrawTransaction extends BankTransaction{
    @Override
    public void describeTransaction(){
        System.out.println("Withdraw Transaction: \nThis is Withdraw Transaction.Taking Funds From your account\n");
    }
}

public class BankingApplication {

    public static void main(String[] args){
        BankTransaction bankTransaction = new BankTransaction();
        BankTransaction bankTransaction1 = new DepositTransaction();
        BankTransaction bankTransaction2 = new WithdrawTransaction();

        bankTransaction.describeTransaction();
        bankTransaction1.describeTransaction();
        bankTransaction2.describeTransaction();

    }
}
