/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokémon;

import byui.cit260.pokemonGame.model.Player;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Scene;
import byui.cit260.pokemonGame.model.Pokemon;
import java.awt.Point;


/**
 *
 * @author jacegummersall
 */
public class Pokémon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Player Class
        Player playerOne = new Player();
        
        playerOne.setName("Red");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        //Charcter Class
        Character characterOne = new Character();
        
        characterOne.setName("Red");
        characterOne.setLocation(new Point(2, 4));
        characterOne.setDescription("You are talking to professor Oak and he offers you a Pokémon, Do you graciously accept the Pokémon");
        
        String characterInfo = characterOne.toString();
        System.out.println(characterInfo);
        
        //Item Class
        Item itemOne = new Item();
        
        itemOne.setInventoryType("Potion");
        itemOne.setInventoryQuantity(6);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        //Location Class
        Location locationOne = new Location();
        
        locationOne.setRow(2);
        locationOne.setColumn(4);
        locationOne.setVisited("Professor Oak");
        
        String locationInfo = locationOne.toString();
        System.out.println(locationInfo);
    
        //Scene Class
        Scene sceneOne = new Scene();
        
        sceneOne.setDescription("tall grass");
        sceneOne.setTravelTime(8.0);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
    
        //Pokemon Class
        Pokemon pokemonOne = new Pokemon();
        
        pokemonOne.setPokemonName("Pikachu");
        pokemonOne.setDefense(100);
        pokemonOne.setStrength(45);
        pokemonOne.setHealthPoints(80);
        
        String pokemonInfo = pokemonOne.toString();
        System.out.println(pokemonInfo);
        
    }
    
}
