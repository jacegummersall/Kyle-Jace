/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Thunder
 */
public class PotionControlTest {
    
    public PotionControlTest() {
    }

    /**
     * Test of usePotion method, of class PotionControl.
     */
    @Test
    public void testUsePotion() throws PotionControlException{
        System.out.println("usePotion");
        
        System.out.println("\tTest case #1");
        
        int pokemonCurrentHP = -5;
        int pokemonFullHP = 60;
        PotionControl instance = new PotionControl();
        int expResult = -2;
        int result = instance.usePotion(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
        
        
        System.out.println("\tTest case #2");
        
        pokemonCurrentHP = 70;
        pokemonFullHP = 70;
        
        expResult = -1;
        result = instance.usePotion(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
        
        
        System.out.println("\tTest case #3");
        
        pokemonCurrentHP = 35;
        pokemonFullHP = 80;
        
        expResult =  55;
        result = instance.usePotion(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result, 10);
    }
    
}
