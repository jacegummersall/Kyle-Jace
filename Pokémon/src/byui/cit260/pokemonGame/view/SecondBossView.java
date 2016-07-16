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
public class SecondBossView extends View{
        
    
        public SecondBossView() {
        
        super("\n"
                + "\n--------------------------"
                + "\n| Final Battle Menu"
                + "\n--------------------------"
                + "\nA - Attack"
                + "\nU - Use an Item"
                + "\n -------------------------");
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

}