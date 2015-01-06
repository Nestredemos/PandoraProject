package pandora;

import java.util.ArrayList;
import java.util.HashMap;

public class Room {

  private final ArrayList<Item> containedItems;
  private final String description; //pas sur que ce soit final
  private final HashMap roomHash; //pas sur que ce soit final
  private final int ID;

  public Room(String descriptionRoom, Integer IDroom) {
      this.description = descriptionRoom;
      this.roomHash = new HashMap<String,Room>();
      this.containedItems = new ArrayList<Item>();
      this.ID = IDroom;
  }

  public void addExit(String Direction,Room RoomName) 
    {
        this.roomHash.put(Direction,RoomName);
    }
  
  public String getDescription()
    {
        return this.description;
    }
  public Room getDirection(String direction)
  {
      return (Room) this.roomHash.get(direction);
  }
}