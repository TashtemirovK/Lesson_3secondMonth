public class Main {
    public static void main(String[] args) {
        BankAccount KICB = new BankAccount();
        KICB.deposit(20000);
        while (true) {
            try {
                KICB.withDraw(6000);
            } catch (LimitException j) {
                double remainingAmount = j.getRemainingAmount();
                double balance = KICB.getBalance();

                System.out.println("У вас на счету: " + balance);
                System.out.println("Вы можете снять: " + remainingAmount);
                System.out.println("Вы сняли со счета: " + remainingAmount);

                try {
                    KICB.withDraw((int) remainingAmount);
                } catch (LimitException ex) {
                    ex.printStackTrace();
                }
                System.out.println("Остаток баланса: " + KICB.getBalance());
                break;
            }
        }
    }
}