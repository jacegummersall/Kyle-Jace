/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import java.util.Scanner;

/**
 *
 * @author jacegummersall
 */
public class MapMenuView extends View{
    
    
    
    public MapMenuView() {
        super("\n"
                + "\n--------------------------"
                + "\n|   Map Menu"
                + "\n--------------------------"
                + "\nM N - Move North"
                + "\nM S - Move South"
                + "\nM E - Move East"
                + "\nM W - Move West"
                + "\nE - Explore Square"
                + "\nB - Back"
                + "\n -------------------------");
        
    }
    

    

    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "M N": // create and start a new game
                this.moveNorth();
                break;
            case "M S": //load and start and existing game
                this.moveSouth();
                break;
            case "M E": //load and start and existing game
                this.moveEast();
                break;
            case "M W": //load and start and existing game
                this.moveWest();
                break;                
            case "E": //load and start and existing game
                this.exploreSquare();
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

    private void moveNorth() {
        System.out.println("\n*** moveNorth stub function called ***");
    }

    private void moveSouth() {
        System.out.println("\n*** moveSouth stub function called ***");
    }

    private void moveEast() {
        System.out.println("\n*** moveEast stub function called ***");
    }

    private void moveWest() {
        System.out.println("\n*** moveWest stub function called ***");
    }

    private void exploreSquare() {
        System.out.println("\n*** exploreSquare stub function called ***");
    }

    private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayGameMenuView();
    }
}
