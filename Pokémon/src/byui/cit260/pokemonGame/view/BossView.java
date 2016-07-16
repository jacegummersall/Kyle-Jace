/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import pokémon.Pokémon;


/**
 *
 * @author jacegummersall
 */
public class BossView extends View{
        
        public void displayBossBanner() {
        System.out.println("\n"
                + "\nWell done, " + Pokémon.getPlayer().getName() + "!"
                + "\nI have seen your quick rise to becoming a great pokémon"
                + "\ntrainer and am quite impressed by your skills and love for"
                + "\nPokémon. Unfortunately, there is no greater Pokémon master"
                + "\nthan me, and your journey as a Pokémon trainer ends today"
                + "\nin a battle against me!!!");
        }
    
        public BossView() {
        
        super("\n"
                + "\n--------------------------"
                + "\n| Final Battle Menu"
                + "\n--------------------------"
                + "\nA - Attack"
                + "\nU - Use an Item"
                + "\n -------------------------");
        this.displayBossBanner();
    }
    
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

}
