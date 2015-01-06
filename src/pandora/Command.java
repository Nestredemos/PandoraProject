/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandora;
/**
 *
 * @author Cyril, Abdelrahmane
 */
public class Command {

    public void goNorth (Room actualRoom, Player Player1)
    {
        Player1.move(actualRoom.getDirection("North"));
    }
    public void goSouth (Room actualRoom, Player Player1)
    {
        Player1.move(actualRoom.getDirection("South"));
    }
    public void goEast (Room actualRoom, Player Player1)
    {
        Player1.move(actualRoom.getDirection("East"));
    }
    public void goWest (Room actualRoom, Player Player1)
    {
        Player1.move(actualRoom.getDirection("West"));
    }
}
