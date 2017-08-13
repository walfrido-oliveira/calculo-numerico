package uninove.ciencieadacomputacao.calculonumerico.coeficientedepearson;

import javax.swing.JOptionPane;

public class CoeficientePearson {
    
    private double[] intervaloX;
    private double[] intervaloY;

    /**
     * 
     */
    public CoeficientePearson() {
    }

    /**
     * 
     * @param intervaloX
     * @param intervaloY 
     */
    public CoeficientePearson(double[] intervaloX, double[] intervaloY) {
        this.intervaloX = intervaloX;
        this.intervaloY = intervaloY;
    }
    
    
    /**
     * 
     * @return coefiente de pearson r >= -1 e r <= 1
     */
    public double CalculoCoeficientePearson(){
        int xLength = this.intervaloX.length;
        int yLength = this.intervaloY.length;
        double somaCima = 0;
        double somaBaixo_01 = 0;
        double somaBaixo_02 = 0;
        double somaBaixoFinal;
        int x;
        
        
        //xMedia
        double xMedia;
        for(x = 0; x < xLength; x++){
            somaCima += this.intervaloX[x];
        }
        xMedia = somaCima / xLength;
        somaCima = 0;
        
        //yMedia
        double yMedia;
        for(x = 0; x < yLength; x++){
            somaBaixo_01 += this.intervaloY[x];
        }
        yMedia = somaBaixo_01 / yLength;
        somaBaixo_01 = 0;
        
        // somatório (xi - xMedia)(yi - yMedia)
        for(x = 0; x < xLength; x++){
            somaCima += (intervaloX[x] - xMedia)*(intervaloY[x] - yMedia);
        }
        
        //se der zero
        if(somaCima == 0) {
            return 0;
        }
               
        //Somatório (xi - xMedia) ^2
        for(x = 0; x < yLength; x++){
            somaBaixo_01 += Math.pow((intervaloX[x] - xMedia),2);
        }
        
        //Somatótio (yi - yMedia) ^2
        for(x = 0; x < yLength; x++){
            somaBaixo_02 += Math.pow((intervaloY[x] - yMedia),2);
        }
        
        //se der zero
        if(somaBaixo_01 * somaBaixo_02 == 0) {
            return 0;
        }
                
        //Raiz quadra do somátio (xi - xMedia) ^2
        somaBaixo_01 = Math.sqrt(somaBaixo_01);
        
        //Raiz quadra do somatório (xi - xMedia) ^2
        somaBaixo_02 = Math.sqrt(somaBaixo_02);
        
        //somátio (xi - xMedia) ^2 * somatório (xi - xMedia) ^2
        somaBaixoFinal = somaBaixo_01 * somaBaixo_02;
                
        return somaCima / somaBaixoFinal;
    }
    
    /**
     * 
     * @param intervaloX
     * @param intervaloY
     * @return coefiente de pearson r >= -1 e r <= 1
     */
    public double CalculoCoeficientePearson(double[] intervaloX, double[] intervaloY){
            int xLength = this.intervaloX.length;
        int yLength = this.intervaloY.length;
        double somaCima = 0;
        double somaBaixo_01 = 0;
        double somaBaixo_02 = 0;
        double somaBaixoFinal;
        int x;
        
        
        //xMedia
        double xMedia;
        for(x = 0; x < xLength; x++){
            somaCima += this.intervaloX[x];
        }
        xMedia = somaCima / xLength;
        somaCima = 0;
        
        //yMedia
        double yMedia;
        for(x = 0; x < yLength; x++){
            somaBaixo_01 += this.intervaloY[x];
        }
        yMedia = somaBaixo_01 / yLength;
        somaBaixo_01 = 0;
        
        // somatório (xi - xMedia)(yi - yMedia)
        for(x = 0; x < xLength; x++){
            somaCima += (intervaloX[x] - xMedia)*(intervaloY[x] - yMedia);
        }
        
        //se der zero
        if(somaCima == 0) {
            return 0;
        }
               
        //Somatório (xi - xMedia) ^2
        for(x = 0; x < yLength; x++){
            somaBaixo_01 += Math.pow((intervaloX[x] - xMedia),2);
        }
        
        //Somatótio (yi - yMedia) ^2
        for(x = 0; x < yLength; x++){
            somaBaixo_02 += Math.pow((intervaloY[x] - yMedia),2);
        }
        
        //se der zero
        if(somaBaixo_01 * somaBaixo_02 == 0) {
            return 0;
        }
                
        //Raiz quadra do somátio (xi - xMedia) ^2
        somaBaixo_01 = Math.sqrt(somaBaixo_01);
        
        //Raiz quadra do somatório (xi - xMedia) ^2
        somaBaixo_02 = Math.sqrt(somaBaixo_02);
        
        //somátio (xi - xMedia) ^2 * somatório (xi - xMedia) ^2
        somaBaixoFinal = somaBaixo_01 * somaBaixo_02;
                
        return somaCima / somaBaixoFinal;
    }

    public double[] getIntervaloX() {
        return intervaloX;
    }

    public double[] getIntervaloY() {
        return intervaloY;
    }

    public void setIntervaloX(double[] intervaloX) {
        this.intervaloX = intervaloX;
    }

    public void setIntervaloY(double[] intervaloY) {
        this.intervaloY = intervaloY;
    }
    
    
    
    
    
    
    
}