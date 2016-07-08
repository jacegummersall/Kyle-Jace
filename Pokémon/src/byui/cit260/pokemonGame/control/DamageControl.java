/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import citbyui.cit260.pokemonGame.exceptions.DamageControlException;
import java.util.Random;

/**
 *
 * @author jacegummersall
 */
public class DamageControl {
    
    public static int calcDamage(int pokemonCurrentHP, int pokemonAttack, int pokemonDefense)
                        throws DamageControlException {
        
        if (pokemonCurrentHP < 1)
		{throw new DamageControlException("Your Pokémon has no HP.");}
	if (pokemonCurrentHP > 200)
		{throw new DamageControlException("Your Pokémon has no HP.");}
	if (pokemonAttack < 1)
		{throw new DamageControlException("Your Pokémon has no HP.");}
	if (pokemonAttack > 100)
		{throw new DamageControlException("Your Pokémon has no HP.");}
	if (pokemonDefense < 1)
		{throw new DamageControlException("Your Pokémon has no HP.");}
        if (pokemonDefense > 80)
		{throw new DamageControlException("Your Pokémon has no HP.");}
	if (pokemonDefense < 1)
		{throw new DamageControlException("Your Pokémon has no HP.");}
        
        Random random = new Random();
        
        int pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        
	return pokemonFinalHP;

    
    }   
}
