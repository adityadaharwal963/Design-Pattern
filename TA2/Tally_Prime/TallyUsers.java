package TA2.Tally_Prime;

import java.util.List;

/*
 * TallyUsers
 * 
 */
public abstract class TallyUsers {
    protected TallyUsers root;
    protected String name;
    protected List<String> permissions;
    TallyUsers(String name ,List<String> permissions,TallyUsers root){
        this.name = name;
        this.permissions = permissions;
        this.root = root;
    }
    void setPermissions(List<String> permissions){
        this.permissions = permissions;
    }
    void addPremission(String permission){
        permissions.add(permission);
    }
    void removePremission(String permission){
        if(permissions.contains(permission))
            permissions.remove(permission);
    }
    void display(){
        System.out.println("============================\n" +
                "Name='" + this.name + '\'' +
                ", permissions=" + this.permissions +
                ", UserGroup=" + this.root.getName() 
                );
    }
    String getName(){
        return name;
    }
    
    
    List<String> getPermissions(){
        return permissions;
    }

    boolean hasPremission(String permission){
        if(permissions.contains(permission)){
            return true;
        }    
        return false;
    }
    abstract List<TallyUsers> getSubUsers();
    abstract void add(TallyUsers user);

} 
