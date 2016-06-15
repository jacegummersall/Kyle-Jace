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
        System.out.println("\n*** choosePikachu stub function called ***");
    }

    private void chooseRatatta() {
        System.out.println("\n*** choosePikachu stub function called ***");
    }

    private void chooseSpearow() {
        System.out.println("\n*** chooseSpearow stub function called ***");
    }

    private void chooseCharizard() {
        System.out.println("\n*** chooseCharizard stub function called ***");
    }

    private void chooseGyarados() {
        System.out.println("\n*** chooseGyarados stub function called ***");
    }

    private void chooseMewTwo() {
        System.out.println("\n*** chooseMewTwo stub function called ***");
    }

    private void returnToGameMenu() {
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

}
