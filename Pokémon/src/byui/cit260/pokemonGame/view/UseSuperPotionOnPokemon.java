/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.PotionControl;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.PotionControlException;
import java.awt.Point;
import java.util.ArrayList;
import pokémon.Pokémon;

/**
 *
 * @author jacegummersall
 */
public class UseSuperPotionOnPokemon extends View{

    public UseSuperPotionOnPokemon(){
        super("\nChoose a Pokémon to attack with.");
        
        byui.cit260.pokemonGame.model.Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        ArrayList<Pokemon> pokemonList = mainCharacter.getPokemonCaptured();
        
        this.console.println("\n" 
                + "\n--------------------------" 
                + "\n|   Pokemon Menu  " 
                + "\n--------------------------");
        
        for(Pokemon pokemon : pokemonList){
            //get first letter of pokeons name
            char firstLetterOfCapturedPokemon = pokemon.getPokemonName().charAt(0);
            // print out letter - pokemons name
            this.console.println("\n" + firstLetterOfCapturedPokemon + " - " + pokemon.getPokemonName());
            
        }
    }
    
    @Override
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

        try {
            Pokemon pikachu = Pokémon.getCurrentGame().getPokemons().get(0);

            int healthPoints = pikachu.getCurrentHealthPoints();
            int fullHealthPoints = pikachu.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            pikachu.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void chooseRatatta() {

        try {
            Pokemon ratatta = Pokémon.getCurrentGame().getPokemons().get(1);

            int healthPoints = ratatta.getCurrentHealthPoints();
            int fullHealthPoints = ratatta.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            ratatta.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void chooseSpearow() {

        try {
            Pokemon spearow = Pokémon.getCurrentGame().getPokemons().get(2);

            int healthPoints = spearow.getCurrentHealthPoints();
            int fullHealthPoints = spearow.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            spearow.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void chooseCharizard() {

        try {
            Pokemon charizard = Pokémon.getCurrentGame().getPokemons().get(3);

            int healthPoints = charizard.getCurrentHealthPoints();
            int fullHealthPoints = charizard.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            charizard.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void chooseMewTwo() {

        try {
            Pokemon mewTwo = Pokémon.getCurrentGame().getPokemons().get(5);

            int healthPoints = mewTwo.getCurrentHealthPoints();
            int fullHealthPoints = mewTwo.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            mewTwo.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void chooseGyarados() {

        try {
            Pokemon gyarados = Pokémon.getCurrentGame().getPokemons().get(4);

            int healthPoints = gyarados.getCurrentHealthPoints();
            int fullHealthPoints = gyarados.getFullHealthPoints();
            
            
            int newCurrentHP = PotionControl.useSuperPotion(healthPoints, fullHealthPoints);
            gyarados.setCurrentHealthPoints(newCurrentHP);
        } catch (PotionControlException ex) {
            System.out.println(ex.getMessage());
        }
        StringBuilder line;
        
        Game game = Pokémon.getCurrentGame();
        byui.cit260.pokemonGame.model.Character mainCharacter = game.getPlayingCharacter();
        ArrayList<Pokemon> pokemons = mainCharacter.getPokemonCaptured();
        
        System.out.println("\n List of Pokemon Stats");
        line = new StringBuilder ("                         ");
        line.insert(0, "NAME");
        line.insert(15, "HP");
        line.insert(25, "STRENGTH");
        line.insert(35, "DEFENSE");
        System.out.println(line.toString());
        
        for (Pokemon pokemon : pokemons) {
            
        line = new StringBuilder ("                         ");
        line.insert(0, pokemon.getPokemonName());
        line.insert(15, pokemon.getCurrentHealthPoints()); 
        line.insert(25, pokemon.getStrength());
        line.insert(35, pokemon.getDefense());
        System.out.println(line.toString());
        }
        
        ItemListView itemList = new ItemListView();
        
        itemList.display();

    }

    private void returnToGameMenu() {
        GameMenuView gameMenuView = new GameMenuView();

        gameMenuView.display();    
    }
    
}