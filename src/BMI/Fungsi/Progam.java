/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BMI.Fungsi;

import BMI.Operation.ModelProgam;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import BMI.Operation.ModelProgam;
import java.text.DecimalFormat;

/**
 *
 * @author Dhimas N A
 */

public class Progam extends ModelProgam {
    ModelProgam MP = new ModelProgam();
    
    public Boolean checkNama(String nama){
        Pattern pattern = Pattern.compile("^[a-zA-Z\\s-]+$");
        Matcher matcher = pattern.matcher(nama);
        return matcher.matches();
    }
    
    public Boolean checkUmur(String umur){
        Pattern pattern = Pattern.compile("^[1-9]?[0-9]{1}$|^100$");
        Matcher matcher = pattern.matcher(umur);
        return matcher.matches();
    }
    
    public String returnBMI(ModelProgam modelprogam){
        Operation op = new Operation();
        DecimalFormat format = new DecimalFormat("##,##");
        double hasil = op.op
    }
}
