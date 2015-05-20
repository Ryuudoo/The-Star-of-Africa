
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ryuudou
 */
public class Space {
    ArrayList<Space> neighbors;
    public Space() {
        
    }
    public void setNeighbors(ArrayList list) {
        neighbors = list;
    }
    public ArrayList<Space> getNeighbors() {
        return neighbors;
    }
}
