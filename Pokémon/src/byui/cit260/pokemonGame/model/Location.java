/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author jacegummersall
 */
public class Location implements Serializable{
    
    private int row;
    private int column;
    private boolean visited;
    private Scene scene;
    private ArrayList<Character> charactersInLocation = new ArrayList<>();
    private ArrayList<Pokemon> pokemonInLocation = new ArrayList<>();
    private ArrayList<Item> itemInLocation = new ArrayList<>();
    private Object nothing;
    
    public Location() {
    }

    public double getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public double getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean getVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public ArrayList<Character> getCharactersInLocation() {
        return charactersInLocation;
    }

    public void setCharactersInLocation(ArrayList<Character> charactersInLocation) {
        this.charactersInLocation = charactersInLocation;
    }

    public ArrayList<Pokemon> getPokemonInLocation() {
        return pokemonInLocation;
    }

    public void setPokemonInLocation(ArrayList<Pokemon> pokemonInLocation) {
        this.pokemonInLocation = pokemonInLocation;
    }

    public ArrayList<Item> getItemInLocation() {
        return itemInLocation;
    }

    public void setItemInLocation(ArrayList<Item> itemInLocation) {
        this.itemInLocation = itemInLocation;
    }

    public Object getNothing() {
        return nothing;
    }

    public void setNothing(Object nothing) {
        this.nothing = nothing;
    }
    
    
    
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.row) ^ (Double.doubleToLongBits(this.row) >>> 32));
        hash = 17 * hash + (int) (Double.doubleToLongBits(this.column) ^ (Double.doubleToLongBits(this.column) >>> 32));
        hash = 17 * hash + Objects.hashCode(this.visited);
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
        final Location other = (Location) obj;
        if (Double.doubleToLongBits(this.row) != Double.doubleToLongBits(other.row)) {
            return false;
        }
        if (Double.doubleToLongBits(this.column) != Double.doubleToLongBits(other.column)) {
            return false;
        }
        if (!Objects.equals(this.visited, other.visited)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Location{" + "row=" + row + ", column=" + column + ", visited=" + visited + '}';
    }

    
    
    
}
