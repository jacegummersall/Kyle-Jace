/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import java.util.Scanner;

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
                + "\nQ - Quit menu"
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
        System.out.println("*** displayPokemonList function called ***");
    }
}
