package chapterThree;

public class Account {

    private int balance;

    public void deposit(int amountToDeposit) {
        if(amountToDeposit > 0);
        balance = balance + amountToDeposit;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amountToWithdraw) {
        if (amountToWithdraw <= balance)
        {
            balance = balance - amountToWithdraw;
        }
    }


}
