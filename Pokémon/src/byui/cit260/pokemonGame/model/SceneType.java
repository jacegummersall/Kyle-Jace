/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

/**
 *
 * @author jacegummersall
 */
public enum SceneType {
   
   start("This is when you start the program"),
   pokeball("A pokeball is found here"),
   masterball("A masterball is found here"),
   potion("A potion is found here"),
   superPotion("A super potion is found here"),
   battleScene("a battle occurs here"),
   emptyScene("There is nothing here continue your journey"),
   finalScene("You beat lance and when the game");
   
   private final String description;
   
   SceneType(String description){
    
       this.description = description;
       
   }
   
   public String getDescription(){
       return description;
   }
   
    
}
