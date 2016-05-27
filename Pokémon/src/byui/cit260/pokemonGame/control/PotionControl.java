/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import java.util.Random;

/**
 *
 * @author kylehathaway
 */
public class PotionControl {
    
    public int usePotion(int pokemonCurrentHP, int pokemonFullHP) {
        if (pokemonCurrentHP >= pokemonFullHP){
            return -1;
        }
        if (pokemonCurrentHP < 1){
            return -2;
        }
        
        Random random = new Random();
        
        int usePotion = pokemonCurrentHP + 20 + random.nextInt(10);
        
        return usePotion;
    
    }
}
