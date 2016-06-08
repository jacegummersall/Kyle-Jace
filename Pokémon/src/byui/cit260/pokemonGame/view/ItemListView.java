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
public class ItemListView {
    
        private String menu;
        private String promptMessage;
        
        public ItemListView() {
        
        this.promptMessage = "Please Select an option";
        this.menu = "\n"
                + "\n--------------------------"
                + "\n| Items Menu"
                + "\n--------------------------"
                + "\n# of Pokéballs - 10"
                + "\n# of Potions - 5"
                + "\n# of Super Potions 3"
                + "\n# of Master Balls - 0"
                + "\nU - Use Item"
                + "\nP - View Pokémon"
                + "\nB - Back"
                + "\n -------------------------";
        
    }
    
    public void displayItemListView() {
        
        boolean done = false; //set flag to not done
        do {
            //prompt for and get player's name
            String menuOption = this.getMenuOption();
            if (menuOption.toUpperCase().equals("B")) //user wants to quit
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
            case "U": // Display game map
                this.displayUseItem();
                break;
            case "P": //Display moving instructions
                this.displayPokemonList();
                break;           
        }
        return false;
    }

    private void displayUseItem() {
        System.out.println("*** displayUseItem function called ***");
    }

    private void displayPokemonList() {
        System.out.println("*** displayPokemonList function called ***");
    }
}
