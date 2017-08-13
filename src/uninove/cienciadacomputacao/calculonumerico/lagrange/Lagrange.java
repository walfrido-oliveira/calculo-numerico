
package uninove.cienciadacomputacao.calculonumerico.lagrange;


public class Lagrange {
    
    public double CalculoLagrande(double x[], double f[], double x_){
        
        int length = x.length;
        double r   = 0;
        double c;
        double d;
        
        for(int k = 0; k < length; k++){
            c = 1;
            d = 1;
            for(int j = 0; j < length; j++){
                if(k != j){
                    c = c * (x_ - x[j]);
                    d = d * (x[k] - x[j]);
                }
            }
            r += f[k] * c / d;
        }
        return r;
    }
}
