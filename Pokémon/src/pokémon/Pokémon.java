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

/**
 *
 * @author jacegummersall
 */
public class Pokémon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Red");
        playerOne.setBestTime(7.00);
        
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        
        //game class instance
        Game game = new Game();
        
        game.setStartTime(0);
        game.setEndTime(0);
        
        String gameInfo = game.toString();
        System.out.println(gameInfo);
        
        
        //map class instance
        Map map = new Map();
        
        map.setRowCount(7);
        map.setColumnCount(7);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
        
        
        //battle class instance
        Battle battle = new Battle();
        
        battle.setCalculation(5);
        battle.setPokeball(9);
        
        String battleInfo = battle.toString();
        System.out.println(battleInfo);
        
        
        //boss class instance
        Boss boss = new Boss();
        
        boss.setRequirement("You need more Pokémon");
        boss.setWinGame("You won!");
        boss.setCalculation(25);
        
        String bossInfo = boss.toString();
        System.out.println(bossInfo);
        
        
        //potion class instance
        Potion potion = new Potion();
        
        potion.setHealCalculation(15);
        
        
    }
    
}
