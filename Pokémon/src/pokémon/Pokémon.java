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
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacegummersall
 */
public class Pokémon {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    private static PrintWriter logFile = null;
    
    
    public static void main(String[] args) {
        
        //create StartProgramViewOrig and display the start program view
        
        
        try {
        
        
        Pokémon.inFile = 
                new BufferedReader(new InputStreamReader(System.in));
        
        Pokémon.outFile = new PrintWriter(System.out, true);
        
        //open log file
        String filePath = "log.txt";
        Pokémon.logFile = new PrintWriter(filePath);
        
        StartProgramView startProgramView = new StartProgramView();
        startProgramView.display();
        }
        catch (Throwable te){
            System.out.println("Exception: " + te.toString() +
                                "\nCause: " + te.getCause() +
                                "\nMessage: " + te.getMessage());
            
            te.printStackTrace();;
        }
        
        finally {
            try {
                if (Pokémon.inFile != null)
                Pokémon.inFile.close();
                
                if (Pokémon.outFile != null)
                Pokémon.outFile.close();
                
                if (Pokémon.logFile != null)
                Pokémon.logFile.close();
            } catch (IOException ex) {
                System.out.println("Error closing files");
                return;
            }
            
        }
        
        
        
        
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

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        Pokémon.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        Pokémon.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        Pokémon.logFile = logFile;
    }
    
    
    
    
    
}
