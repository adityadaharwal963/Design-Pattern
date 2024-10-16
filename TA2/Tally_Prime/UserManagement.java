package TA2.Tally_Prime;
import java.util.List;
import java.util.Scanner;

class UserManagement {
    private Scanner scanner;
    private boolean Logedin;
    private UserGroup rootTallyUsers  = new UserGroup("root", List.of("View Reports", "Create Company", "Transactions", "Manage Users"), null); 

    UserManagement(Scanner scanner,User admin) {
        this.scanner = scanner;
        this.Logedin = false;
        rootTallyUsers.add(admin);
        // Initialize some default groups
    }

    boolean isUserLogedIN(){
        return Logedin;
    }

    void showUserManagement() {
        int choice;
        do {
            System.out.println("\n--- User Management ---");
            System.out.println("1. Create User");
            System.out.println("2. Create User Group");
            System.out.println("3. Update User Permissions");
            System.out.println("4. Back to Gateway");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    createUser();
                    break;
                case 2:
                    createUserGroup();
                    break;
                case 3:
                    updatePermissions();
                    break;
                case 4:
                    return;  // Go back to the main menu
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 6);
    }

    // Method to create a new user
    private void createUser() {
        System.out.print("Enter Username: ");
        String username = scanner.next();
        System.out.print("Enter Email ID: ");
        String email = scanner.next();
        System.out.print("Enter password: ");
        String password = scanner.next();
        
        System.out.println("Select User Group:");
        rootTallyUsers.displayUserGroup();
        String groupChoice = scanner.next();
        // Create a new user with the selected group and its permissions
        UserGroup selectedGroup = rootTallyUsers.searchGroup(groupChoice);

        if(selectedGroup==null){
            selectedGroup = rootTallyUsers;
        }

            // show group permission
            List<String> groupPermission = selectedGroup.getPermissions();
            System.out.println(groupPermission);
            System.out.println("Enter permissions for this User (comma-separated):");
            scanner.nextLine();
            String permissionsInput = scanner.nextLine();
            // user enter group permission
            List<String> permissions = List.of(permissionsInput.split(","));
            boolean flag = true;
            for(String permission : permissions){
                if(!(groupPermission.contains(permission))){
                    System.out.println("Invalid choice , user not created");
                    flag = false;
                    break;
                }
            }

            if(flag){
                User newUser = new User(username, email, permissions,password,selectedGroup);
                selectedGroup.add(newUser);
                System.out.println("User created successfully!");
        
            }
        
    }

    // Method to create a new user group
    private void createUserGroup() {
        System.out.print("Enter User Group Name: ");
        String groupName = scanner.next();

        System.out.println("Select User Group:");
        rootTallyUsers.displayUserGroup();
        String groupChoice = scanner.next();

        // Create a new user with the selected group and its permissions
        UserGroup selectedGroup = rootTallyUsers.searchGroup(groupChoice);

        if(selectedGroup==null){
            selectedGroup = rootTallyUsers;
        }
            // show group permission
            List<String> groupPermission = selectedGroup.getPermissions();
            System.out.println(groupPermission);
            System.out.println("Enter permissions for this User (comma-separated):");
            scanner.nextLine();
            String permissionsInput = scanner.nextLine();
            // user enter group permission
            List<String> permissions = List.of(permissionsInput.split(","));
            boolean flag = true;

            for(String permission : permissions){
                if(!(groupPermission.contains(permission))){
                    System.out.println("Invalid choice , User Group not created");
                    flag = false;
                    break;
                }
            }
            if(flag){
                UserGroup newUserGroup = new UserGroup(groupName, permissions,selectedGroup);
                selectedGroup.add(newUserGroup);
                System.out.println("User Group created successfully!");
            }
        }

    // Method to update user permissions
    private void updatePermissions() {
        System.out.println("Enter Name to Update Permissions:");

        String userChoice = scanner.next();
        
        TallyUsers selectedUser = rootTallyUsers.searchUser(userChoice);
        if(selectedUser!= null){
            if(selectedUser.root != null){
            List<String> groupPermission = selectedUser.root.getPermissions();
            System.out.println("Current Permissions: " + selectedUser.getPermissions());
            System.out.println("Enter new permissions (comma-separated):");
            System.out.println("from list : " + groupPermission);
            scanner.nextLine();
            String newPermissionsInput = scanner.nextLine();
            List<String> newPermissions = List.of(newPermissionsInput.split(","));
            boolean flag = true;
            for(String permission : newPermissions){
                if(!(groupPermission.contains(permission))){
                    System.out.println("Invalid choice , denied");
                    flag = false;
                    break;
                }
            }
            if(flag){
                // Update the user's permissions
                selectedUser.setPermissions(newPermissions);
                System.out.println("Permissions updated successfully!");
            }
        }else{
            System.out.println("updating admin user permission, not allowed");
        }
        }
    }

    // Method to log in as a user (select a user and check their credentials)
    User loginUser() {
        System.out.println("Enter Username: ");
        String username = scanner.next();
        System.out.println("Enter Password: ");
        String password = scanner.next();

        // Check if the username exists
        User foundUser = rootTallyUsers.searchUser(username);

        if (foundUser != null && foundUser.verifyPassword(password)) {
            System.out.println("Login successful for user: " + foundUser.getName());
            Logedin = true;
        } else {
            System.out.println("User not found/wrong password. Login failed.");
        }
        return foundUser;
    }

    void logoutUser(User user){
        User foundUser = rootTallyUsers.searchUser(user.getName());
        if(foundUser != null){
            Logedin = false;
            System.out.println(user.getName()+ " logout");
        }else{
            System.out.println("some error occured");
        }
    }
}
