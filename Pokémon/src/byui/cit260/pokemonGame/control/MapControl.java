/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Scene;
import byui.cit260.pokemonGame.model.SceneType;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;
import java.awt.Point;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Player;
import byui.cit260.pokemonGame.model.Pokemon;
import java.util.ArrayList;

/**
 *
 * @author jacegummersall
 */
public class MapControl {

    public static Map createMap() throws MapControlException {
        
        Map map = new Map (5,10);
        
        Scene[] scenes = createScenes();
        
        assignScenesToLocations(map, scenes);
       
        return map;

    }

    private static Scene[] createScenes() {

        Scene[] scenes = new Scene[SceneType.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "Your uncle Professor Oak has helped you start your journey"
              + "by providing you with a speacial pokémon named Pikachu"
              + "it is your job to train and take care of him, search the map, find pokeballs, potions,"
              + "and capture more Pokémon in preparation for your final battle against Lance."
        );
        startingScene.setMapSymbol(" ST ");
        scenes[SceneType.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "Congratulations!!! You have defeated Lance and are now the best Pokémon"
              + "trainer in the world!");
        finishScene.setMapSymbol(" FN ");
        scenes[SceneType.finalScene.ordinal()] = finishScene;

        Scene pokeballScene = new Scene();
        pokeballScene.setDescription(
                "You have found 1 pokéball!");
        pokeballScene.setMapSymbol(" PB ");
        scenes[SceneType.pokeball.ordinal()] = pokeballScene;
        
        Scene masterballScene = new Scene();
        masterballScene.setDescription(
                "You have found 1 masterball!");
        masterballScene.setMapSymbol(" MB ");
        scenes[SceneType.masterball.ordinal()] = masterballScene;
        
        Scene potionScene = new Scene();
        potionScene.setDescription(
                "You have found 1 potion!");
        potionScene.setMapSymbol(" PO ");
        scenes[SceneType.potion.ordinal()] = potionScene;
        
        Scene superPotionScene = new Scene();
        superPotionScene.setDescription(
                "You have found 1 super potion!");
        superPotionScene.setMapSymbol(" SP ");
        scenes[SceneType.superPotion.ordinal()] = superPotionScene;
        
        Scene emptyScene = new Scene();
        emptyScene.setDescription(
                "nothing here continue on your journey");
        emptyScene.setMapSymbol(" RC ");
        scenes[SceneType.emptyScene.ordinal()] = emptyScene;
        
        Scene battleScene = new Scene();
        battleScene.setDescription(
                "You're entering a battle!!!");
        battleScene.setMapSymbol(" BA ");
        scenes[SceneType.battleScene.ordinal()] = battleScene;
        
        return scenes;
    }

    private static void assignScenesToLocations(Map map, Scene[] scenes)
                                    throws MapControlException{

            Location[][] locations = map.getLocations();
            
            if (locations == null) {
                throw new MapControlException("LOCATIONS IS NULL YOU DUMMY");
            }
            
            locations[0][0].setScene(scenes[SceneType.masterball.ordinal()]);
            locations[0][1].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[0][2].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[0][3].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[0][4].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[0][5].setScene(scenes[SceneType.masterball.ordinal()]);
            locations[0][6].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[0][7].setScene(scenes[SceneType.superPotion.ordinal()]);
            locations[0][8].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[0][9].setScene(scenes[SceneType.battleScene.ordinal()]);
            locations[1][0].setScene(scenes[SceneType.superPotion.ordinal()]);
            locations[1][1].setScene(scenes[SceneType.potion.ordinal()]);
            locations[1][2].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[1][3].setScene(scenes[SceneType.battleScene.ordinal()]);
            locations[1][4].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[1][5].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[1][6].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[1][7].setScene(scenes[SceneType.potion.ordinal()]);
            locations[1][8].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[1][9].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[2][0].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[2][1].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[2][2].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[2][3].setScene(scenes[SceneType.start.ordinal()]);
            locations[2][4].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[2][5].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[2][6].setScene(scenes[SceneType.potion.ordinal()]);
            locations[2][7].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[2][8].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[2][9].setScene(scenes[SceneType.superPotion.ordinal()]);
            locations[3][0].setScene(scenes[SceneType.potion.ordinal()]);
            locations[3][1].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[3][2].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[3][3].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[3][4].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[3][5].setScene(scenes[SceneType.battleScene.ordinal()]);
            locations[3][6].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[3][7].setScene(scenes[SceneType.pokeball.ordinal()]);
            locations[3][8].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[3][9].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[4][0].setScene(scenes[SceneType.battleScene.ordinal()]);
            locations[4][1].setScene(scenes[SceneType.potion.ordinal()]);
            locations[4][2].setScene(scenes[SceneType.superPotion.ordinal()]);
            locations[4][3].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[4][4].setScene(scenes[SceneType.potion.ordinal()]);
            locations[4][5].setScene(scenes[SceneType.potion.ordinal()]);
            locations[4][6].setScene(scenes[SceneType.emptyScene.ordinal()]);
            locations[4][7].setScene(scenes[SceneType.superPotion.ordinal()]);
            locations[4][8].setScene(scenes[SceneType.battleScene.ordinal()]);
            locations[4][9].setScene(scenes[SceneType.finalScene.ordinal()]); 
    }
    
