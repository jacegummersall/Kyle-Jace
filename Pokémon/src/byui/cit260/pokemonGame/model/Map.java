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
public class Map implements Serializable {
    
    //class instance variable
    private int rowCount;
    private int columnCount;
    private Location[][] locations;

    public Map(int rowCount, int columnCount) {

        if (rowCount < 1 || columnCount < 1){
            System.out.println("The number of rows and columns must be > zero.");
            return;
        }

        this.rowCount = rowCount;
        this.columnCount = columnCount;
        
        this.locations = new Location[rowCount][columnCount];
        
        for (int row = 0; row< rowCount; row++){
            for(int column = 0; column < columnCount; column++){
                Location location = new Location();
                location.setColumn(column);
                location.setRow(row);
                //location.setVisited(false);
                
                locations[row][column] = location;
            }
        }
    }

    public double getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public double getColumnCount() {
        return columnCount;
    }

    public void setColumnCount(int columnCount) {
        this.columnCount = columnCount;
    }

    public Location[][] getLocations() {
        return locations;
    }

    public void setLocations(Location[][] locations) {
        this.locations = locations;
    }

    public Map() {
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.rowCount) ^ (Double.doubleToLongBits(this.rowCount) >>> 32));
        hash = 89 * hash + (int) (Double.doubleToLongBits(this.columnCount) ^ (Double.doubleToLongBits(this.columnCount) >>> 32));
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
        final Map other = (Map) obj;
        if (Double.doubleToLongBits(this.rowCount) != Double.doubleToLongBits(other.rowCount)) {
            return false;
        }
        if (Double.doubleToLongBits(this.columnCount) != Double.doubleToLongBits(other.columnCount)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Map{" + "rowCount=" + rowCount + ", columnCount=" + columnCount + '}';
    }
    
    
    
}
