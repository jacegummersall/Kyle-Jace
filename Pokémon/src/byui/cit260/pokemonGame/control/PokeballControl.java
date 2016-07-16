/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import citbyui.cit260.pokemonGame.exceptions.PokeballControlException;
import java.util.Random;

/**
 *
 * @author jacegummersall
 */
public class PokeballControl {

    public static String calcPokeball(int pokemonCurrentHP, int pokemonFullHP) 
                                    throws PokeballControlException{

        if (pokemonCurrentHP > 98) {
            return "Pokémon has escaped, he is too strong";
        }

        if (pokemonCurrentHP < 1) {
            return"Pokémon has fainted";
        }

        if (pokemonFullHP < 0) {
            return "ERROR";
        }
        
        if (pokemonFullHP < 40) {
            return "Pokémon has escaped, he is too strong";
        }

        if (pokemonFullHP > 200) {
            return "ERROR";
        }

        Random random = new Random();
        
        int captureSuccess = pokemonCurrentHP + (1 * random.nextInt(5));
        if (captureSuccess < pokemonFullHP / 2) {
            return "Pokémon Captured!";
        }
        return "Pokémon has escaped, he is too strong";

    }

}
