package TA2.Tally_Prime;

import java.util.Scanner;

public class PaymentTransaction extends Transaction {
    
    public PaymentTransaction(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void displayTransactionDetails() {
        System.out.println("\n--- Payment Transaction ---");
        System.out.println("Enter the payment details...");
    }

    @Override
    protected void processTransaction() {
        System.out.print("Enter payment amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter payee name: ");
        String payeeName = scanner.next();
        System.out.println("Processing payment to " + payeeName + " of amount: " + amount);
    }
}
