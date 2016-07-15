/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.control;

import byui.cit260.pokemonGame.model.Player;
import byui.cit260.pokemonGame.view.GameMenuView;
import pokémon.Pokémon;
import byui.cit260.pokemonGame.model.Character;
import byui.cit260.pokemonGame.model.Game;
import byui.cit260.pokemonGame.model.Item;
import byui.cit260.pokemonGame.model.Location;
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Pokemon;
import byui.cit260.pokemonGame.model.Scene;
import citbyui.cit260.pokemonGame.exceptions.GameControlException;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;
import java.awt.Point;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Thunder
 */
public class GameControl {

    public static Player createPlayer(String playersName) 
                                    throws GameControlException{
        
        if (playersName == null) {
            throw new GameControlException("Player's name is null");
        }
        Player player = new Player();
        player.setName(playersName);
        
        Pokémon.setPlayer(player); // save the player
        
        return player;
    }

    public static void createNewGame(Player player) throws MapControlException {

        Game game = new Game();
        Pokémon.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Character[] characters = GameControl.createCharacterList();
        game.setCharacters(characters);
        
        ArrayList<Item> items = GameControl.createNewItemList();
        game.setItems(items);
        
        ArrayList<Pokemon> pokemons = GameControl.addPokemon();
        game.setPokemons(pokemons);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveCharactersToStartingLocation(map);
        
        MapControl.moveItemsToStartingLocation(map);
        
        MapControl.movePokemonToStartingLocation(map);
        
        MapControl.assignPikachuToPlayer();
        
    }
        
    private static Character[] createCharacterList(){
        
        Character[] characters = new Character[ListConstants.NUMBER_OF_CHARACTERS];
        
        Character gamePlayer = new Character(Pokémon.getPlayer().getName(),"Pokémon Trainer");
        characters[ListConstants.mainCharacterIndex] = gamePlayer;
        
        Pokémon.getCurrentGame().setPlayingCharacter(gamePlayer);
        
        Character lance = new Character("Lance","Pokemon Champion");
        characters[ListConstants.finalBoss] = lance;
        
        return characters;
    }

    private static ArrayList<Item> createNewItemList() {

        ArrayList<Item> items = new ArrayList<>();
        
        items.add(new Item("Potion",7));
        items.add(new Item("Super Potion",5));
        items.add(new Item("Pokeball",6));
        items.add(new Item("Masterball",4));
        
        return items;
    }
    
    public static int totalItems(ArrayList<Item> items){
        
        
        Item itemsCount = new Item();
        
        int total = 0;
        for (Item item : items) { 
            int quantity = (int) item.getInventoryQuantity();
            total = total + quantity;
        }
        itemsCount.setInventoryQuantity(total);
       
        return total;
    }
            
    

    private static ArrayList<Pokemon> addPokemon() {
        
        //Create the arraylist
        ArrayList<Pokemon> pokemons = new ArrayList<>();
        
        //adding pokemon to the list
        Pokemon Pikachu = new Pokemon("Pikachu", 40, 25, 50, 1);
        pokemons.add(Pikachu);
        pokemons.add(new Pokemon("Rattata", 30, 20, 40, 1));
        pokemons.add(new Pokemon("Charizard", 50, 30, 70, 1));
        pokemons.add(new Pokemon("Spearow", 35, 15, 50, 1));
        pokemons.add(new Pokemon("Gyarados", 60, 20, 70, 1));
        pokemons.add(new Pokemon("Mewtwo", 70, 30, 100, 1));
        
        return pokemons;    }
    
    public static int countPokemon(ArrayList<Pokemon> pokemons) {
        
        Pokemon totalPokemon = new Pokemon();
        
        int total = 0;
        for (Pokemon pokemon: pokemons) {
            
            int quantity = (int) pokemon.getPokemonQuantity();
            total = total + quantity;
        }
        
        totalPokemon.setPokemonQuantity(total);
        
        return total;
        
    }
    
    public static void saveGame(Game game, String filePath)
                    throws GameControlException{
        
        try(FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(game);
        } catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
    }
    
        public static void getSavedGame(String filePath)
                    throws GameControlException{
        
        Game game = null;
            
        try(FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream input = new ObjectInputStream(fips);
            
            game = (Game) input.readObject();
            
        } catch(Exception ex){
            throw new GameControlException(ex.getMessage());
        }
        Pokémon.setCurrentGame(game);
    }
    
    public static void characterGetItem()
                    throws GameControlException{
        
        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
        
        Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
        
        Location location = locations[coordinates.x][coordinates.y];
        
        Item item = location.getItemInLocation().get(0);
       
        int itemIndex = mainCharacter.getItemsCollected().indexOf(item);
        
        if( itemIndex < 0){
            mainCharacter.getItemsCollected().add(item);
        }
        
        item.setCollectedInventoryQuantity(item.getCollectedInventoryQuantity() + 1);
        
    }
    public static void characterFindPokemon()
                    throws GameControlException{
        
        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
        
        Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
        
        Location location = locations[coordinates.x][coordinates.y];
        
        Pokemon pokemon = location.getPokemonInLocation().get(0);
       
        mainCharacter.getPokemonCaptured().add(pokemon);
    }
    
//function to find and return what is in the location
    public static Object getObjectInLocation(){
        Character mainCharacter = Pokémon.getCurrentGame().getPlayingCharacter();
        
        Point coordinates = Pokémon.getCurrentGame().getPlayingCharacter().getLocation();
        
        Location[][] locations = Pokémon.getCurrentGame().getMap().getLocations();
        
        Location location = locations[coordinates.x][coordinates.y]; 

        
        if(location.getPokemonInLocation().size() > 0){
            Pokemon pokemon = location.getPokemonInLocation().get(0);
            return pokemon;
        }
        
        else if(location.getItemInLocation().size() > 0){
            Item Item = location.getItemInLocation().get(0);
            return Item;
        }
        
        else{
            return null;
        }
    }
}
