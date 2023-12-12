public class UpSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public UpSave(BankAccount bankAccount) {
        setBankAccount(bankAccount);
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return bankAccount.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        double balance = bankAccount.getBalance();
        return (getInterestRate() * balance) + balance;
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }

}

