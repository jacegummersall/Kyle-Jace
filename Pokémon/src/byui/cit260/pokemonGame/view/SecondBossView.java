/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import byui.cit260.pokemonGame.model.Pokemon;
import pokémon.Pokémon;


/**
 *
 * @author jacegummersall
 */
public class SecondBossView extends View{
        
        public void displayBossBanner() {
            Pokemon geodude = Pokémon.getCurrentGame().getPokemons().get(6);
            Pokemon dratini = Pokémon.getCurrentGame().getPokemons().get(7); 
            Pokemon dragonair = Pokémon.getCurrentGame().getPokemons().get(8); 
            Pokemon dragonite = Pokémon.getCurrentGame().getPokemons().get(9); 
            if( geodude.getCurrentHealthPoints()<0
                    && dratini.getCurrentHealthPoints()<0
                    && dragonair.getCurrentHealthPoints()<0
                    && dragonite.getCurrentHealthPoints()<0){
            System.out.println("\n"
                + "\nWell done, " + Pokémon.getPlayer().getName() + "!"
                + "\nYou have sucessfully defeated Lance!"
                + "\n"
                + "\nYou are now the Pokémon champion"
                + "\n"
                + "\n");
        }
        }
    
    
        public SecondBossView() {
        
        super("\n"
                + "\n--------------------------"
                + "\n| Final Battle Menu"
                + "\n--------------------------"
                + "\nA - Attack"
                + "\nU - Use an Item"
                + "\n -------------------------");
        this.displayBossBanner();
    }
    
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "A": // Display game map
                this.displayAttack();
                break;
            case "U": //Display moving instructions
                this.displayItemListView();
                break;   
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
        }
        return false;
    }

    
    private void displayAttack() {
                BossPokemonView bossPokemonView = new BossPokemonView();
                bossPokemonView.display();   
    }

    private void displayItemListView() {
               
                ItemListView itemMenu = new ItemListView();
                itemMenu.display();    
    }

    private void displayWinGame(){
            Pokemon geodude = Pokémon.getCurrentGame().getPokemons().get(6);
            Pokemon dratini = Pokémon.getCurrentGame().getPokemons().get(7); 
            Pokemon dragonair = Pokémon.getCurrentGame().getPokemons().get(8); 
            Pokemon dragonite = Pokémon.getCurrentGame().getPokemons().get(9); 
            if( dratini.getCurrentHealthPoints()<0
                    && dragonair.getCurrentHealthPoints()<0
                    && dragonite.getCurrentHealthPoints()<0){
            this.displayBossBanner();
        }
    }
}