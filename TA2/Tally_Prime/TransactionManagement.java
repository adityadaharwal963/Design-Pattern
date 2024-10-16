package TA2.Tally_Prime;

import java.util.Scanner;

public class TransactionManagement {
    private Scanner scanner;
    private SalesTransaction salesTransaction;
    private PurchaseTransaction purchaseTransaction;
    private PaymentTransaction paymentTransaction;
    private ReceiptTransaction receiptTransaction;

    public TransactionManagement(Scanner scanner) {
        this.scanner = scanner;
        this.paymentTransaction = new PaymentTransaction(scanner);
        this.purchaseTransaction = new PurchaseTransaction(scanner);
        this.receiptTransaction = new ReceiptTransaction(scanner);
        this.salesTransaction = new SalesTransaction(scanner);
    }

    public void showTransactions(User user) {
        System.out.println("\n--- Transactions ---");
        System.out.println("1. Sales");
        System.out.println("2. Purchases");
        System.out.println("3. Payments");
        System.out.println("4. Receipts");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                salesTransaction.executeTransaction();
                break;
            case 2:
                purchaseTransaction.executeTransaction();
                break;
            case 3:
                paymentTransaction.executeTransaction();
                break;
            case 4:
                receiptTransaction.executeTransaction();
                break;
            default:
                System.out.println("Invalid choice. Returning to Main Menu...");
        }
    }

}
