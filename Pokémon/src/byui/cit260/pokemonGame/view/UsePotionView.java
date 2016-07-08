/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.PotionControl;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import pokémon.Pokémon;

/**
 *
 * @author jacegummersall
 */
public class UsePotionView extends View{


    public UsePotionView() {
        super("\n"
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
                + "\n -------------------------");
    }

    @Override
    public boolean doAction(String value) {
       value = value.toUpperCase(); //convert choice to upper case
       
        Game game = Pokémon.getCurrentGame();
        ArrayList<Pokemon> pokemons = game.getPokemons();
        {
           try {
        switch (value) {
            case "P": // select pikachu
               Pokemon pikachu = pokemons.get(0);
               PotionControl.usePotion(pikachu.getFullHealthPoints(), pikachu.getCurrentHealthPoints());
                break;
            case "R": //select Ratatta
                Pokemon ratatta = pokemons.get(1);
               PotionControl.usePotion(ratatta.getFullHealthPoints(), ratatta.getCurrentHealthPoints());
                break;
            case "S": //select Spearow
               Pokemon spearow = pokemons.get(3);
               PotionControl.usePotion(spearow.getFullHealthPoints(), spearow.getCurrentHealthPoints());
                break;
            case "C": //select Charizard
               Pokemon charizard = pokemons.get(2);
               PotionControl.usePotion(charizard.getFullHealthPoints(), charizard.getCurrentHealthPoints());
                break;                
            case "G": //select Gyarados
               Pokemon gyarados = pokemons.get(4);
               PotionControl.usePotion(gyarados.getFullHealthPoints(), gyarados.getCurrentHealthPoints());
                break;
            case "M": //select MewTwo
               Pokemon mewtwo = pokemons.get(5);
               PotionControl.usePotion(mewtwo.getFullHealthPoints(), mewtwo.getCurrentHealthPoints());
                break;
            case "B": //load and start and existing game
                this.returnToGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;                 
           }
          }
           catch (PotionControlException ex) {
               Logger.getLogger(UsePotionView.class.getName()).log(Level.SEVERE, null, ex);
         }
        }
        return false;
    }

    private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
        
    }

    
    
}
