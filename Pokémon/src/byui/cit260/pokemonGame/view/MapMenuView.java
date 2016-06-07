/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import java.util.Scanner;

/**
 *
 * @author jacegummersall
 */
public class MapMenuView {
    
    private String mapmenu;
    private String promptMessage;
    
    public MapMenuView() {
        this.promptMessage = "Here's the Map. Select where to move.";
        this.mapmenu = "\n"
                + "\n--------------------------"
                + "\n|   Map Menu"
                + "\n--------------------------"
                + "\nM N - Move North"
                + "\nM S - Move South"
                + "\nM E - Move East"
                + "\nM W - Move West"
                + "\nE - Explore Square"
                + "\nB - Back"
                + "\n -------------------------";
        
    }
    

    public void displayMapMenuView() {
        
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
            System.out.println("\n" + this.mapmenu);
            System.out.println("\n" + this.promptMessage);
            
            
            value = keyboard.nextLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 3) { // value is blank
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
        System.out.println("\n*** moveNorth stub function called ***");
    }

    private void moveSouth() {
        System.out.println("\n*** moveSouth stub function called ***");
    }

    private void moveEast() {
        System.out.println("\n*** moveEast stub function called ***");
    }

    private void moveWest() {
        System.out.println("\n*** moveWest stub function called ***");
    }

    private void exploreSquare() {
        System.out.println("\n*** exploreSquare stub function called ***");
    }

    private void returnToGameMenu() {
        System.out.println("\n*** returnToGameMenu stub function called ***");
    }
}
