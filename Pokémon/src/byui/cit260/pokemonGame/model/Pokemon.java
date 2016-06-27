/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author jacegummersall
 */
public class Pokemon implements Serializable{
    
    private String pokemonName;
    private double strength;
    private double defense;
    private double healthPoints;

    public Pokemon() {
    }

    public Pokemon(String pokemonName, double strength, double defense, double healthPoints) {
        this.pokemonName = pokemonName;
        this.strength = strength;
        this.defense = defense;
        this.healthPoints = healthPoints;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
        this.strength = strength;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(double healthPoints) {
        this.healthPoints = healthPoints;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.pokemonName);
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.strength) ^ (Double.doubleToLongBits(this.strength) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.defense) ^ (Double.doubleToLongBits(this.defense) >>> 32));
        hash = 97 * hash + (int) (Double.doubleToLongBits(this.healthPoints) ^ (Double.doubleToLongBits(this.healthPoints) >>> 32));
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
        if (Double.doubleToLongBits(this.healthPoints) != Double.doubleToLongBits(other.healthPoints)) {
            return false;
        }
        if (!Objects.equals(this.pokemonName, other.pokemonName)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "pokemonName=" + pokemonName + ", strength=" + strength + ", defense=" + defense + ", healthPoints=" + healthPoints + '}';
    }
    
    
    
}
