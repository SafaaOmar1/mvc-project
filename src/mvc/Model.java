/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

/**
 *
 * @author safaa
 */
public class Model {

   
    double r;

    Model() {

    }
    
    
    public boolean validate(String exp){
        
        return false;
    }
    
    public double Calc(double f, double s) {
        return f + s;

    }

    double Calc(double p1, double p2, String op) {
        if(op.equals("+")) {
            return p1+p2;
        }
            else if(op.equals("-")) {
            return p1-p2;
        
        }
        else if(op.equals("*")) {
            return p1*p2;
        }
          else if(op.equals("/")) {
              
            
                      return p1/p2;
        }
        
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean validate(String op, double p1, double p2) {
        
       
       
       
           if(op.equals("/")) {
              
              if(p2==0.0) return false;
                     
        }
        
        return true;
    }
    
    
        
         //To change body of generated methods, choose Tools | Templates.
    
}
