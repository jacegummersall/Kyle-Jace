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
public class PokemonListMenuView {
    
    private String pokemonmenu;
    private String promptMessage;
    
    public PokemonListMenuView() {
        this.promptMessage = "Select a Pokemon for battle!";
        this.pokemonmenu = "\n"
                + "\n--------------------------"
                + "\n|   Pokemon Menu"
                + "\n--------------------------"
                + "\nP - Pikachu"
                + "\nR - Ratatta"
                + "\nS - Spearow"
                + "\nC - Charizard"
                + "\nG - Gyarados"
                + "\nM - MewTwo"
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
            System.out.println("\n" + this.pokemonmenu);
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
            case "P": // select pikachu
                this.choosePikachu();
                break;
            case "R": //select Ratatta
                this.chooseRatatta();
                break;
            case "S": //select Spearow
                this.chooseSpearow();
                break;
            case "C": //select Charizard
                this.chooseCharizard();
                break;                
            case "G": //select Gyarados
                this.chooseGyarados();
                break;
            case "M": //select MewTwo
                this.chooseMewTwo();
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

    private void choosePikachu() {
        System.out.println("\n*** choosePikachu stub function called ***");
    }

    private void chooseRatatta() {
        System.out.println("\n*** choosePikachu stub function called ***");
    }

    private void chooseSpearow() {
        System.out.println("\n*** chooseSpearow stub function called ***");
    }

    private void chooseCharizard() {
        System.out.println("\n*** chooseCharizard stub function called ***");
    }

    private void chooseGyarados() {
        System.out.println("\n*** chooseGyarados stub function called ***");
    }

    private void chooseMewTwo() {
        System.out.println("\n*** chooseMewTwo stub function called ***");
    }

    private void returnToGameMenu() {
        System.out.println("\n*** returnToGameMenu stub function called ***");
    }

}
