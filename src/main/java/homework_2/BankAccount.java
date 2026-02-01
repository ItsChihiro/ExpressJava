package homework_2;

public class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner() {
        return this.owner;
    }

    double getBalance() {
        return this.balance;
    }

    void setOwner(String newOwner){
        this.owner = newOwner;
    }

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void printBalance() {
        System.out.println("Balance = " + this.balance);
    }

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Max", 32000);
        bankAccount1.deposit(345.55);
        bankAccount1.withdraw(789.34);
        bankAccount1.printBalance();
    }
}
