package TA2.Tally_Prime;
import java.util.Scanner;
class SalesTransaction extends Transaction{
    SalesTransaction(Scanner scanner) {
        super(scanner);
    }

    @Override
    protected void displayTransactionDetails() {
        System.out.println("\n--- Sales Transaction ---");
        System.out.println("Enter the details of the sale...");
    }

    @Override
    protected void processTransaction() {
        System.out.print("Enter sale amount: ");
        double amount = this.scanner.nextDouble();
        System.out.print("Enter customer name: ");
        String customerName = scanner.next();
        System.out.println("Processing sale for " + customerName + " of amount: " + amount);
        // discounting
        System.out.printf("Discount: %.2f , Payable amount: %.2f",amount/10,amount-(amount/10));
    }
}
