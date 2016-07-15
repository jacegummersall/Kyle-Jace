/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.control.PokeballControl;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.DamageControlException;
import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class BattleMenuView extends View{
    
    public BattleMenuView(){
        super("\n"
                + "\n--------------------------"
                + "\n| Battle Menu"
                + "\n--------------------------"
                + "\nA - Attack"
                + "\nT - Throw pokéball"
                + "\nU - Use an item"
                + "\nR - Run away"
                + "\n -------------------------");
    }
    
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        Game game = Pokémon.getCurrentGame();
        ArrayList<Pokemon> pokemons = game.getPokemons();
        {
        /*try {*/
        switch (value) {
            case "A": // Display result of attack
                this.displayAttack();
                break;
            case "T": //Display if pokémon was caught
                this.throwPokeball();
                break;
            case "U": //Display if pokémon was caught
                this.displayItemList();
                break;
            case "R": //Display if pokémon was caught
                this.returnToMapMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;                        
        }
        }
        /*catch (DamageControlException ex) {
               Logger.getLogger(BattleMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
        return false;
    
    
}

    private void displayAttack() {
        AttackView attackView = new AttackView();
        
        attackView.display(); 
        
        
    }

    private void throwPokeball() {
        PokeballView pokeballView = new PokeballView();
        
        pokeballView.display(); 
    }

    private void displayItemList() {
        ItemListView itemMenu = new ItemListView();
        
        itemMenu.display();
    }
    
    private void returnToMapMenu() {
        
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }
}
