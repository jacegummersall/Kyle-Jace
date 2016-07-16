/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.control.DamageControl;
import byui.cit260.pokemonGame.control.GameControl;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.DamageControlException;
import java.awt.Point;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacegummersall
 */
public class AttackDratiniBossView extends View {
    
    public AttackDratiniBossView(){
        super("\nChoose a Pokémon to attack with.");
        
        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
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
        value = value.toUpperCase();
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
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
    }
    return false;
}

    private void choosePikachu() {
       
        try {
            Pokemon pikachu = Pokémon.getCurrentGame().getPokemons().get(0);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = pikachu.getStrength();
            
            int yourDefense = pikachu.getDefense();
            int yourHealthPoints = pikachu.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            pikachu.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon pikachu = Pokémon.getCurrentGame().getPokemons().get(0);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + pikachu.getPokemonName()
                      + "\nHP - " +pikachu.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }

    private void chooseRatatta() {
          
        try {
            Pokemon ratatta = Pokémon.getCurrentGame().getPokemons().get(1);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = ratatta.getStrength();
            
            int yourDefense = ratatta.getDefense();
            int yourHealthPoints = ratatta.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            ratatta.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon ratatta = Pokémon.getCurrentGame().getPokemons().get(1);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + ratatta.getPokemonName()
                      + "\nHP - " +ratatta.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }
    private void chooseSpearow() {
   
        try {
            Pokemon spearow = Pokémon.getCurrentGame().getPokemons().get(2);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = spearow.getStrength();
            
            int yourDefense = spearow.getDefense();
            int yourHealthPoints = spearow.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            spearow.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon spearow = Pokémon.getCurrentGame().getPokemons().get(2);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + spearow.getPokemonName()
                      + "\nHP - " +spearow.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }

    private void chooseCharizard() {
   
               
        try {
            Pokemon charizard = Pokémon.getCurrentGame().getPokemons().get(3);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = charizard.getStrength();
            
            int yourDefense = charizard.getDefense();
            int yourHealthPoints = charizard.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            charizard.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon charizard = Pokémon.getCurrentGame().getPokemons().get(3);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + charizard.getPokemonName()
                      + "\nHP - " +charizard.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }

    private void chooseGyarados() {
   
        
        try {
            Pokemon gyarados = Pokémon.getCurrentGame().getPokemons().get(4);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = gyarados.getStrength();
            
            int yourDefense = gyarados.getDefense();
            int yourHealthPoints = gyarados.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            gyarados.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon gyarados = Pokémon.getCurrentGame().getPokemons().get(4);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + gyarados.getPokemonName()
                      + "\nHP - " +gyarados.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }

    private void chooseMewTwo() {
   
       
        try {
            Pokemon mewTwo = Pokémon.getCurrentGame().getPokemons().get(5);

            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            
            int defense = pokemon.getDefense();
            int healthPoints = pokemon.getCurrentHealthPoints();
            int attack = mewTwo.getStrength();
            
            int yourDefense = mewTwo.getDefense();
            int yourHealthPoints = mewTwo.getCurrentHealthPoints();
            int yourAttack = pokemon.getStrength();
            
            int newCurrentHP = DamageControl.calcDamage(healthPoints, attack, defense);
            pokemon.setCurrentHealthPoints(newCurrentHP);
            
            int yourCurrentHP = DamageControl.calcDamage(yourHealthPoints, yourAttack, yourDefense);
            mewTwo.setCurrentHealthPoints(yourCurrentHP);
            
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        } 
            
            Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(7);
            Pokemon mewTwo = Pokémon.getCurrentGame().getPokemons().get(5);
              this.console.println("\n" + pokemon.getPokemonName()
                      + "\nHP - " + pokemon.getCurrentHealthPoints()
                      + "\n" + mewTwo.getPokemonName()
                      + "\nHP - " +mewTwo.getCurrentHealthPoints());
       
        SecondBossView secondBossView = new SecondBossView();
        secondBossView.display();   
            
    }

    }
