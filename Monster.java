package pandora;

public class Monster {

  private final String nameMonster;
  private final Room spawn;
  private final int healthPoints;

  public Monster(String name, Room linked, int HP) {
      this.nameMonster = name;
      this.spawn = linked;
      this.healthPoints = HP;
  }

  public void checkWeapon() {
  }

  public void killMonster() {
  }

}