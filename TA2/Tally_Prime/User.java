package TA2.Tally_Prime;

import java.util.List;

class User extends TallyUsers {
    private String email;
    private String password;

    public User(String username, String email, List<String> permissions,String password,TallyUsers root) {
        super(username,permissions,root);
        this.email = email;
        this.password = password;
        this.permissions = permissions;
    }


    public String getEmail() {
        return email;
    }

    public boolean verifyPassword(String password){
        if(this.password.equals(password)){
            return true;
        }
        return false;
    }

 

    @Override
    public void display() {
        super.display();
        System.out.println(
                ", email='" + this.email + '\''
                );
    }
    @Override
    List<TallyUsers> getSubUsers(){
        return null;
    }

    @Override
    void add(TallyUsers user){
        System.out.println("invalid operation");
    }

    void selectCompany(){

    }
}


