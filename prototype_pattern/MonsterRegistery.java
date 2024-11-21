import java.util.HashMap;

/*
 * Registry Hashmap
 */
public class MonsterRegistery {
    HashMap <String,Monster> map = new HashMap<>();

    void registeryMonster(String key, Monster m){
        map.put(key, m);
    }

    Monster createMonster(String key){
        Monster m = map.get(key);

        if(m==null){
            return null;
        }
        return m.clone();
    }
    
}