    public static void moveCharacterToLocation(Character character, String direction)
                                            throws MapControlException{
                    
        Map map = Pokémon.getCurrentGame().getMap();
        Location[][] locations = map.getLocations();
        Point position = character.getLocation();
        Location oldLocation = locations[position.x][position.y];
        ArrayList<Character> charactersInOldLocation = oldLocation.getCharactersInLocation();
        Location newLocation; 
        
        
        if(direction.equals("M N")){
            if (position.x == 0) {
                System.out.println("You cannot go in that direction");
                return;
            }
            charactersInOldLocation.remove(character);
                position.x--;
            newLocation = locations[position.x][position.y];
            newLocation.getCharactersInLocation().add(character);
            
            newLocation.setVisited(true);
            
            
        }
         
        if(direction.equals("M S")){
            if (position.x == 4) {
                System.out.println("You cannot go in that direction");
                return;
            }
            charactersInOldLocation.remove(character);
                position.x++;
            newLocation = locations[position.x][position.y];
            newLocation.getCharactersInLocation().add(character);
            
            newLocation.setVisited(true);
        }
        
        if(direction.equals("M W")){
            if (position.y == 0) {
                System.out.println("You cannot go in that direction");
                return;
            }
            charactersInOldLocation.remove(character);
                position.y--;
            newLocation = locations[position.x][position.y];
            newLocation.getCharactersInLocation().add(character);
            
            newLocation.setVisited(true);
        }
        
        if(direction.equals("M E")){
            if (position.y == 9) {
                System.out.println("You cannot go in that direction");
                return;
            }
            charactersInOldLocation.remove(character);
                position.y++;
            newLocation = locations[position.x][position.y];
            newLocation.getCharactersInLocation().add(character);
            
            newLocation.setVisited(true);
        }
        
        
         if (character == null){
             throw new MapControlException("Invalid Character");
         }
         
         
         if (position.x < 0 || position.x > 5 || position.y < 0 || position.y > 9){
             throw new MapControlException("Invalid location");
         }
         
         
 if (direction == null || (!direction.equals("M N") && 
                                  !direction.equals("M S") &&
                                  !direction.equals("M E") &&
                                  !direction.equals("M W"))){
             throw new MapControlException("Can not move actor to location "
                                            + position.x + ", " + position.y
                                            + " because that location does not"
                                            + " exist on the map.");
         }                               
                           
        
        
                                  
         
    }
    
    public static void moveCharactersToStartingLocation(Map map)
                                                throws MapControlException{

       Character mainCharacter = Pokémon.getCurrentGame().getCharacters()[ListConstants.mainCharacterIndex];
       Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       mainCharacter.setLocation(new Point(2,3));
       
       // get the location at 2, 3
       Location location = locations[2][3];
     
       // get the characterList in the location
       // add the character to the array list
       location.getCharactersInLocation().add(mainCharacter);
       
       location.setVisited(true);
       
       Character finalBossCharacter = Pokémon.getCurrentGame().getCharacters()[ListConstants.finalBoss];
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       finalBossCharacter.setLocation(new Point(4,9));
       
       // get the location at 4, 9
       location = locations[4][9];
     
       // get the characterList in the location
       // add the character to the array list
       location.getCharactersInLocation().add(finalBossCharacter);
       
       location.setVisited(true);
    }
    
