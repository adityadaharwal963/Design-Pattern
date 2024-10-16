package TA2.RockPaperScissor_PrototypePattern;

import java.util.HashMap;

public class HandMovementRegistry {
    
     HashMap <String,HandMovement> map = new HashMap<>();

    void registeryHandMovement(String key, HandMovement h){
        map.put(key, h);
    }

    HandMovement makeHandMovement(String key){
        HandMovement h = map.get(key);

        if(h==null){
            return null;
        }
        return h.clone();
    }

}
