/*
public class BankAccount {
    private String ID;
    private String name;
    private double balance;
    public BankAccount(String ID, String name, double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public double getBalance() {
        return balance;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("剩余金额"+ amount);
        } else {
            System.out.println("无效金额");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取款金额"+ amount+"剩余金额"+balance);
        } else {
            System.out.println("无效金额或超出余额");
        }
    }

}
*/
