/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citbyui.cit260.pokemonGame.exceptions;

/**
 *
 * @author jacegummersall
 */
public class DamageControlException extends Exception{

    public DamageControlException() {
    }

    public DamageControlException(String message) {
        super(message);
    }

    public DamageControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public DamageControlException(Throwable cause) {
        super(cause);
    }

    public DamageControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
