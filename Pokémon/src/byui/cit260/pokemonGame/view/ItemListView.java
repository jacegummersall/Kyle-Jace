/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Pokemon;
import java.util.ArrayList;
import java.util.Scanner;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class ItemListView extends View{
        
        public ItemListView() {
        
        super("\n"
                + "\n--------------------------"
                + "\n| Items Menu"
                + "\n--------------------------"
                + "\nU - Use Item"
                + "\nP - View Pokémon"
                + "\nE - Exit menu"
                + "\n -------------------------");
        
    }
    
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "U": // Display game map
                this.displayUseItem();
                break;
            case "P": //Display moving instructions
                this.displayPokemonList();
                break;
            case "E": //Display moving instructions
                this.displayGameMenu();
                break;                
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
        }
        return false;
    }

    private void displayUseItem() {
        
        UsePotionView usePotionMenu = new UsePotionView();
        usePotionMenu.display();
        
    }

    private void displayPokemonList() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ReturnToGameMenu returnToGameMenu = new ReturnToGameMenu();

        returnToGameMenu.display(); 
    }
    private void displayGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
