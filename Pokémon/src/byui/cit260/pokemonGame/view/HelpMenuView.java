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
        System.out.println("\n*** displayGameGoal function called ***");
    }

    private void displayMove() {
        System.out.println("\n*** displayMove function called ***");
    }
    
}
