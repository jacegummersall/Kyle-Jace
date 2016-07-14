/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Pokemon;
import java.util.ArrayList;
import java.util.Scanner;
import pokémon.Pokémon;

/**
 *
 * @author jacegummersall
 */
public class PokemonListMenuView extends View{
    
    
    
    public PokemonListMenuView() {
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
    

    

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "P": // select pikachu
                this.choosePikachu();
                break;
            case "R": //select Ratatta
                this.chooseRatatta();
                break;
            case "S": //select Spearow
                this.chooseSpearow();
                break;
            case "C": //select Charizard
                this.chooseCharizard();
                break;                
            case "G": //select Gyarados
                this.chooseGyarados();
                break;
            case "M": //select MewTwo
                this.chooseMewTwo();
                break;
            case "B": //load and start and existing game
                this.returnToGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
                        
        }
        return false;
    }

    private void choosePikachu() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(0);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void chooseRatatta() {
               StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(1);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void chooseSpearow() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(2);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void chooseCharizard() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(3);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void chooseGyarados() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(4);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void chooseMewTwo() {
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        Pokemon pokemon = game.getPokemons().get(5);
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(20, "STRENGTH");
        line.insert(30, "DEFENSE");
        System.out.println(line.toString());
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(23, pokemon.getStrength());
        line.insert(33, pokemon.getDefense());
        System.out.println(line.toString());
    }

    private void returnToGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
