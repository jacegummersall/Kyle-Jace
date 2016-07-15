/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.MapControl;
import java.util.Scanner;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;

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
    }

    private void moveSouth() {
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M S");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
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
    }

    private void moveWest() {
        Character[] character = Pokémon.getCurrentGame().getCharacters();
        try {
        MapControl.moveCharacterToLocation(character[0], "M W");
        }
        catch (MapControlException me){
            System.out.println(me.getMessage());
        }
    }

    private void exploreSquare() {
        System.out.println("\n*** exploreSquare stub function called ***");
    }

    private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }
}
