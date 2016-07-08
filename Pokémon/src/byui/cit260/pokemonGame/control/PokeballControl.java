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

    public String calcPokeball(int pokemonCurrentHP, int pokemonFullHP) 
                                    throws PokeballControlException{

        if (pokemonCurrentHP > 98) {
            throw new PokeballControlException("Pokémon has escaped, he is too strong");
        }

        if (pokemonCurrentHP < 1) {
            throw new PokeballControlException("Pokémon has fainted");
        }

        if (pokemonFullHP < 0) {
            throw new PokeballControlException("ERROR");
        }
        
        if (pokemonFullHP < 50) {
            throw new PokeballControlException("Pokémon has escaped, he is too strong");
        }

        if (pokemonFullHP > 200) {
            throw new PokeballControlException("ERROR");
        }

        Random random = new Random();

        int captureSuccess = pokemonCurrentHP + (1 * random.nextInt(5));
        if (captureSuccess < pokemonFullHP / 2) {
            throw new PokeballControlException("Pokémon Captured!");
        }
        throw new PokeballControlException("Pokémon has escaped, he is too strong");
    }

}
