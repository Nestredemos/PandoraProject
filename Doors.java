package pandora;

public class Doors {

  private final Breaker doorBreaker;
  private final Room room1;
  private final Room room2;

  public Doors(Room idRoom1, Room idRoom2, Breaker nameBreaker) {
      this.room1 = idRoom1;
      this.room2 = idRoom2;
      this.doorBreaker = nameBreaker;
  }

  public void isLocked() {
  }

  public void unLocked() {
  }

  public Room currentRoom() {
    return null;
  }

}