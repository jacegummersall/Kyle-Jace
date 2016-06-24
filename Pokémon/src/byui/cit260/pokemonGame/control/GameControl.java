/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import byui.cit260.pokemonGame.model.Player;
import byui.cit260.pokemonGame.view.GameMenuView;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;

/**
 *
 * @author Thunder
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
        }
        Player player = new Player();
        player.setName(playersName);
        
        Pokémon.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) {
        System.out.println("\n*** newGame stub function called ***");
        
        System.out.println("\n*** createNewGame stub function called ***");
    }

    public static void loadExistingGame(Player player) {
        System.out.println("\n*** loadExistingGame stub function called ***");
    }
    
        
    private Character[] createCharacterList(){
        
        Character[] characters = new Character[ListConstants.NUMBER_OF_CHARACTERS];
        
        Character gamePlayer = new Character(Pokémon.getPlayer().getName(),"Pokémon Trainer");
        characters[ListConstants.mainCharacterIndex] = gamePlayer;
        
        Character lance = new Character("Lance","Pokemon Champion");
        characters[ListConstants.finalBoss] = lance;
        
        return characters;
    }
    
}
