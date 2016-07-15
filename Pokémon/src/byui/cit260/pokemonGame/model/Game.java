/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.model;

import java.io.Serializable;
import java.util.ArrayList;
import pokémon.Pokémon;


/**
 *
 * @author Thunder
 *//**
 *
 * @author Thunder
 */
public class Game implements Serializable {
    
    //class instance variable
    private double startTime;
    private double endTime; 
   
    private Player player;
    private Character[] characters;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Pokemon> pokemons = new ArrayList<>();
    private Map map;   
    private Character playingCharacter;
   
    
    public double getStartTime() {
        return startTime;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public double getEndTime() {
        return endTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

    public Character[] getCharacters() {
        return characters;
    }

    public void setCharacters(Character[] characters) {
        this.characters = characters;
    }  

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Pokemon> getPokemons() {
        return pokemons;
    }

    public void setPokemons(ArrayList<Pokemon> pokemons) {
        this.pokemons = pokemons;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Character getPlayingCharacter() {
        return playingCharacter;
    }

    public void setPlayingCharacter(Character playingCharacter) {
        this.playingCharacter = playingCharacter;
    }
    
    
    
    public Game() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.startTime) ^ (Double.doubleToLongBits(this.startTime) >>> 32));
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.endTime) ^ (Double.doubleToLongBits(this.endTime) >>> 32));
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
        final Game other = (Game) obj;
        if (Double.doubleToLongBits(this.startTime) != Double.doubleToLongBits(other.startTime)) {
            return false;
        }
        if (Double.doubleToLongBits(this.endTime) != Double.doubleToLongBits(other.endTime)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Game{" + "startTime=" + startTime + ", endTime=" + endTime + '}';
    }
    
    
}
