/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author jacegummersall
 */
/**
 *
 * @author jacegummersall
 */
public class Character implements Serializable{
    
    //class instance variables
    private String name;
    private Point position;
    private Location location;
    private String description;
    private ArrayList<Item> itemsCollected = new ArrayList<>();
    private ArrayList<Pokemon> pokemonCaptured = new ArrayList<>();
    
    public Character() {
    }

    public Character(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Location getCharacterLocation() {
        return location;
    }

    public void setCharacterLocation(Location characterLocation) {
        this.location = characterLocation;
    }

    public ArrayList<Item> getUsedItems() {
        return usedItems;
    }

    public void setUsedItems(ArrayList<Item> usedItems) {
        this.usedItems = usedItems;
    }
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getLocation() {
        return position;
    }

    public void setLocation(Point location) {
        this.position = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Item> getItemsCollected() {
        return itemsCollected;
    }

    public void setItemsCollected(ArrayList<Item> itemsCollected) {
        this.itemsCollected = itemsCollected;
    }

    public ArrayList<Pokemon> getPokemonCaptured() {
        return pokemonCaptured;
    }

    public void setPokemonCaptured(ArrayList<Pokemon> pokemonCaptured) {
        this.pokemonCaptured = pokemonCaptured;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.name);
        hash = 53 * hash + Objects.hashCode(this.position);
        hash = 53 * hash + Objects.hashCode(this.description);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Character other = (Character) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.position, other.position)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Character{" + "name=" + name + ", location=" + position + ", description=" + description + '}';
    }

    




    
}
