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
public class PotionControlException extends Exception{

    public PotionControlException() {
    }

    public PotionControlException(String message) {
        super(message);
    }

    public PotionControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public PotionControlException(Throwable cause) {
        super(cause);
    }

    public PotionControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
