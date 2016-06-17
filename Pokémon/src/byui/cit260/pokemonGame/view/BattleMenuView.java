/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

/**
 *
 * @author Thunder
 */
public class BattleMenuView extends View{
    
    public BattleMenuView(){
        super("\n"
                + "\n--------------------------"
                + "\n| Battle Menu"
                + "\n--------------------------"
                + "\n"
                + "\n 100 - Pikachu HP"
                + "\n 60 - Spearow HP"
                + "\n"
                + "\nA - Attack"
                + "\nT - Throw pokéball"
                + "\nU - Use an item"
                + "\nR - Run away"
                + "\n -------------------------");
    }
    
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "A": // Display result of attack
                this.displayAttack();
                break;
            case "T": //Display if pokémon was caught
                this.displayPokeball();
                break;
            case "U": //Display if pokémon was caught
                this.displayItemList();
                break;
            case "R": //Display if pokémon was caught
                this.returnToMapMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
                        
        }
        return false;
    
    
}

    private void displayAttack() {
        System.out.println("\n *** displayAttack stub function called ***");
    }

    private void displayPokeball() {
        System.out.println("\n *** displayPokeball stub function called ***");
    }

    private void displayItemList() {
        ItemListView itemMenu = new ItemListView();
        
        itemMenu.display();
    }
    
    private void returnToMapMenu() {
        
        MapMenuView mapMenu = new MapMenuView();
        mapMenu.display();
    }
}
