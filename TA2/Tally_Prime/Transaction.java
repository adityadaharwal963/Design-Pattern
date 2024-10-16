package TA2.Tally_Prime;

import java.util.Scanner;
abstract class Transaction {
    protected Scanner scanner;

    public Transaction(Scanner scanner) {
        this.scanner = scanner;
    }

    // Template method
    public final void executeTransaction() {
        displayTransactionDetails();
        processTransaction();
        finalizeTransaction();
    }

    // Step 1: Display details of the transaction type
    protected abstract void displayTransactionDetails();

    // Step 2: Process the specific transaction
    protected abstract void processTransaction();

    // Step 3: Finalize the transaction (common to all transactions)
    private void finalizeTransaction() {
        System.out.println("\n1.GST bill\n2.Non GST bill\nEnter choice: ");
        String choice = scanner.next();
        System.out.println("Transaction completed.");
    }
}
