/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Pokemon;
import byui.cit260.pokemonGame.model.Scene;
import java.util.ArrayList;
import java.util.Scanner;
import pokémon.Pokémon;

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
                this.displayItemReport();
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
            case "B": //Test battle menu
                this.displayBattleMenu();
            case "F": //Display game instructions menu
                this.displayBossView();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;

        }
        return false;

    }

    private void displayMap() {

        Game game = new Game();
        game = Pokémon.getCurrentGame();
        Map map = new Map();
        map = game.getMap();
        
        Location[][] locations = map.getLocations();
                
        System.out.println("      Map of The World of Pokémon      ");
        System.out.println("1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10");
        /*for (Location[] row : locations){
            System.out.println("------------------------------------------");
            System.out.println("1   2   3   4   5   6   7   8   9   10");
            
            for (Location[] column : locations){
                System.out.println(" | ");
                System.out.println(locations[row][column].getScene().getMapSymbol());
                System.out.println("|");
            }
            System.out.println("--------------------------------------");
        }*/
        
        for (int row = 0; row<5; row++){
            System.out.println("------------------------------------------");
            System.out.println("1   2   3   4   5   6   7   8   9   10");
            
//            for (int column = 0; column<10; column++){
//                System.out.println(" | ");
//                System.out.println(locations[row][column].getScene().getMapSymbol());
//                System.out.println("|");
//            }
            System.out.println("--------------------------------------");
        }
    }
    private void displayItemReport() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        ArrayList<Item> items = game.getItems();
        
        System.out.println("\n List of Items");
        line = new StringBuilder ("                         ");
        line.insert(0, "TYPE");
        line.insert(20, "INSTOCK");
        System.out.println(line.toString());
        
        for (Item item : items) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, item.getInventoryType());
        line.insert(23, item.getInventoryQuantity());
        System.out.println(line.toString());
        }
        
    }

    private void displayPokemonList() {

        PokemonListMenuView pokemonListMenu = new PokemonListMenuView();

        pokemonListMenu.display();
    }

    private void displayExplore() {
        System.out.println("*** displayExplore function called ***");
    }

    private void displaySave() {
        System.out.println("*** displaySave function called ***");
    }

    private void displayHelpMenu() {
        
        HelpMenuView HelpMenu = new HelpMenuView();

        HelpMenu.display();    }

    private void displayBossView() {
       
        BossView BossView = new BossView();

        BossView.display();
    }
    
    private void displayBattleMenu() {
    BattleMenuView battleMenu = new BattleMenuView();
        
        battleMenu.display();
    }
}
