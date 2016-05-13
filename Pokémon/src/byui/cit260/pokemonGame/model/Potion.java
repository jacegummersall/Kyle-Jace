/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

/**
 *
 * @author Thunder
 */
public class Potion extends Item{
    
    //class instance variable
    private double healCalculation;

    public double getHealCalculation() {
        return healCalculation;
    }

    public void setHealCalculation(double healCalculation) {
        this.healCalculation = healCalculation;
    }

    public Potion() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.healCalculation) ^ (Double.doubleToLongBits(this.healCalculation) >>> 32));
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
        final Potion other = (Potion) obj;
        if (Double.doubleToLongBits(this.healCalculation) != Double.doubleToLongBits(other.healCalculation)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Potion{" + "healCalculation=" + healCalculation + '}';
    }
    
    
    
}
