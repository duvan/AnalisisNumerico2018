/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.singularsys.jep.JepException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.nfunk.jep.JEP;

/**
 *
 * @author duvandariobarrientosbetancur
 */
public class FunctionEvaluator {

    private JEP parser;

    public FunctionEvaluator(String function) {
        this.parser = new JEP();
        this.parser.addStandardConstants();
        this.parser.addStandardFunctions();
        this.parser.setImplicitMul(true);
        try {
            this.parser.addVariable("x", 0.0D);
        } catch (JepException ex) {
            Logger.getLogger(FunctionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.parser.parseExpression(function);
    }

    public double evaluate(double value) {
        if (isValid(value)) {
            return this.parser.getValue();
        } else {
            return 0.0;
        }
    }

    public boolean isValid(double value) {
        try {
            this.parser.addVariable("x", value);
        } catch (JepException ex) {
            Logger.getLogger(FunctionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
        }
        return !this.parser.hasError();
    }

    public boolean isValid(String value) {
        try {
            this.parser.addVariable("x", Double.valueOf(value));
        } catch (Exception ex) {
            Logger.getLogger(FunctionEvaluator.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return !this.parser.hasError();
    }

}
