package TA2.Tally_Prime;

import java.util.Scanner;

public class ReportManagement {
    private Scanner scanner;

    public ReportManagement(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayReports(User user) {
        System.out.println("\n--- Display Reports ---");
        System.out.println("1. Profit & Loss Statement");
        System.out.println("2. Balance Sheet");
        System.out.println("3. Cash Flow Statement");
        System.out.println("4. GST Reports");
        System.out.println();
    }
}


