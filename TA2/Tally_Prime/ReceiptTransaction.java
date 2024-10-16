package TA2.Tally_Prime;
import java.util.Scanner;
public class ReceiptTransaction extends Transaction{
    public ReceiptTransaction(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void displayTransactionDetails() {
        System.out.println("\n--- Receipt Transaction ---");
        System.out.println("Enter the receipt details...");
    }

    @Override
    protected void processTransaction() {
        System.out.print("Enter receipt amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter payer name: ");
        String payerName = scanner.next();
        System.out.println("Processing receipt from " + payerName + " of amount: " + amount);
    }
}
