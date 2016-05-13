/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.util.Objects;

/**
 *
 * @author Thunder
 */
public class Boss extends Scene{
    
    //class instance variable
    private String requirement;
    private String winGame;
    private double calculation;

    public String getRequirement() {
        return requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public String getWinGame() {
        return winGame;
    }

    public void setWinGame(String winGame) {
        this.winGame = winGame;
    }

    public double getCalculation() {
        return calculation;
    }

    public void setCalculation(double calculation) {
        this.calculation = calculation;
    }

    public Boss() {
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + Objects.hashCode(this.requirement);
        hash = 31 * hash + Objects.hashCode(this.winGame);
        hash = 31 * hash + (int) (Double.doubleToLongBits(this.calculation) ^ (Double.doubleToLongBits(this.calculation) >>> 32));
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
        final Boss other = (Boss) obj;
        if (Double.doubleToLongBits(this.calculation) != Double.doubleToLongBits(other.calculation)) {
            return false;
        }
        if (!Objects.equals(this.requirement, other.requirement)) {
            return false;
        }
        if (!Objects.equals(this.winGame, other.winGame)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Boss{" + "requirement=" + requirement + ", winGame=" + winGame + ", calculation=" + calculation + '}';
    }
    
    
    
}
