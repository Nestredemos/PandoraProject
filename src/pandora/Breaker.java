package pandora;

import java.util.*;

public class Breaker
{
    private final String nameBreaker;
    private final Item toBreak;
    

    /**
     * Constructor for objects of class Breakers
     * @param nameBreaker
     * @param toBreak
     */
    public Breaker(String nameBreaker,Item toBreak)
    {
        this.nameBreaker = nameBreaker;
        this.toBreak = toBreak;
    }
    /**
     * Check if the breaker can be cancelled if the player have the right item
     * @param ThePlayer
     * @return 
     */
    public Boolean checkBreaker(Player ThePlayer){
        Boolean value = false;
        Iterator<Item> it = ThePlayer.Inventory.iterator();
 
        while (it.hasNext()) {
           Item temp = it.next();
           if (temp==this.toBreak){
               value=true;
           }
        }
        if (value) {
            return value; //guard value, Breaker will be deleted
        } else {
            return value; //Breaker will be kept
        }
    }
}
