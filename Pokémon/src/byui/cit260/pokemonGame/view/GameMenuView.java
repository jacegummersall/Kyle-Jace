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
public class GameMenuView extends View{


    public GameMenuView() {

        super   ("\n"
                + "\n--------------------------"
                + "\n| Game Menu"
                + "\n--------------------------"
                + "\nV - View Map"
                + "\nL - List of items in bag"
                + "\nP - Pokémon"
                + "\nE - Explore Square"
                + "\nS - Save Game"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n -------------------------");
    }
    
  

    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "V": // Display game map
                this.displayMap();
                break;
            case "L": //Display list of items
                this.displayItemList();
                break;
            case "P": //Display list of Pokémon
                this.displayPokemonList();
                break;
            case "E": //Display exploration results
                this.displayExplore();
                break;
            case "S": //Display game saved
                this.displaySave();
                break;
            case "H": //Display game instructions menu
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;

        }
        return false;

    }

    private void displayMap() {

        MapMenuView mapMenu = new MapMenuView();

        mapMenu.displayMapMenuView();
    }

    private void displayItemList() {
        ItemListView itemMenu = new ItemListView();
        
        itemMenu.display();
    }

    private void displayPokemonList() {

        PokemonListMenuView pokemonListMenu = new PokemonListMenuView();

        pokemonListMenu.displayPokemonListMenuView();
    }

    private void displayExplore() {
        System.out.println("*** displayExplore function called ***");
    }

    private void displaySave() {
        System.out.println("*** displaySave function called ***");
    }

    private void displayHelpMenu() {
        System.out.println("*** displayHelpMenu function called ***");
    }
}
