package uninove.cienciadacomputacao.calculonumerico.coeficientedepearson;

import java.awt.HeadlessException;

/**
 *
 * @author Supervisor
 */
public class TelaCoeficienteDePearson extends javax.swing.JFrame {

    /**
     * Creates new form TelaCoeficienteDePearson
     */
    public TelaCoeficienteDePearson() {
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

        lblFormula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIntervaloX = new javax.swing.JTextField();
        txtIntervaloY = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblResultado = new javax.swing.JLabel();
        lblResultado1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Coeficiente de correlação de Pearson");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblFormula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/formulaCorrelacaoPearson.png"))); // NOI18N
        getContentPane().add(lblFormula, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/p=1.png"))); // NOI18N
        jLabel1.setText(" Significa uma correlação perfeita possitiva entre duas variáveis.");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/p=-1.png"))); // NOI18N
        jLabel2.setText("Significa uma correlação negativa perfeita entre as duas variáveis - isto é, se uma aumenta, a outra sempre diminui.");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/p=0.png"))); // NOI18N
        jLabel3.setText(" Significa que as duas variáveis não dependem linearmente uma da outra.");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/xMedia.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/yMedia.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 244, -1, -1));

        txtIntervaloX.setText("Entre com os intervalos de x separados por vírgula");
        getContentPane().add(txtIntervaloX, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 244, 258, -1));
        getContentPane().add(txtIntervaloY, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 244, 258, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Y");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 244, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/calc.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 100, -1));

        lblResultado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado.setForeground(new java.awt.Color(0, 102, 153));
        lblResultado.setText("jLabel8");
        getContentPane().add(lblResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        lblResultado1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblResultado1.setForeground(new java.awt.Color(0, 102, 153));
        lblResultado1.setText("jLabel8");
        getContentPane().add(lblResultado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

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
            
            CoeficientePearson coe = new CoeficientePearson(intervaloX,intervaloY);
            double r = coe.CalculoCoeficientePearson();
            String corelacao = "";
        
            //verifica a correlação
            if(r == 1){
                corelacao = "<u>perfeita positiva</u></html>";
            }else if(r >= 0.8 && r < 1){
                corelacao = "<u>forte positiva</u></u></html>";
            }else if(r >= 0.5 && r < 0.8){
                corelacao = "<u>moderada positiva</u></html>";
            }else if(r >= 0.1 && r < 0.5){
                corelacao = "<u>fraca positiva</u></html>";
            }else if(r > 0 && r < 0.1){
                corelacao = "<u>ínfima positiva</u></html>";
            }else if(r == 0){
                corelacao = "<u>nula</u></html>";
            }else if(r > -0.1 && r < 0){
                corelacao = "<u>ínfima negativa</u></html>";
            }else if(r > -0.5 && r <= -0.1){
                corelacao = "<u>fraca negativa</u></html>";
            }else if(r > -0.8 && r <= -0.5){
                corelacao = "<u>moderada negativa</u></html>";
            }else if(r > -1 && r <= -0.8){
                corelacao = "<u>forte negativa</u></html>";
            }else if(r == -1){
                corelacao = "<u>perfeita negativa</u></html>";
            }
            
            
            
            lblResultado.setVisible(true);
            lblResultado1.setVisible(true);
            lblResultado.setText("ρ = " + r);
            lblResultado1.setText("<html>A correlação entre as variáveis é " + corelacao);
            
        }catch(java.lang.NumberFormatException | HeadlessException ex){
            lblResultado.setVisible(true);
            lblResultado1.setText("");
            lblResultado.setText("<html>Preencha os campos de forma correta!</html>");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblFormula;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblResultado1;
    private javax.swing.JTextField txtIntervaloX;
    private javax.swing.JTextField txtIntervaloY;
    // End of variables declaration//GEN-END:variables
}
