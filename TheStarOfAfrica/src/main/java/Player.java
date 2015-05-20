/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryudou
 */
public class Player {
    int ID; // the number of the player
    City currentLoc; // the city the player currently is or last was
    City target; // the city the player is headed to
    int distance; // the distance to target
    int money = 300; // the player's current money
    boolean hasStar = false; // true if the player has the Star of Africa
    public Player(int playerID, City startLoc) { //startLoc should be either Kairo or Tangier
        this.ID = playerID;
        this.currentLoc = startLoc;
    }
    
}
