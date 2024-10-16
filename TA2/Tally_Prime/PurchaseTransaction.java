package TA2.Tally_Prime;

import java.util.Scanner;
public class PurchaseTransaction extends Transaction {
    public PurchaseTransaction(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void displayTransactionDetails() {
        System.out.println("\n--- Purchase Transaction ---");
        System.out.println("Enter the details of the purchase...");
    }

    @Override
    protected void processTransaction() {
        System.out.print("Enter purchase amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter supplier name: ");
        String supplierName = scanner.next();
        System.out.println("Processing purchase from " + supplierName + " of amount: " + amount);
    }
}