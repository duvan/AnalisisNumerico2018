/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.event.KeyEvent;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class NumberInputValidator {

    public static void validate(KeyEvent e) {
        char input = e.getKeyChar();
        if ((input < '0' || input > '9')
                && (input != '.') && (input != '-')
                && (input != KeyEvent.VK_BACK_SPACE)) {
            e.consume();
        }
    }
}
