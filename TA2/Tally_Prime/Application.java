package TA2.Tally_Prime;

import java.util.List;
import java.util.Scanner;
/*
 * To ensure that only one instance of the `Application` class exists, managing overall system operations.
 */
// default class => private to package
class Application {
    private TallyPrime tallyPrime = TallyPrime.getInstance();
    private UserManagement userManagement;
    private User user;
    private Scanner scanner;
    private CompanyManagement companyManagement;
    private LedgerManagement ledgerManagement;
    private TransactionManagement transactionManagement;
    private ReportManagement reportManagement;
    private static Application instance;
    private Application() {
        
        this.scanner = new Scanner(System.in);
        this.user = this.createAdminUser(); // create a admin user when application start (in real system state of system is stored hard drive)
        this.companyManagement = new CompanyManagement(scanner);
        this.ledgerManagement = new LedgerManagement(scanner);
        this.transactionManagement = new TransactionManagement(scanner);
        this.reportManagement = new ReportManagement(scanner);
        this.userManagement = new UserManagement(scanner,this.user);
        
    }

    public static synchronized Application getInstance() {
        //SingleTon object
            if (instance == null) {
            instance = new Application();    
            }
        return instance;
    }

    public void showMainMenu(){
        int choice;
        
        do {
            System.out.println("\n===========================");
            System.out.println("  Tally Prime Main Menu");
            System.out.println("===========================");
            System.out.println("1. UserManagement");
            System.out.println("2. Company ");
            System.out.println("3. Masters");
            System.out.println("4. Transactions");
            System.out.println("5. Display Reports");
            System.out.println("6. Logout");
            System.out.println("7. Exit");
            System.out.print("\nPlease choose an option (1-7): ");
            
            choice = scanner.nextInt();
            if(userManagement.isUserLogedIN())
            switch (choice) {
                case 1:
                    this.userManagement.showUserManagement();
                    break;
                case 2:
                    
                    companyManagement.showCompanyInfo(user);
                    break;
                case 3:
                    ledgerManagement.showMasters(user);
                    break;
                case 4:
                    transactionManagement.showTransactions(user);
                    break;
                case 5:
                    reportManagement.displayReports(user);
                    break;
                case 6:
                    userManagement.logoutUser(user);
                    user = null;
                    break;
                case 7:
                    System.out.println("Exiting Tally Prime Simulation...");
                    tallyPrime.deactivate();
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
            else if(choice != 7){
                System.out.println("Please Login to move further ");
                user = userManagement.loginUser();
            }
        } while (choice != 7);
        
        scanner.close();
    }
    
    private User createAdminUser(){
        System.out.println("Create a Admin User");
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter Email ID: ");
        String email = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        return new User(username, email,  List.of("View Reports", "Create Company", "Transactions", "Manage Users"), password, null);
    }
}
