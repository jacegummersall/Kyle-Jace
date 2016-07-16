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
        
    Pokemon geodude = Pokémon.getCurrentGame().getPokemons().get(6);
    int currentHP = geodude.getCurrentHealthPoints();
        
        if (currentHP > 0){
            AttackGeodudeBossView attackBossView = new AttackGeodudeBossView();
            attackBossView.display();
        }
        
        else{
            this.console.println("\n" + geodude.getPokemonName() + " has already fainted!");
        SecondBossView attackBossView = new SecondBossView();
        attackBossView.display();
        }
        
    }

    private void chooseDratini() {
        
    Pokemon dratini = Pokémon.getCurrentGame().getPokemons().get(7);
    int currentHP = dratini.getCurrentHealthPoints();
        
    if(currentHP > 0){
        AttackDratiniBossView attackBossView = new AttackDratiniBossView();
        attackBossView.display();
    }
       else{
            this.console.println("\n" + dratini.getPokemonName() + " has already fainted!");
        SecondBossView attackBossView = new SecondBossView();
        attackBossView.display();
    }
    }

    private void chooseDragonair() {
        
    Pokemon dragonair = Pokémon.getCurrentGame().getPokemons().get(8);
    int currentHP = dragonair.getCurrentHealthPoints();
    
    if(currentHP < 1){
        AttackDragonairBossView attackBossView = new AttackDragonairBossView();
        attackBossView.display();
    }
            else{
            this.console.println("\n" + dragonair.getPokemonName() + " has already fainted!");
        SecondBossView attackBossView = new SecondBossView();
        attackBossView.display();
        }
    }

    private void chooseDragonite() {
        
    Pokemon dragonite = Pokémon.getCurrentGame().getPokemons().get(9);
    int currentHP = dragonite.getCurrentHealthPoints();
     
    if(currentHP < 1){
        AttackDragoniteBossView attackBossView = new AttackDragoniteBossView();
        attackBossView.display();
    }
    else{
        this.console.println("\n" + dragonite.getPokemonName() + " has already fainted!");
        SecondBossView attackBossView = new SecondBossView();
        attackBossView.display();
        }    
    
    }
    
}