    public static void movePokemonToStartingLocation(Map map)
                                                throws MapControlException{


       Pokemon rattata = Pokémon.getCurrentGame().getPokemons().get(1);
       Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       rattata.setLocation(new Point(1,3));
       
       // get the location at 2, 3
       Location location = locations[1][3];
     
       // get the characterList in the location
       // add the character to the array list
       location.getPokemonInLocation().add(rattata);
       
       Pokemon charizard = Pokémon.getCurrentGame().getPokemons().get(2);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       charizard.setLocation(new Point(4,0));
       
       // get the location at 2, 3
       location = locations[4][0];
     
       // get the characterList in the location
       // add the character to the array list
       location.getPokemonInLocation().add(charizard);
       
       Pokemon spearow = Pokémon.getCurrentGame().getPokemons().get(3);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       spearow.setLocation(new Point(3,5));
       
       // get the location at 2, 3
       location = locations[3][5];
     
       // get the characterList in the location
       // add the character to the array list
       location.getPokemonInLocation().add(spearow);
       
       Pokemon gyarados = Pokémon.getCurrentGame().getPokemons().get(4);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       gyarados.setLocation(new Point(4,8));
       
       // get the location at 2, 3
       location = locations[4][8];
     
       // get the characterList in the location
       // add the character to the array list
       location.getPokemonInLocation().add(gyarados);

       Pokemon mewtwo = Pokémon.getCurrentGame().getPokemons().get(5);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       mewtwo.setLocation(new Point(0,9));
       
       // get the location at 2, 3
       location = locations[0][9];
     
       // get the characterList in the location
       // add the character to the array list
       location.getPokemonInLocation().add(mewtwo);
    }
    
