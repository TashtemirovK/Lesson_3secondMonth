public class BankAccount {
    private double amount;
    private double balance;

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double sum){
        amount += sum;
        System.out.println("Вы сняли со счета: " + sum);
    }
    public void withDraw(int sum) throws LimitException{
        if (amount < sum) {
            throw new LimitException("На вашем счету недостаточно средств: ", amount);
        } else {
            System.out.println("Вы можете снять со счета: " + sum);
            amount -= sum;
            System.out.println("Вы сняли со счета: " + sum);
        }
    }
}
