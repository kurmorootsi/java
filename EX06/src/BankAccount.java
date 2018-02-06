    public class BankAccount {

    private double balance;


    public double getBalance() {
        return balance;
    }

    public double withdrawMoney(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            return balance;
        } else {
            return Double.NaN;
        }
    }

    public void addMoney(double amount) {
        /**
        Lisab raha juurde...
         */
        if (amount >= 0) {
            balance = balance + amount;
            return;
        }

    }
    public boolean transferMoneyTo(BankAccount targetAccount, double amount) {
        if (targetAccount == null) {
            return false;
        }
        if (amount > 0) {
            double fee = amount / 100;
            if (amount + fee <= balance) {
                if (withdrawMoney(amount + fee) != Double.NaN) {
                    targetAccount.addMoney(amount);
                    return true;
                } else {
                    return false;
                }
            }
        }
    return false;
    }

}
