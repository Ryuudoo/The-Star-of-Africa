
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Ryudou
 */
public class City {
    String name;
    Token token;
    public City (String name, Token token) {
        this.name = name;
        this.token = token;
    }
    public Token open(Player player) {
        if (token != null) {
            Token returnThis = token;
            token = null;
            return returnThis;
        }
        return null;
    }
    
    
    
}
