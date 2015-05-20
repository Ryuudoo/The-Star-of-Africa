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
    Space currentLoc; // the space the player currently is in
    int money = 300; // the player's current money
    boolean hasStar = false; // true if the player has the Star of Africa
    Dice dice = new Dice();

    public Player(int playerID, City startLoc) { //startLoc should be either Kairo or Tangier
        this.ID = playerID;
        this.currentLoc = startLoc;
    }

    public void openToken() {
        if (currentLoc instanceof City) {
            City target = (City) currentLoc;
            if (target.token != null && (money >= 100 || dice.rollDie() >= 4)) {
                Token opened = target.open(this);
                if (money >= 100) {
                    money -= 100;
                }
                switch (opened.typeID) {
                    case 0:
                        break;
                    case 1:
                        money += 300;
                    case 2:
                        money += 500;
                    case 3:
                        money += 1000;
                    case 4:
                        money = 0;
                    case 5:
                        break;
                        //TODO: implement being able to win with horseshoe if Star has been picked up
                    case 6:
                        hasStar = true;
                }
            }
        }
    }

}
