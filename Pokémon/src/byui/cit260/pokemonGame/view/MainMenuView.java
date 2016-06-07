/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.model.GameMenuView;
import byui.cit260.pokemonGame.model.HelpMenuView;
import java.util.Scanner;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class MainMenuView {
    
    private String menu;
    private String promptMessage;
    
    public MainMenuView() {
        this.promptMessage = "Please Select an option";
        this.menu = "\n"
                + "\n--------------------------"
                + "\n| Main Menu"
                + "\n--------------------------"
                + "\nN - New Game"
                + "\nL - Load Saved Game"
                + "\n? - Help Menu"
                + "\nE - Exit Game"
                + "\n -------------------------";
        
    }
    

    public void displayMainMenuView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("E")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(menuOption);
        } while (!done);
    }

    private String getMenuOption() {
        Scanner keyboard = new Scanner(System.in); // get infile for keyboard
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        while (!valid) { //loop while an invalid value is entered
            System.out.println("\n" + this.menu);
            System.out.println("\n" + this.promptMessage);
            
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                System.out.println("\nInvalid value: value cannot be blank");
                continue;
            }
            break; //end the loop
        }
        return value; //return the value entered
    }

    private boolean doAction(String choice) {
        
        choice = choice.toUpperCase(); //convert choice to upper case
        
        switch (choice) {
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
        
        GameControl.createNewGame(Pokémon.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void loadExistingGame() {
        
        GameControl.loadExistingGame(Pokémon.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenu = new HelpMenuView();
        
        helpMenu.displayHelpMenuView();    
    }
    
    
}
