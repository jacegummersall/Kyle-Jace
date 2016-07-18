/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;


import citbyui.cit260.pokemonGame.exceptions.DamageControlException;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Random;

/**
 *
 * @author jacegummersall
 */
public class DamageControlTest {
    
    public DamageControlTest() {
    }

    /**
     * Test of calcDamage method, of class DamageControl.
     */
    @Test
    public void testCalcDamage() throws DamageControlException{
        
        System.out.println("calcDamage");
        
        //Test Case 1
        
        System.out.println("/t Test Case 1");
        //Input values
        int pokemonCurrentHP = 50;
        int pokemonAttack = 30;
        int pokemonDefense = 20;
        //Create new object instance
        DamageControl instance = new DamageControl();
        //Call function to run test
        Random random = new Random();
        int pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        long expResult = 40;
        long result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
     
        
        //Test Case 2
        
        System.out.println("/t Test Case 2");
        //Input values
        pokemonCurrentHP = 45;
        pokemonAttack = -5;
        pokemonDefense = 12;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
        
           //Test Case 3
        
        System.out.println("/t Test Case 3");
        //Input values
        pokemonCurrentHP = 90;
        pokemonAttack = 110;
        pokemonDefense = 95;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
        
           //Test Case 4
        
        System.out.println("/t Test Case 4");
        //Input values
        pokemonCurrentHP = -8;
        pokemonAttack = 50;
        pokemonDefense = 33;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
        
           //Test Case 5
        
        System.out.println("/t Test Case 5");
        //Input values
        pokemonCurrentHP = 511;
        pokemonAttack = 68;
        pokemonDefense = 70;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
        
           //Test Case 6
        
        System.out.println("/t Test Case 6");
        //Input values
        pokemonCurrentHP = 40;
        pokemonAttack = 85;
        pokemonDefense = 85;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
        
        
           //Test Case 7
        
        System.out.println("/t Test Case 7");
        //Input values
        pokemonCurrentHP = 65;
        pokemonAttack = 50;
        pokemonDefense = -37;
        
        //Call function to run test
        pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        //compare expected return value with actual value
        expResult = -1;
        result = instance.calcDamage(pokemonCurrentHP, pokemonAttack, pokemonDefense);
        assertEquals(expResult, result, 5);
    }
    
}
