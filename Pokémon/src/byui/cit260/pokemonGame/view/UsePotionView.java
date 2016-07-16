/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.PotionControl;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokémon.Pokémon;

/**
 *
 * @author jacegummersall
 */
public class UsePotionView extends View{


    public UsePotionView() {        
        super("\nChoose which Item you would like to use.");
                
        byui.cit260.pokemonGame.model.Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        ArrayList<Item> itemList = mainCharacter.getItemsCollected();
        
        this.console.println("\n" 
                + "\n--------------------------" 
                + "\n|   Pokemon Menu  " 
                + "\n--------------------------");
        
        for(Item item : itemList){
            //get first letter of pokeons name
            char firstLetterOfCapturedPokemon = item.getInventoryType().charAt(0);
            // print out letter - pokemons name
            this.console.println("\n" + firstLetterOfCapturedPokemon + " - " + item.getInventoryType());
            
        }
    }

    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase(); //convert choice to upper case
       
        Game game = Pokémon.getCurrentGame();
            switch (value) {
                case "P": // select pikachu
                    this.usePotion();
                    break;
                case "S": //select Spearow
                    this.useSuperPotion();
                    break;
                case "B": //load and start and existing game
                    this.returnToGameMenu();
                    break;
                default:
                    System.out.println("\n*** Invalid Selection *** Try again!");
                    break;
            }
        return false;
    }

    private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    private void usePotion() {
        UsePotionOnPokemon usePotionOnPokemon = new UsePotionOnPokemon();
        usePotionOnPokemon.display();
    }

    private void useSuperPotion() {
        UsePotionOnPokemon usePotionOnPokemon = new UsePotionOnPokemon();
        usePotionOnPokemon.display();
    }

    
    
}
