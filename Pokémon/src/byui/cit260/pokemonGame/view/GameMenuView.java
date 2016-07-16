/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Pokemon;
import byui.cit260.pokemonGame.model.Scene;
import byui.cit260.pokemonGame.model.Character;
import citbyui.cit260.pokemonGame.exceptions.GameControlException;
import java.awt.Point;
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
                + "\nD - Display total items on map"
                + "\nC - Count total Pokémon"
                + "\nP - Pokémon"
                + "\nR - Review Your Pokémon's Stats"
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
            case "D": //Display list of items
                this.displayTotalItems();
                break;
            case "C": //Display total pokemon
                this.displayTotalPokemon();
                break;
            case "P": //Display list of Pokémon
                this.displayPokemonList();
                break;
            case "R": //Display list of Pokémon Stats
                this.displayPokemonListReport();
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

        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        Point position = mainCharacter.getLocation();
        
        Game game = new Game();
        game = Pokémon.getCurrentGame();
        Map map = new Map();
        map = game.getMap();
        
        Location[][] locations = map.getLocations();
                
        System.out.println("                          Map of The World of Pokémon                       ");
        System.out.println(" |  1  | |  2  | |  3  | |  4  | |  5  | |  6  | |  7  | |  8  | |  9  | |  10 |");

        for (int row = 0; row<5; row++){
            System.out.println("---------------------------------------------------------------------------------");
            
            for (int column = 0; column<10; column++){
                System.out.print(" | ");
                //System.out.print(locations[row][column].getScene().getMapSymbol());
                if (locations[row][column].getVisited() == true){
                    System.out.print(locations[row][column].getScene().getMapSymbol());
                }
                else{
                        System.out.print(" ?? ");
                        }
                
                System.out.print("|");
            }
            System.out.println(" ");
        }
        this.console.println("\n\nYou are at " + (position.y+1) + "," + (position.x+1));
        MapMenuView mapMenu = new MapMenuView();
        
        mapMenu.display();
    }
    private void displayItemReport() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Item> items = mainCharacter.getItemsCollected();
        
        System.out.println("\n List of Items");
        line = new StringBuilder ("                         ");
        line.insert(0, "TYPE");
        line.insert(20, "QUANTITY");
        System.out.println(line.toString());
        
        for (Item item : items) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, item.getInventoryType());
        line.insert(23, item.getCollectedInventoryQuantity());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display(); 
    }

    private void displayPokemonList() {
        
        PokemonListMenuView pokemonListMenu = new PokemonListMenuView();

        pokemonListMenu.display();
    }

    private void displayPokemonListReport() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Character mainCharacter = game.getPlayingCharacter();
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
    
    private void displayExplore() {
        
        GameControl.getObjectInLocation();
    }

    private void displaySave() {
        this.console.println("\n\n Enter the file path for where the game is to "
                + "be saved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.saveGame(Pokémon.getCurrentGame(),filePath);
        } catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        } 
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

    private void displayTotalItems() {
      
        Game game = Pokémon.getCurrentGame();
        ArrayList<Item> items = game.getItems();
        
        // call control function to get the total of all items
        int totalNumberOfItems = GameControl.totalItems(items);
        
        // print out the total of all items
        System.out.println(totalNumberOfItems);
    }

    private void displayTotalPokemon() {
        
        Game game = Pokémon.getCurrentGame();
        ArrayList<Pokemon> pokemons = game.getPokemons();
        
        int totalNumberOfPokemon = GameControl.countPokemon(pokemons);
        
        System.out.println(totalNumberOfPokemon);
        
    }
        
        
    
}
