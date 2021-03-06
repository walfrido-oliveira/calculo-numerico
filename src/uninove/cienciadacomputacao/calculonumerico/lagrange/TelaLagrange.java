/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uninove.cienciadacomputacao.calculonumerico.lagrange;


/**
 *
 * @author Supervisor
 */
public class TelaLagrange extends javax.swing.JFrame {

    /**
     * Creates new form TelaLagrange
     */
    public TelaLagrange() {
        initComponents();
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIntervaloX = new javax.swing.JTextField();
        txtIntervaloY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCalc = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtInterpolado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Fórmula de Lagrange");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Lagrange.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(184, 11, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        txtIntervaloX.setText("Entre com os intervalos de x separados por vírgula");
        getContentPane().add(txtIntervaloX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 258, -1));
        getContentPane().add(txtIntervaloY, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 90, 258, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Y");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.png"))); // NOI18N
        btnCalc.setContentAreaFilled(false);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnCalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 110, -1));

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 102, 153));
        lblResultado.setText("jLabel8");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Valor a ser Interpolado");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, -1, -1));
        getContentPane().add(txtInterpolado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 140, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
        // TODO add your handling code here:

       
        try{
            
             double intervaloX[];
             double intervaloY[];
             double interpolado = Double.parseDouble(txtInterpolado.getText());
             String intervalotXS[];
             String intervalotYS[];
             int xIntervalor = 0;
             int yIntervalor = 0;
         
            
             ////////// X //////////////
            for(int x = 0; x < txtIntervaloX.getText().length(); x++){
                if(txtIntervaloX.getText().charAt(x) == ','){
                    xIntervalor++;
                }
            }
            xIntervalor++;
            
            intervalotXS = txtIntervaloX.getText().split(",");
        
            intervaloX = new double[xIntervalor];    
          
            //obtendo valores de x
            for(int x = 0; x < intervalotXS.length; x++){
                intervaloX[x] = Double.parseDouble(intervalotXS[x]);
            }
          
            /////////  Y ///////////////
             for(int x = 0; x < txtIntervaloY.getText().length(); x++){
                if(txtIntervaloY.getText().charAt(x) == ','){
                    yIntervalor++;
                }
            }         
            yIntervalor++;
             
            intervalotYS = txtIntervaloY.getText().split(",");
        
            intervaloY =  new double[yIntervalor];
               
            //obtendo valores de y
            for(int x = 0; x < intervalotYS.length; x++){
                intervaloY[x] = Double.parseDouble(intervalotYS[x]);
            }
            
            Lagrange ajuste = new Lagrange();
            interpolado= ajuste.CalculoLagrande(intervaloX, intervaloY, interpolado);
                                 
                        
            lblResultado.setVisible(true);
            lblResultado.setText("f(" + txtInterpolado.getText() + ") = " + Double.toString(interpolado));
                        
        }catch(java.lang.NumberFormatException ex){
            lblResultado.setVisible(true);
            lblResultado.setText("<html>Preencha os campos de forma correta!</html>");
        }catch(Exception ex){
            lblResultado.setVisible(true);
            lblResultado.setText("<html>Preencha os campos de forma correta!</html>");
        }
    }//GEN-LAST:event_btnCalcActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JTextField txtInterpolado;
    private javax.swing.JTextField txtIntervaloX;
    private javax.swing.JTextField txtIntervaloY;
    // End of variables declaration//GEN-END:variables
}
