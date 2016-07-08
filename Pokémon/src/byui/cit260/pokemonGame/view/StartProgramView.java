/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.GameControl;
import byui.cit260.pokemonGame.model.Player;
import citbyui.cit260.pokemonGame.exceptions.GameControlException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class StartProgramView extends View{
    
    
    
    
    public StartProgramView() {
        // promptMessage = "Please enter your name."
        super ("\nPlease enter your name: ");
        
        this.displayBanner();
        // display the banner when view is created
         
        
    }
    
    
    
    private void displayBanner() {
        System.out.println(
        "\n******************************************************************************"
      + "\n*                                                                            *" 
      + "\n* This game is a text based role-playing game. In this game,                 *"
      + "\n* you will be creating your very own Pokémon Trainer. You will               *"
      + "\n* be starting in your hometown of Pallet Town and will be able               *"
      + "\n* to explore the map to try and become the best there ever was.              *"
      + "\n* You will be traveling around the map to catch Pokémon and fill             *"
      + "\n* your backpack with antidotes and potions in order to become the            *"
      + "\n* champion of the Pokémon League. You will be preparing yourself             *"
      + "\n* to battle the most recent champion and best Pokémon Master, Lance,         *"
      + "\n* in order to win the title of Pokémon Master.                               *"
      + "\n                                                                             *" 
      + "\n* After growing up your whole childhood watching Pokémon trainers            *"
      + "\n* come in and out of your town battling to become the best, and have         *"
      + "\n* fantasized of doing the same. A professor in your town is generous         *"
      + "\n* enough to give you a Pokéball and with that you are able to begin          *"
      + "\n* your quest. The Pokémon Master Lance is always waiting for new challengers *"
      + "\n* but if you aren't properly prepared he will send you and your Pokémon      *"
      + "\n* packing to the Pokémon Center to revive your fainted Pokémon.              *"
      + "\n*                                                                            *" 
      + "\n* Everything you need you can find around your town. There is a forest       *"
      + "\n* full of Pokémon for you to catch, as well as items other trainers have     *"
      + "\n* dropped in their journey that you can pick up and find. Your task is to    *"
      + "\n* battle Lance and become the new Pokémon Master. The game is over when      *"
      + "\n* you have successfully defeated Lance.                                      *"
      + "\n*                                                                            *" 
      + "\n* The game begins in your hometown of Pallet Town with Professor Oak         *"
      + "\n* who gives you a map and a Pokéball and encourages you to start your        *"
      + "\n* journey and fulfill your destiny. During the game you will need to         *"
      + "\n* catch 4 Pokémon and find any helpful items you can in order to be          *"
      + "\n* prepared to challenge Lance and become the new Pokémon Master.             *"
      + "\n*                                                                            *"
      + "\n******************************************************************************"
        );
    }

    

    public boolean doAction(String playersName) {
        
        if (playersName.length() < 2) {
            System.out.println("\nInvalid player's name: "
                    + "The name must be greater than one character in length");
            return false;
        }
        Player player = null;
        try {
        //call createPlayer() control function
            GameControl.createPlayer(playersName);
        }
        
        catch (GameControlException ge){
            System.out.println(ge.getMessage());
        }
        
        
        //display next view
        this.displayNextView(Pokémon.getPlayer());
        return true;
        
        
    }
    
    

    private void displayNextView(Player player) {
        
        //display a custom welcome message
        
        
        System.out.println("\n======================================================"
                            +"\n Welcome to the world of Pokémon " + player.getName()
                            +"\n Go catch 'em all!"
                            +"\n======================================================");
        
        getHours();
        // Create MainMenuView object
        MainMenuView mainMenuView = new MainMenuView();
        
        // Display the MainMenuView
        mainMenuView.display();
    }
 
        public void getHours(){
        this.displayMessage = "\nHow many hours do you think it will take you to win the game?:";
        
        int selection = getInt();
    }
    
    public int getInt(){
        
        
        int number = 0;
        
        while (number == 0){
            String value = this.getInput();
            value = value.trim().toUpperCase();
            
            if(value.equals("Q"))
                break;
            try {
            number = Integer.parseInt(value);
            } catch (NumberFormatException nf){
                System.out.println("\nYou must enter a valid number."
                        + " Try again or press Q to quit.");
            }
        }
        System.out.println("\n Good luck beating the game that quick!");
                    return number;

    }
}

