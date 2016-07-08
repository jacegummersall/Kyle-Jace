/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.pokemonGame.view;

import java.io.PrintWriter;
import pokémon.Pokémon;

/**
 *
 * @author Thunder
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = Pokémon.getOutFile();
    private static final PrintWriter logFile = Pokémon.getLogFile();
    
    public static void display(String className, String errorMessage) {
        
        errorFile.println(
                "------------------------------------------------------------------"
                        + "\n-ERROR-" + errorMessage
            + "\n------------------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
    
}
