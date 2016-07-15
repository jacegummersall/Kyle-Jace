/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.control.MapControl;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;
import java.util.Scanner;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class MainMenuView extends View{
    
    
    public MainMenuView() {
            super("\n"
                + "\n--------------------------"
                + "\n| Main Menu"
                + "\n--------------------------"
                + "\nN - New Game"
                + "\nL - Load Saved Game"
                + "\n? - Help Menu"
                + "\nE - Exit Game"
                + "\n -------------------------");
        
    }
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "N": // create and start a new game
                this.startNewGame();
                break;
            case "L": //load and start and existing game
                this.loadExistingGame();
                break;
            case "?": //load and start and existing game
                this.displayHelpMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
                        
        }
        return false;
    }

    private void startNewGame() {
        try {
            GameControl.createNewGame(Pokémon.getPlayer());
        } catch (MapControlException me) {
            System.out.println(me.getMessage());
        }
        
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
        
        
    }

    private void loadExistingGame() {
        this.console.println("\n\n Enter the file path for where the game is to "
                + "be retrieved.");
        
        String filePath = this.getInput();
        
        try {
            GameControl.getSavedGame(filePath);
        } catch (Exception ex){
            ErrorView.display("GameMenuView", ex.getMessage());
        } 
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        
        helpMenu.display();    
    }
    
    
}
