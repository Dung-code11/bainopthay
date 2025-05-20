/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bainopthayday2.bt1;

/**
 *
 * @author DUNG LE
 */
public class BankAccount {
    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(ownerName + " nap " + amount + " So du moi " + balance);
        } else {
            System.out.println("Loi Khong the nap so am");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Loi Khong the rut so am");
        } else if (amount > balance) {
            System.out.println("Loi So du khong du de rut " + amount);
        } else {
            balance -= amount;
            System.out.println(ownerName + " rut " + amount + " So du moi " + balance);
        }
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 2000);

        acc1.deposit(1000);
        acc1.withdraw(7000);
        acc1.withdraw(300);
        acc1.deposit(-500);

        acc2.withdraw(2500);
        acc2.withdraw(1500);

        System.out.println("So du Alice " + acc1.getBalance());
        System.out.println("So du Bob " + acc2.getBalance());
    }
}
