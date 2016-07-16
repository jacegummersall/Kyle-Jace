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
public class BossPokemonView extends View {

    public void displayBossBanner() {
        System.out.println("Choose the Pokémon you wish to attack");
    }
    
    public BossPokemonView(){
        super("\n"
                + "\n--------------------------"
                + "\n|   Lance's Pokémon"
                + "\n--------------------------"
                + "\nG - Geodude"
                + "\nD - Dratini"
                + "\nA - Dragonair"
                + "\nI - Dragonite"
                + "\n -------------------------");
        
    }
   
    @Override
    public boolean doAction(String value) {
        
        value = value.toUpperCase(); //convert choice to upper case
        
        switch (value) {
            case "G": // select pikachu
                this.chooseGeodude();
                break;
            case "D": //select Ratatta
                this.chooseDratini();
                break;
            case "A": //select Spearow
                this.chooseDragonair();
                break;
            case "I": //select Charizard
                this.chooseDragonite();
                break;                
            default:
                System.out.println("\n*** Invalid Selection *** Try again!");
                break;
                        
        }
        return false;
    }
     

    private void chooseGeodude() {
        AttackBossView attackBossView = new AttackBossView();
        attackBossView.display();
        
        
    }

    private void chooseDratini() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseDragonair() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void chooseDragonite() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
