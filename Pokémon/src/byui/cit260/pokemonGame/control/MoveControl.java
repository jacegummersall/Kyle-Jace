/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import byui.cit260.pokemonGame.view.BossView;


/**
 *
 * @author jacegummersall
 */
public class MoveControl {
     
    public boolean location(int x, int y) {

        if (x < 0) {
            return false;
        }
        
        if (y < 0) {
            return false;
        }
        
        if (x > 50) {
            return false;
        }
        
        if (y > 50) {
            return false;
        }
        
        if (x == 45 && y == 40) {
            
            displayBossView();
            
            return true;
        }

        else { System.out.println("\nYou are here");
            return true;
        }

    }

    private void displayBossView() {
        BossView bossView = new BossView();
        bossView.display();
    }

}