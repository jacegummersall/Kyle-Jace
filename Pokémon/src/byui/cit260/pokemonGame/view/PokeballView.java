/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import pokémon.Pokémon;
import byui.cit260.pokemonGame.control.PokeballControl;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.PokeballControlException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacegummersall
 */
public class PokeballView extends View{
    
    public PokeballView(){
        super("\nChoose what type of pokéball to throw.");
                
        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        ArrayList<Item> itemList = mainCharacter.getItemsCollected();
        
        this.console.println("\n" 
                + "\n--------------------------" 
                + "\n|   Pokemon Menu  " 
                + "\n--------------------------");
        
        for(Item item : itemList){
            //get first letter of pokeons name
            char firstLetterOfCapturedPokemon = item.getInventoryType().charAt(0);
            // print out letter - pokemons name
            this.console.println("\n" + firstLetterOfCapturedPokemon + " - " + item.getInventoryType());
            
        }
    }

    @Override
    public boolean doAction(String value) {
        switch (value) {
            case "P": // select pikachu
                this.throwPokeball();
                break;
            case "R": //select Ratatta
                this.throwMasterball();
                break;
            default:
                System.out.println("\n*** You cant throw that at it!!!");
                break;    
        }
        return false;
    }

    private void throwPokeball() {
        try {
            Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
            
            Item pokeball = mainCharacter.getItemsCollected().get(0);
            
            Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
            
            Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
            
            Location location = locations[coordinates.x][coordinates.y];
            
            Pokemon pokemon = location.getPokemonInLocation().get(0);
            
            int currentHP = pokemon.getCurrentHealthPoints();
            int fullHP = pokemon.getFullHealthPoints();
            
            PokeballControl.calcPokeball(currentHP, fullHP);
        } catch (PokeballControlException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    private void throwMasterball() {
        
    }
}