/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokémon;

import byui.cit260.pokemonGame.model.Battle;
import byui.cit260.pokemonGame.model.Boss;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Player;
import byui.cit260.pokemonGame.model.Potion;
import byui.cit260.pokemonGame.view.StartProgramView;

/**
 *
 * @author jacegummersall
 */
public class Pokémon {

    private static Game currentGame = null;
    private static Player player = null;
    
    
    
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        
        
    }

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game currentGame) {
        Pokémon.currentGame = currentGame;
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        Pokémon.player = player;
    }
    
    
    
}
