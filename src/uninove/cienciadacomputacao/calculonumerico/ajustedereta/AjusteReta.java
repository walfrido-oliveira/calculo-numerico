/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uninove.cienciadacomputacao.calculonumerico.ajustedereta;

import javax.swing.JOptionPane;

/**
 *
 * @author Supervisor
 */
public class AjusteReta {
    
    private double x[];
    private double f[];
    
    public AjusteReta(double[] x, double[] f) {
        this.x = x;
        this.f = f;
    }

    public AjusteReta() {
    }

    public double[] getX() {
        return x;
    }

    public double[] getF() {
        return f;
    }
  
    public double[] AjustarReta(){
        
        double ab[] = new double[2];
        int m = x.length;
        
        double somaX = 0;
        double somaY = 0;
        double somaX2 = 0;
        double somaXY = 0;
        
        for(int k = 0; k < m; k++){
            somaX  += x[k];
            somaY  += f[k];
            somaX2 += x[k] * x[k];
            somaXY += x[k] * f[k];
        }
               
        ab[0] = (somaX * somaXY) - (somaX2 * somaY) / ((somaX * somaX) - (m * somaX2));
        ab[1] = ((somaX * somaY) - (m * somaXY)) / ((somaX * somaX) - (m * somaX2));
        return ab;
    }
    
    public double[] AjustarReta(double[] x, double[] f){
        
        double ab[] = new double[2];
        int m = x.length - 1;
        
        double somaX = 0;
        double somaY = 0;
        double somaX2 = 0;
        double somaXY = 0;
        
        for(int k = 0; k <= m; k++){
            somaX  += x[k];
            somaY  += f[k];
            somaX2 += x[k] * x[k];
            somaXY += x[k] * f[k];
        }
        
        ab[0] = (somaX * somaXY - somaX2 * somaY) / ((somaX) * (somaX) - m * somaX2);
        ab[1] = (somaX * somaY - m * somaXY) / ((somaX) * (somaX) - m * somaX2);
        return ab;
    }
}
