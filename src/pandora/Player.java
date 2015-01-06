package pandora;

import java.util.ArrayList;

public class Player {

  public ArrayList<Item> Inventory;
  private final Room startRoom;
  public Room currentRoom;

  public Player(Room spawnPlayer) {
      this.startRoom = spawnPlayer;
      this.currentRoom = spawnPlayer;
      this.Inventory = new ArrayList<>();
  }

  public void showInventory() {
  }
  public void move(Room movingRoom) 
  {
      this.currentRoom = movingRoom;
  }

}