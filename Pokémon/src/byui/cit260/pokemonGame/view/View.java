/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokémon.Pokémon;

/**
 *
 * @author jacegummersall
 */
public abstract class View implements ViewInterface {
    
    protected String displayMessage;
    
    protected final BufferedReader keyboard = Pokémon.getInFile();
    protected final PrintWriter console = Pokémon.getOutFile();
    
    public View() {
    }
    
    public View(String message){
    this.displayMessage = message;
}
    @Override
     public void display() {
        
        boolean done = false; //set flag to not done
        do {
            
            //prompt for and get player's name
            String value = this.getInput();
            if (value.toUpperCase().equals("Q")) //user wants to quit
                return; //exit the game
            
            //do the requested action and display the next view
            done = this.doAction(value);
        } while (!done);
    }
    
     @Override
     public String getInput() {
        
        String value = ""; // value to be returned
        boolean valid = false; // initialize to not valid
        
        try { 
            while (!valid) { 
            //loop while an invalid value is entered
            System.out.println("\n" + this.displayMessage);
            
            
            value = this.keyboard.readLine(); // get next line typed on keyboard
            value = value.trim(); // trim off leading and trailing blanks
            
            if (value.length() < 1) { // value is blank
                ErrorView.display(this.getClass().getName(), "\nInvalid value: value cannot be blank");
                continue;
            }
            break; //end the loop
            }
            } catch (IOException ex) {
                ErrorView.display(this.getClass().getName(), "Error reading input: " + ex.getMessage());
         }
        
        return value; //return the value entered
    }
     
}
