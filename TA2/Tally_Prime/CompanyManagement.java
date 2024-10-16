package TA2.Tally_Prime;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;;
/*
 * company has list of legder
 * company has list of invertory
 * company has list of Transaction
 */
// default class => private to package
class CompanyManagement {
    private Scanner scanner;
    CompanyManagement(Scanner scanner) {
        this.scanner = scanner;
    }

    void showCompanyInfo(User user) {
        int choice;
        do {
            System.out.println("\n--- Company Info ---");
            System.out.println("1. Create Company");
            System.out.println("2. Alter Company");
            System.out.println("3. Delete Company");
            System.out.println("4. Display Company Info");
            System.out.println("5. Back to Main Menu");
            System.out.print("Choose an option: ");
            
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    createCompany(user);
                    break;
                case 2:
                    alterCompany(user);
                    break;
                case 3:
                    deleteCompany(user);
                    break;
                case 4:
                    displayCompanyInfo(user);
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);
    }

    private void createCompany(User user) {
        System.out.println("Creating new company...");
        System.out.print("Enter company name: ");
        String companyName = scanner.next();
        System.out.print("Enter company address: ");
        String companyAddress = scanner.next();
        System.out.print("Enter financial year start date: ");
        String financialYearStart = scanner.next();
        System.out.println("Company created successfully!");
       
    }

    private void alterCompany(User user) {
        System.out.println("Altering company details...");
        // Add logic to modify company details
    }

    private void deleteCompany(User user) {
        System.out.println("Deleting company...");
        // Add logic to delete company
    }

    private void displayCompanyInfo(User user) {
        System.out.println("Displaying company information...");
        // Add logic to display company information
    }
}

