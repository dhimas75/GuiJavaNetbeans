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
public class ModelProgam {
    
    public int BMI;
    
      public void setBMI(int BMI){
          this.BMI = BMI;
      }
      
      private int getBMI(){
          return BMI;
      }
      
    public int tips;
      
      public void setTips(int tips){
          this.tips = tips;
      }
      
      public int getTips(){
          return tips;
      }
      
    public double berat;
    
      public void setBerat(double berat){
          this.berat = berat;
      }
      
    public double getBerat(){
          return berat;
      }
    
    public double operation(double a, double b){
          return a / (b / 100);
    }
}
