/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.control.MapControl;
import java.util.Scanner;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.GameControlException;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacegummersall
 */
public class MapMenuView extends View{
    
    
    
    public MapMenuView() {
        super("\n"
                + "\n--------------------------"
                + "\n|   Map Menu"
                + "\n--------------------------"
                + "\nM N - Move North"
                + "\nM S - Move South"
                + "\nM E - Move East"
                + "\nM W - Move West"
                + "\nE - Explore Square"
                + "\nB - Back"
                + "\n -------------------------");
        
    }
    

    

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "M N": // create and start a new game
                this.moveNorth();
                break;
            case "M S": //load and start and existing game
                this.moveSouth();
                break;
            case "M E": //load and start and existing game
                this.moveEast();
                break;
            case "M W": //load and start and existing game
                this.moveWest();
                break;                
            case "E": //load and start and existing game
                this.exploreSquare();
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

    private void moveNorth() {
        
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M N");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
        }
        
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
        
        
    }

    private void moveSouth() {
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M S");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
        }
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
    }

    private void moveEast() {
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M E");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
        }
        
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
        
    }

    private void moveWest() {
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M W");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
        }
        
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
    }

    private void exploreSquare() {
          Object objectInLocation = GameControl.getObjectInLocation();
          
          if(objectInLocation == null){
              return;
          }
          
          else if(objectInLocation instanceof Pokemon){
            Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
                          
            Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
            
            Location location = locations[coordinates.x][coordinates.y];
            
            Pokemon pokemon = location.getPokemonInLocation().get(0);
              
              this.console.println("\nYou have encountered a " + pokemon.getPokemonName() + "!!!"
                      + "\nHP - " + pokemon.getCurrentHealthPoints());
              
              BattleMenuView battleMenu = new BattleMenuView();
              battleMenu.display();
          }
          
          else if(objectInLocation instanceof Item){
              try {
             Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
                          
            Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
            
            Location location = locations[coordinates.x][coordinates.y];
            
            Item item = location.getItemInLocation().get(0);
              
              this.console.println("\nYou found a " + item.getInventoryType() + "!!!");
                  
                  GameControl.characterGetItem();
              } catch (GameControlException ex) {
                  System.out.println(ex.getMessage());
              }
          }
    }

    private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
