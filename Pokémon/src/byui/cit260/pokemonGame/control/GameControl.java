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
import byui.cit260.pokemonGame.model.Map;
import byui.cit260.pokemonGame.model.Pokemon;
import citbyui.cit260.pokemonGame.exceptions.MapControlException;
import java.util.ArrayList;

/**
 *
 * @author Thunder
 */
public class GameControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null) {
            return null;
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
    }

    public static void loadExistingGame(Player player) {
        System.out.println("\n*** loadExistingGame stub function called ***");
    }
    
        
    private static Character[] createCharacterList(){
        
        Character[] characters = new Character[ListConstants.NUMBER_OF_CHARACTERS];
        
        Character gamePlayer = new Character(Pokémon.getPlayer().getName(),"Pokémon Trainer");
        characters[ListConstants.mainCharacterIndex] = gamePlayer;
        
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
    
    
    
   
}
