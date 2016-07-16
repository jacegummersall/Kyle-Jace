/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import java.util.Random;

/**
 *
 * @author kylehathaway
 */
public class PotionControl {
    
    public static int usePotion(int pokemonCurrentHP, int pokemonFullHP)
                            throws PotionControlException {
        
        if (pokemonCurrentHP > pokemonFullHP){
            throw new PotionControlException("Your Pokémon has full HP.");
        }
        if (pokemonCurrentHP < 1){
            throw new PotionControlException("Your Pokémon has already fainted.");
        }
        
        Random random = new Random();
        
        int pokemonNewHP = pokemonCurrentHP + 20 + random.nextInt(10);
        
        return pokemonNewHP;
    
    }
    
    public static int useSuperPotion(int pokemonCurrentHP, int pokemonFullHP)
                            throws PotionControlException {
        
        if (pokemonCurrentHP > pokemonFullHP){
            throw new PotionControlException("Your Pokémon has full HP.");
        }
        if (pokemonCurrentHP < 1){
            throw new PotionControlException("Your Pokémon has already fainted.");
        }
        
        Random random = new Random();
        
        int pokemonNewHP = pokemonCurrentHP + 50 + random.nextInt(10);
        
        return pokemonNewHP;
    
    }
}
