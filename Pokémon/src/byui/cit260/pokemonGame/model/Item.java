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
public class Item implements Serializable{
    
    private String inventoryType;
    private double inventoryQuantity;
    private ArrayList<Item> totalitems;

    public Item() {
    }

    public Item(String inventoryType, double inventoryQuantity) {
        this.inventoryType = inventoryType;
        this.inventoryQuantity = inventoryQuantity;
    } 

    public ArrayList<Item> getTotalitems() {
        return totalitems;
    }

    public void setTotalitems(ArrayList<Item> totalitems) {
        this.totalitems = totalitems;
    }
    
    public String getInventoryType() {
        return inventoryType;
    }

    public void setInventoryType(String inventoryType) {
        this.inventoryType = inventoryType;
    }

    public double getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(double inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + Objects.hashCode(this.inventoryType);
        hash = 71 * hash + (int) (Double.doubleToLongBits(this.inventoryQuantity) ^ (Double.doubleToLongBits(this.inventoryQuantity) >>> 32));
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
        final Item other = (Item) obj;
        if (Double.doubleToLongBits(this.inventoryQuantity) != Double.doubleToLongBits(other.inventoryQuantity)) {
            return false;
        }
        if (!Objects.equals(this.inventoryType, other.inventoryType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Item{" + "inventoryType=" + inventoryType + ", inventoryQuantity=" + inventoryQuantity + '}';
    }
    
    
    
}