    public static void moveItemsToStartingLocation(Map map)
                                                throws MapControlException{

       Item potion = Pokémon.getCurrentGame().getItems().get(0);
       Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       potion.setLocation(new Point(3,0));
       potion.setLocation(new Point(1,1));
       potion.setLocation(new Point(1,4));
       potion.setLocation(new Point(4,4));
       potion.setLocation(new Point(4,5));
       potion.setLocation(new Point(2,5));
       potion.setLocation(new Point(1,7));
       // get the location at 2,3
       
       locations[3][0].getItemInLocation().add(potion);
       locations[1][1].getItemInLocation().add(potion);
       locations[1][4].getItemInLocation().add(potion);
       locations[4][4].getItemInLocation().add(potion);
       locations[4][5].getItemInLocation().add(potion);
       locations[2][5].getItemInLocation().add(potion);
       locations[1][7].getItemInLocation().add(potion);
       
       Item superPotion = Pokémon.getCurrentGame().getItems().get(1);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       superPotion.setLocation(new Point(1,0));
       superPotion.setLocation(new Point(4,2));
       superPotion.setLocation(new Point(0,7));
       superPotion.setLocation(new Point(4,7));
       superPotion.setLocation(new Point(2,9));

       // get the location at 2, 3
       locations[1][0].getItemInLocation().add(superPotion);
       locations[4][2].getItemInLocation().add(superPotion);
       locations[0][7].getItemInLocation().add(superPotion);
       locations[4][7].getItemInLocation().add(superPotion);
       locations[2][9].getItemInLocation().add(superPotion);


       Item pokeball = Pokémon.getCurrentGame().getItems().get(2);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       pokeball.setLocation(new Point(2,2));
       pokeball.setLocation(new Point(0,3));
       pokeball.setLocation(new Point(3,3));
       pokeball.setLocation(new Point(2,4));
       pokeball.setLocation(new Point(3,7));
       pokeball.setLocation(new Point(2,8));
       
       // get the location at 2, 3
       locations[2][2].getItemInLocation().add(pokeball);
       locations[0][3].getItemInLocation().add(pokeball);
       locations[3][3].getItemInLocation().add(pokeball);
       locations[2][4].getItemInLocation().add(pokeball);
       locations[3][7].getItemInLocation().add(pokeball);
       locations[2][8].getItemInLocation().add(pokeball);

       
       Item masterball = Pokémon.getCurrentGame().getItems().get(3);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       masterball.setLocation(new Point(0,0));
       masterball.setLocation(new Point(0,5));

       
       // get the location at 2, 3
       locations[0][0].getItemInLocation().add(masterball);
       locations[0][5].getItemInLocation().add(masterball);

       Item rareCandy = Pokémon.getCurrentGame().getItems().get(4);
       locations = Pokémon.getCurrentGame().getMap().getLocations();
       
       rareCandy.setLocation(new Point(0,1));
       rareCandy.setLocation(new Point(0,2));
       rareCandy.setLocation(new Point(0,4));
       rareCandy.setLocation(new Point(0,6));
       rareCandy.setLocation(new Point(0,8));
       rareCandy.setLocation(new Point(1,2));
       rareCandy.setLocation(new Point(1,5));
       rareCandy.setLocation(new Point(1,6));
       rareCandy.setLocation(new Point(1,8));
       rareCandy.setLocation(new Point(1,9));
       rareCandy.setLocation(new Point(2,0));
       rareCandy.setLocation(new Point(2,1));
       rareCandy.setLocation(new Point(2,6));
       rareCandy.setLocation(new Point(2,7));
       rareCandy.setLocation(new Point(3,1));
       rareCandy.setLocation(new Point(3,2));
       rareCandy.setLocation(new Point(3,4));
       rareCandy.setLocation(new Point(3,6));
       rareCandy.setLocation(new Point(3,8));
       rareCandy.setLocation(new Point(3,9));
       rareCandy.setLocation(new Point(4,1));
       rareCandy.setLocation(new Point(4,3));
       rareCandy.setLocation(new Point(4,6));
       
       

       
       // get the location at 2, 3
       locations[0][1].getItemInLocation().add(rareCandy);
       locations[0][2].getItemInLocation().add(rareCandy);
       locations[0][4].getItemInLocation().add(rareCandy);
       locations[0][6].getItemInLocation().add(rareCandy);
       locations[0][8].getItemInLocation().add(rareCandy);
       locations[1][2].getItemInLocation().add(rareCandy);
       locations[1][5].getItemInLocation().add(rareCandy);
       locations[1][6].getItemInLocation().add(rareCandy);
       locations[1][8].getItemInLocation().add(rareCandy);
       locations[1][9].getItemInLocation().add(rareCandy);
       locations[2][0].getItemInLocation().add(rareCandy);
       locations[2][1].getItemInLocation().add(rareCandy);
       locations[2][6].getItemInLocation().add(rareCandy);
       locations[2][7].getItemInLocation().add(rareCandy);
       locations[3][1].getItemInLocation().add(rareCandy);
       locations[3][2].getItemInLocation().add(rareCandy);
       locations[3][4].getItemInLocation().add(rareCandy);
       locations[3][6].getItemInLocation().add(rareCandy);
       locations[3][8].getItemInLocation().add(rareCandy);
       locations[3][9].getItemInLocation().add(rareCandy);
       locations[4][1].getItemInLocation().add(rareCandy);
       locations[4][3].getItemInLocation().add(rareCandy);
       locations[4][6].getItemInLocation().add(rareCandy);
    }
    
    
//    public static void moveEmptySpacesToStartingLocation(Map map)
//                                                throws MapControlException{
//        Location nothing = Pokémon.getCurrentGame();
//        Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
//        
//        
//    }
    
    public static void assignPikachuToPlayer(){
      
       Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
       
       Pokemon pikachu = Pokémon.getCurrentGame().getPokemons().get(0);
       
       mainCharacter.setStartingPokemon(pikachu);
      
       mainCharacter.getPokemonCaptured().add(pikachu);
    }
    public static void assignPokemonToLance(){
       
       Character finalBoss = Pokémon.getCurrentGame().getFinalBoss();
       
       Pokemon pokemon = Pokémon.getCurrentGame().getPokemons().get(6);
       Pokémon.getCurrentGame().getPokemons().get(7);
       Pokémon.getCurrentGame().getPokemons().get(8);
       Pokémon.getCurrentGame().getPokemons().get(9);
       
       finalBoss.setStartingPokemon(pokemon);
  
    }
    
    }
