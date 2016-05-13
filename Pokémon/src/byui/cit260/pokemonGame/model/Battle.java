/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.io.Serializable;

/**
 *
 * @author Thunder
 */
public class Battle implements Serializable {
    
    //class instance variable
    private double calculation;
    private double pokeball;

    public double getCalculation() {
        return calculation;
    }

    public void setCalculation(double calculation) {
        this.calculation = calculation;
    }

    public double getPokeball() {
        return pokeball;
    }

    public void setPokeball(double pokeball) {
        this.pokeball = pokeball;
    }

    public Battle() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.calculation) ^ (Double.doubleToLongBits(this.calculation) >>> 32));
        hash = 41 * hash + (int) (Double.doubleToLongBits(this.pokeball) ^ (Double.doubleToLongBits(this.pokeball) >>> 32));
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
        final Battle other = (Battle) obj;
        if (Double.doubleToLongBits(this.calculation) != Double.doubleToLongBits(other.calculation)) {
            return false;
        }
        if (Double.doubleToLongBits(this.pokeball) != Double.doubleToLongBits(other.pokeball)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Battle{" + "calculation=" + calculation + ", pokeball=" + pokeball + '}';
    }
    
    
    
}
