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
public class GameMenuView {
        
        private String menu;
        private String promptMessage;
    
    public void displayMenu() {
        
        this.promptMessage = "Please Select an option";
        this.menu = "\n"
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
                + "\n -------------------------";
        
    }
    
    public void displayGameMenuView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("Q")) //user wants to quit
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
            case "V": // Display game map
                this.displayMap();
                break;
            case "L": //Display moving instructions
                this.displayMove();
                break;
            case "P": //Display moving instructions
                this.displayPokemonList();
                break;
            case "E": //Display moving instructions
                this.displayExplore();
                break;
            case "S": //Display moving instructions
                this.displaySave();
                break;
            case "H": //Display moving instructions
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

    private void displayMove() {
        System.out.println("*** displayMove function called ***");
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
