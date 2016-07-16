/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

/**
 *
 * @author jacegummersall
 */

public class ReturnToGameMenu extends View{
    
    public ReturnToGameMenu() {

        super   ("\n"
                + "\n--------------------------"
                + "\n| Return to Game Menu"
                + "\n--------------------------"
                + "\nB - Back"
                + "\n--------------------------");
        }

    @Override
    public boolean doAction(String value) {

        value = value.toUpperCase(); //convert choice to upper case

        switch (value) {
            case "B": //load and start and existing game
                this.returnToGameMenu();
                break;
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break; 
        }
    return false;
    }       
        private void returnToGameMenu() {
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();        
        }
}
