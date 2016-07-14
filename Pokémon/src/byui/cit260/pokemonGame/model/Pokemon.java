/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jacegummersall
 */
public class Pokemon implements Serializable{
    
    private String pokemonName;
    private int strength;
    private int defense;
    private int fullHealthPoints;
    private int currentHealthPoints;
    private int pokemonQuantity;
    private Point location;


    public Pokemon() {
    }

    public Pokemon(String pokemonName, int strength, int defense, int healthPoints, int pokemonQuantity) {
        this.pokemonName = pokemonName;
        this.strength = strength;
        this.defense = defense;
        this.fullHealthPoints = healthPoints;
        this.pokemonQuantity = pokemonQuantity;
        this.currentHealthPoints = this.fullHealthPoints;
    }

    public int getPokemonQuantity() {
        return pokemonQuantity;
    }

    public void setPokemonQuantity(int pokemonQuantity) {
        this.pokemonQuantity = pokemonQuantity;
    }

    
    
    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getFullHealthPoints() {
        return fullHealthPoints;
    }

    public void setFullHealthPoints(int fullHealthPoints) {
        this.fullHealthPoints = fullHealthPoints;
    }

    public int getCurrentHealthPoints() {
        return currentHealthPoints;
    }

    public void setCurrentHealthPoints(int currentHealthPoints) {
        this.currentHealthPoints = currentHealthPoints;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pokemonName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.fullHealthPoints) ^ (Double.doubleToLongBits(this.fullHealthPoints) >>> 32));
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
        final Pokemon other = (Pokemon) obj;
        if (Double.doubleToLongBits(this.strength) != Double.doubleToLongBits(other.strength)) {
            return false;
        }
        if (Double.doubleToLongBits(this.defense) != Double.doubleToLongBits(other.defense)) {
            return false;
        }
        if (Double.doubleToLongBits(this.fullHealthPoints) != Double.doubleToLongBits(other.fullHealthPoints)) {
            return false;
        }
        if (!Objects.equals(this.pokemonName, other.pokemonName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "pokemonName=" + pokemonName + ", strength=" + strength + ", defense=" + defense + ", healthPoints=" + fullHealthPoints + '}';
    }
    
    
    
}
