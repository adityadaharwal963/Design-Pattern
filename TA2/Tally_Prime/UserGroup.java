package TA2.Tally_Prime;

import java.util.ArrayList;
import java.util.List;

public class UserGroup extends TallyUsers {
    private List<TallyUsers> users;
    
    UserGroup(String name,List<String> permissions,TallyUsers root){
        super(name,permissions,root);
        this.users = new ArrayList<TallyUsers>();
    }

    @Override
    List<TallyUsers> getSubUsers(){
        return users;
    }

    @Override
    void display() {
        super.display();
        System.out.println(
                "'" + this.name + '\'' + ":"
                );
        for(TallyUsers user : users){
            System.out.println("::");
            user.display();
        }
    }

    void displayUserGroup(){
        System.out.println(name);
        for(TallyUsers group: users){
            if(group instanceof UserGroup){
                ((UserGroup)group).displayUserGroup();
            }
        }
    }

    User searchUser(String name){
        for(TallyUsers user: users){
            if(user instanceof User && user.name.equalsIgnoreCase(name)){
                return (User)user;
            }
        }
        return null;
    }

    TallyUsers search(String name){
        for(TallyUsers user: users){
            if(user.name.equalsIgnoreCase(name)){
                return user;
            }
        }
        return null;
    }

    UserGroup searchGroup(String name){
        for(TallyUsers user: users){
            if( user instanceof UserGroup && user.name.equalsIgnoreCase(name)){
                return (UserGroup)user;
            }
        }
        return null;
    }

    @Override
    void add(TallyUsers user){
        users.add(user);
    }

}
