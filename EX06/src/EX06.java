public class EX06 {

    public static void main(String[] args) {

        BankAccount first = new BankAccount();
        BankAccount second = new BankAccount();

        first.addMoney(100.0);


        second.transferMoneyTo(second, 100.0);
        System.out.println(second.getBalance()); // 300.0
        System.out.println(first.getBalance()); // 0.0
        second.withdrawMoney(67.3);
        System.out.println(second.getBalance()); // 232.7
    }
}