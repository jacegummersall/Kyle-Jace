/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.awt.Point;

/**
 *
 * @author jacegummersall
 */
public enum ContactCharacters {
    
    Red("The inspiration of the main character"),
    Ash("The boy wonder who tries to catch em all"),
    Gary("The rival who is always trying to oust you and grandson of Professor Oak"),
    ProfessorOak("Pokemon professor who gives you your starting pokémon"),
    Mom("The one who keeps you in line and expects you to call every one in a while.");
   
    private final Point coordinates;
    private final String description;

ContactCharacters(String description){
    this.description = description;
    coordinates = new Point(1,1);
}

public String getDescription(){
        return description;
}

public Point getCoordinates(){
        return coordinates;
}
    
}
