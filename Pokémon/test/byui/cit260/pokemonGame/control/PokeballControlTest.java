/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import citbyui.cit260.pokemonGame.exceptions.PokeballControlException;
import java.util.Random;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jacegummersall
 */
public class PokeballControlTest {
    
    public PokeballControlTest() {
    }

    /**
     * Test of calcPokeball method, of class PokeballControl.
     */
    @Test
    public void testCalcPokeball() throws PokeballControlException{
        System.out.println("calcPokeball");
        
        //Test Case 1
        
        System.out.println("/tTest 1");
        
        //Input values
        int pokemonCurrentHP = 35;
        int pokemonFullHP = 100;
        
        //create instance for calcPokeball
        PokeballControl instance = new PokeballControl();
        String expResult = "Pokémon Captured!";
        
        //call function
        Random random = new Random();
        boolean captureSuccess = pokemonCurrentHP + ( 1 * random.nextInt(5)) < pokemonFullHP/2;
        
        String result = instance.calcPokeball(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
       
         //Test Case 2
        
        System.out.println("/tTest 2");
        
        //Input values
        pokemonCurrentHP = 65;
        pokemonFullHP = 85;
        
        //create instance for calcPokeball
        expResult = "Pokémon has escaped, he is too strong";
        
        //call function
        captureSuccess = pokemonCurrentHP + ( 1 * random.nextInt(5)) < pokemonFullHP/2;
        
        result = instance.calcPokeball(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
        
          //Test Case 3
        
        System.out.println("/tTest 3");
        
        //Input values
        pokemonCurrentHP = 55;
        pokemonFullHP = -110;
        
        //create instance for calcPokeball
        expResult = "ERROR";
        
        //call function
        captureSuccess = pokemonCurrentHP + ( 1 * random.nextInt(5)) < pokemonFullHP/2;
        
        result = instance.calcPokeball(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
        
        //Test Case 4
        
        System.out.println("/tTest 4");
        
        //Input values
        pokemonCurrentHP = 25;
        pokemonFullHP = 45;
        
        //create instance for calcPokeball
        expResult = "Pokémon has escaped, he is too strong";
        
        //call function
        captureSuccess = pokemonCurrentHP + ( 1 * random.nextInt(5)) < pokemonFullHP/2;
        
        result = instance.calcPokeball(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result);
        
       //Test Case 5
        
        System.out.println("/tTest 5");
        
        //Input values
        pokemonCurrentHP = -5;
        pokemonFullHP = 50;
        
        //create instance for calcPokeball
        expResult = "Pokémon has fainted";
        
        //call function
        captureSuccess = pokemonCurrentHP + ( 1 * random.nextInt(5)) < pokemonFullHP/2;
        
        result = instance.calcPokeball(pokemonCurrentHP, pokemonFullHP);
        assertEquals(expResult, result); 
        

    }
    
}
