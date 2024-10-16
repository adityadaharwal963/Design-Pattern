package TA2.Tally_Prime;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * Singleton desgin pattern ensures only one instance of `TallyPrime`, managing system-wide entry.
 */

public class TallyPrime {
    private static TallyPrime instance;
    private static Application application;
    private boolean isActived = false; 
    
    // consider this data is on tally server
    private List<String> validLicenseKeys = Arrays.asList("ABC123XYZ", "XYZ456ABC", "123XYZ789");
    private List<String> validEmails = Arrays.asList("user1@example.com", "user2@example.com", "admin@example.com");

    Scanner scanner = new Scanner(System.in);
    private TallyPrime() {

        // Initializing the system
        System.out.println("\n===========================");
        System.out.println(" Welcome Tally Prime ");
        System.out.println("===========================");
        
        //activating TallyPrime
        while(!isActived){
            isActived = activate();
            
            if(isActived){
                break;
            }else{
                System.out.println("Please activate the Tally Prime");
            }
        }

        
        
    }

    public void startApplication(){
        TallyPrime.application = Application.getInstance();
        TallyPrime.application.showMainMenu();
    }
    public static synchronized TallyPrime getInstance() {
        //SingleTon object
            if (instance == null) {
            instance = new TallyPrime();    
            }
        return instance;
    }

    private boolean activate(){
        System.out.println("\n--- Tally Prime Activation ---");
        // Input license key and email ID
        System.out.print("Enter License Key: ");
        String licenseKey = scanner.next();

        System.out.print("Enter Email ID: ");
        String email = scanner.next();

        // Validate license key and email ID (here we are using List instead of server)
        if (validLicenseKeys.contains(licenseKey) && validEmails.contains(email)) {
            System.out.println("License Key and Email ID are valid. Access granted!");
            return true;  // Authentication succeeded
        } else {
            System.out.println("Invalid License Key or Email ID. Access denied.");
            return false;  // Authentication failed
        }
    }

    // Tally prime provide login on single device (for single user mode)
    // To login in other device user must deactivate on this device; 
    public void deactivate(){
        this.isActived = false;
        System.exit(0); // Program terminated, will clear all static instance
    }

    
}