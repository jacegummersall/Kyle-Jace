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
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.DamageControlException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jacegummersall
 */
public class AttackView extends View {
    
    public AttackView(){
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
            
            int healthPoints = pikachu.getCurrentHealthPoints();
            int attack = pikachu.getStrength();
            int defense = pikachu.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void chooseRatatta() {
   
        try {
            Pokemon ratatta = Pokémon.getCurrentGame().getPokemons().get(1);
            
            int healthPoints = ratatta.getCurrentHealthPoints();
            int attack = ratatta.getStrength();
            int defense = ratatta.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void chooseSpearow() {
   
        try {
            Pokemon spearow = Pokémon.getCurrentGame().getPokemons().get(2);
            
            int healthPoints = spearow.getCurrentHealthPoints();
            int attack = spearow.getStrength();
            int defense = spearow.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void chooseCharizard() {
   
        try {
            Pokemon charizard = Pokémon.getCurrentGame().getPokemons().get(3);
            
            int healthPoints = charizard.getCurrentHealthPoints();
            int attack = charizard.getStrength();
            int defense = charizard.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void chooseGyarados() {
   
        try {
            Pokemon gyarados = Pokémon.getCurrentGame().getPokemons().get(4);
            
            int healthPoints = gyarados.getCurrentHealthPoints();
            int attack = gyarados.getStrength();
            int defense = gyarados.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
    }

    private void chooseMewTwo() {
   
        try {
            Pokemon mewTwo = Pokémon.getCurrentGame().getPokemons().get(5);
            
            int healthPoints = mewTwo.getCurrentHealthPoints();
            int attack = mewTwo.getStrength();
            int defense = mewTwo.getDefense();
            
            
            DamageControl.calcDamage(healthPoints, attack, defense);
        } catch (DamageControlException ex) {
            System.out.println(ex.getMessage());
        }
        
        BattleMenuView battleMenu = new BattleMenuView();
        battleMenu.display();
        
    }

    }
