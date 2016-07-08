/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pokemonGame.exceptions;

/**
 *
 * @author Thunder
 */
public class PokeballControlException extends Exception{

    public PokeballControlException() {
    }

    public PokeballControlException(String message) {
        super(message);
    }

    public PokeballControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PokeballControlException(Throwable cause) {
        super(cause);
    }

    public PokeballControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
