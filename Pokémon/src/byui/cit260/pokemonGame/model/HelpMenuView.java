/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.util.Scanner;

/**
 *
 * @author Thunder
 */
public class HelpMenuView {

    
    
    private String menu;
    private String promptMessage;
    
    public HelpMenuView() {
        this.promptMessage = "Please Select an option";
        this.menu = "\n"
                + "\n-----------------------------------"
                + "\n| Help Menu"
                + "\n-----------------------------------"
                + "\nG - What is the goal of this game?"
                + "\nM - How to move"
                + "\nQ - Quit help menu"
                + "\n ----------------------------------";
        
    }
    

    public void displayHelpMenuView() {
        
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
            case "G": // Display goal of game
                this.displayGameGoal();
                break;
            case "M": //Display moving instructions
                this.displayMove();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
                        
        }
        return false;
    
    
}

    private void displayGameGoal() {
        System.out.println("\n*** displayGameGoal function called ***");
    }

    private void displayMove() {
        System.out.println("\n*** displayMove function called ***");
    }
    
}
