/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uninove.cienciadacomputacao.calculonumerico.ajustedereta;


/**
 *
 * @author Supervisor
 */
public class TelaAjusteDeReta extends javax.swing.JFrame {

    /**
     * Creates new form TelaAjusteDeReta
     */
    public TelaAjusteDeReta() {
        initComponents();
        
        this.getContentPane().setBackground(new java.awt.Color(255, 255, 255));
        lblResultado.setVisible(false);
        lblResultado1.setVisible(false);
        txtIntervaloX.setSelectionStart(0);
        txtIntervaloX.setSelectionEnd(txtIntervaloX.getText().length());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        txtIntervaloX = new javax.swing.JTextField();
        txtIntervaloY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajustar dados de um experimento por uma reta de regressão");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        txtIntervaloX.setText("Entre com os intervalos de x separados por vírgula");
        getContentPane().add(txtIntervaloX, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 258, -1));
        getContentPane().add(txtIntervaloY, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 258, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Y");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 170, 110, -1));

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 102, 153));
        lblResultado.setText("jLabel8");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        lblResultado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado1.setForeground(new java.awt.Color(0, 102, 153));
        lblResultado1.setText("jLabel8");
        getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajusteDeRetaB.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ajusteDeretaA.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        double intervaloX[];
        double intervaloY[];
        String intervalotXS[];
        String intervalotYS[];
        int xIntervalor = 0;
        int yIntervalor = 0;
         
        try{
            
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
            
            AjusteReta ajuste = new AjusteReta(intervaloX,intervaloY);
            double ab[] = ajuste.AjustarReta();
                                 
                        
            lblResultado.setVisible(true);
            lblResultado1.setVisible(true);
            lblResultado.setText("a = " + ab[0]);
            lblResultado1.setText("b =  " + ab[1]);
            
        }catch(java.lang.NumberFormatException ex){
            lblResultado.setVisible(true);
            lblResultado1.setText("");
            lblResultado.setText("<html>Preencha os campos de forma correta!</html>");
        }catch(Exception ex){
            lblResultado.setVisible(true);
            lblResultado1.setText("");
            lblResultado.setText("<html>Preencha os campos de forma correta!</html>");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField txtIntervaloX;
    private javax.swing.JTextField txtIntervaloY;
    // End of variables declaration//GEN-END:variables
}
