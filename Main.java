import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Welcome to the Banking System ===");

        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();

        System.out.print("Enter PIN: ");
        int pin = scanner.nextInt();

        BankAccount user = bank.findAccount(accNum, pin);

        if (user != null) {
            bank.performTransaction(user);
        } else {
            System.out.println("Invalid account number or PIN.");
        }

        scanner.close();
    }
}