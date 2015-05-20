
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuudou
 */
public class Dice {
    Random d6 = new Random();
    public int rollDie() {
        return d6.nextInt(5) + 1; 
    }
}
