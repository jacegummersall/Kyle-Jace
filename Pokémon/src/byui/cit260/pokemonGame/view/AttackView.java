/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Pokemon;
import java.util.ArrayList;

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
        Pokemon pikachu = new Pokemon();

        pikachu.getCurrentHealthPoints();
        pikachu.getDefense();
        pikachu.getFullHealthPoints();
        pikachu.getStrength();
    }

    private void chooseRatatta() {
        Pokemon ratatta = new Pokemon();

        ratatta.getCurrentHealthPoints();
        ratatta.getDefense();
        ratatta.getFullHealthPoints();
        ratatta.getStrength();
    }

    private void chooseSpearow() {
        Pokemon spearow = new Pokemon();

        spearow.getCurrentHealthPoints();
        spearow.getDefense();
        spearow.getFullHealthPoints();
        spearow.getStrength();    }

    private void chooseCharizard() {
        Pokemon charizard = new Pokemon();

        charizard.getCurrentHealthPoints();
        charizard.getDefense();
        charizard.getFullHealthPoints();
        charizard.getStrength();    }

    private void chooseGyarados() {
        Pokemon gyarados = new Pokemon();

        gyarados.getCurrentHealthPoints();
        gyarados.getDefense();
        gyarados.getFullHealthPoints();
        gyarados.getStrength();    }

    private void chooseMewTwo() {
        Pokemon mewTwo = new Pokemon();

        mewTwo.getCurrentHealthPoints();
        mewTwo.getDefense();
        mewTwo.getFullHealthPoints();
        mewTwo.getStrength();    }

    }
