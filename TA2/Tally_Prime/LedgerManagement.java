package TA2.Tally_Prime;

import java.util.Scanner;

class LedgerManagement {
    private Scanner scanner;

    public LedgerManagement(Scanner scanner) {
        this.scanner = scanner;
    }

    public void showMasters(User user) {
        int choice;
        do {
            System.out.println("\n--- Masters ---");
            System.out.println("1. Create Ledgers");
            System.out.println("2. Alter Ledgers");
            System.out.println("3. Back to Main Menu");
            System.out.print("Choose an option: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    createLedger();
                    break;
                case 2:
                    alterLedger();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);
    }

    private void createLedger() {
        System.out.println("Creating ledger...");
        System.out.print("Enter ledger name: ");
        String ledgerName = scanner.next();
        System.out.println("Ledger created successfully!");
    }

    private void alterLedger() {
        System.out.println("Altering ledger...");
        // Add logic to modify ledgers
    }
}
