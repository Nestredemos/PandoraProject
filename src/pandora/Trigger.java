package pandora;

public class Trigger {

  private String nameTrigger;
  private Room toTrigger;


  public void callTrigger() {
  }

  public Trigger(String name, Room roomToTrigger) {
      this.nameTrigger = name;
      this.toTrigger = roomToTrigger;
  }

}