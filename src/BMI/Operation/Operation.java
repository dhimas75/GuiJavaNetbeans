/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI.Operation;

/**
 *
 * @author Dhimas N A
 */
public class Operation extends ModelProgam {
    public double operation (double a, double b){
        return a/Math.pow(b/100, 2);
    }
    
    public double operation (ModelProgam modelprogam, double berat, double tinggi){
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
