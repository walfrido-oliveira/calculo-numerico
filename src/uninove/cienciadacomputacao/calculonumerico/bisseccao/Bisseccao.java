
package uninove.cienciadacomputacao.calculonumerico.bisseccao;

import esperimentos.arvoredeexpressao.ExpressionNode;
import esperimentos.arvoredeexpressao.Parser;
import esperimentos.arvoredeexpressao.ParserException;


public class Bisseccao {
    
    private final String expression;
    private double a, b;
    private final double epson;
    
    public Bisseccao(String expression, double a, double b, double epson){
        this.expression = expression;
        this.a = a;
        this.b = b;
        this.epson = epson;
    }
    
    public double calculaBissecao(){
        double x;
        double fA;
        double fB = 0;
        double fX;
        
        try{
            do{
            
                x = (a+b)/2;
            
                Parser parser = new Parser();
           
                ExpressionNode expr = parser.parse(expression.replace("x", Double.toString(a)));
                fA = expr.getValue();
                
                expr = parser.parse(expression.replace("x", Double.toString(x)));
                fX = expr.getValue();
            
                if( (fA * fX) < 0 ){
                    b = x;
                }
                else {
                    a = x;
                }
            
            }while((Math.abs(a - b) / 2) < epson);
        }
        catch (ParserException e){
              System.out.println(e.getMessage());
        }
        
        x = (a+b)/2;
        return x;
    }
}
