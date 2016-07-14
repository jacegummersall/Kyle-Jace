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
public class HelpMenuView extends View{
    
    public HelpMenuView() {
        super("\n"
                + "\n--------------------------"
                + "\n| Help Menu"
                + "\n--------------------------"
                + "\nG - What is the goal of this game?"
                + "\nM - How to move"
                + "\nQ - Quit help menu"
                + "\n -------------------------");
        
    }

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
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
        System.out.println("\nThe goal of this game is to navigate the map and "
                        +  "\nfind potions, Pokéballs, and Pokémon in order to"
                        +  "\nbe strong enough and ready to defeat the Pokémon"
                        +  "\nMaster Lance. Take your time to visit as many "
                        +  "\nspaces as possible as you search out the gym "
                        +  "\nleader in order to win the game. Good luck in your"
                        +  "\njourney to become the best like no one ever was!");
    }

    private void displayMove() {
        System.out.println("\nIn order to move you will need to navigate back to"
                        +  "\nthe Game Menu by pressing B, and then either starting"
                        +  "\na new game by pressing N, or loading a saved game "
                        +  "\nby pressing L and the file path where you saved it."
                        +  "\nThen from there type in the letter V for view map."
                        +  "\nThe Map will appear with an ST for your starting "
                        +  "\npoint and then a bunch of  ?? for unvisited spaces."
                        +  "\nA new menu will also appear that allows you to move"
                        +  "\nup(M N), down (M S), left (M W), and right (M E). "
                        +  "\nAs you move through the map be sure to check the map"
                        +  "\nto see where you have and haven’t visited. One you"
                        +  "\nfeel ready to battle the boss you will need to Navigate"
                        +  "\nto the FN space where the final battle will occur. ");
    }
    
    public Double getDoubleNumber() {
        Double number = null;
        
        while (number == null) {
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if (value.equals("Q"))
                break;
            
        try {
        // parse and converte number from text to a double
        number = Double.parseDouble(value);
        }
        catch (NumberFormatException nf) {
            
            System.out.println ("\nYou must enter a valid number."
                            + " Try again or enter Q to quit.");
            }
        }
        
        return number;
    }
}
