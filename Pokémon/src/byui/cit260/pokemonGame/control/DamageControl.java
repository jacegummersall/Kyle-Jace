/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import java.util.Random;

/**
 *
 * @author jacegummersall
 */
public class DamageControl {
    
    public long calcDamage(int pokemonCurrentHP, int pokemonAttack, int pokemonDefense) {
    
        if (pokemonCurrentHP < 1)
		{return -1;}
	if (pokemonCurrentHP > 200)
		{return -1;}
	if (pokemonAttack < 1)
		{return -1;}
	if (pokemonAttack > 100)
		{return -1;}
	if (pokemonDefense < 1)
		{return -1;}
        if (pokemonDefense > 80)
		{return -1;}
	if (pokemonDefense < 1)
		{return -1;}
        
        Random random = new Random();
        
        int pokemonFinalHP = pokemonCurrentHP - (pokemonAttack + random.nextInt(5) - pokemonDefense);
        
	return pokemonFinalHP;

    
    }   
}
