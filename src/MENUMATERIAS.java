/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aleji
 */
public class MENUMATERIAS extends javax.swing.JFrame {

    /**
     * Creates new form MENUMATERIAS
     */
    public MENUMATERIAS() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextPane2 = new javax.swing.JTextPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextPane3 = new javax.swing.JTextPane();
        btnatrasmenumaterias = new javax.swing.JButton();
        btncasamenumaterias = new javax.swing.JButton();
        btnfisica = new javax.swing.JButton();
        btnmatematicas = new javax.swing.JButton();
        btnquimica = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 50)); // NOI18N
        jLabel2.setText("¿QUE DESEA VER?");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(170, 30, 510, 70);

        jLabel3.setFont(new java.awt.Font("SimSun-ExtB", 1, 48)); // NOI18N
        jLabel3.setText("QUIMICA");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 160, 200, 50);

        jLabel4.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        jLabel4.setText("FISICA");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(650, 160, 180, 60);

        jLabel5.setFont(new java.awt.Font("SimSun", 1, 48)); // NOI18N
        jLabel5.setText("MATEMATICAS");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(290, 160, 297, 60);
        jPanel1.add(jSeparator1);
        jSeparator1.setBounds(560, 320, 0, 2);

        jTextPane1.setText("Se explica la relacion de la energía calorífica con la energía mecánica y  con ello se muestra la mejor rutina de ejercicios para ti");
        jScrollPane2.setViewportView(jTextPane1);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(620, 220, 200, 70);

        jTextPane2.setBorder(null);
        jTextPane2.setText("Clasificación de los carbohidratos y algunas recomendaciones");
        jScrollPane3.setViewportView(jTextPane2);

        jPanel1.add(jScrollPane3);
        jScrollPane3.setBounds(40, 220, 170, 40);

        jTextPane3.setText("Se comparte un link de una encuesta hecha para el area sobre la comida saludable y el medio ambiente");
        jScrollPane4.setViewportView(jTextPane3);

        jPanel1.add(jScrollPane4);
        jScrollPane4.setBounds(300, 220, 270, 50);

        btnatrasmenumaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/atras.png"))); // NOI18N
        btnatrasmenumaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasmenumateriasActionPerformed(evt);
            }
        });
        jPanel1.add(btnatrasmenumaterias);
        btnatrasmenumaterias.setBounds(0, 440, 60, 50);

        btncasamenumaterias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/casa (1).png"))); // NOI18N
        btncasamenumaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncasamenumateriasActionPerformed(evt);
            }
        });
        jPanel1.add(btncasamenumaterias);
        btncasamenumaterias.setBounds(790, 430, 70, 60);

        btnfisica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/atomo (1).png"))); // NOI18N
        btnfisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfisicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnfisica);
        btnfisica.setBounds(680, 320, 73, 70);

        btnmatematicas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/matematicas.png"))); // NOI18N
        btnmatematicas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmatematicasActionPerformed(evt);
            }
        });
        jPanel1.add(btnmatematicas);
        btnmatematicas.setBounds(390, 310, 90, 80);

        btnquimica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/quimica.png"))); // NOI18N
        btnquimica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquimicaActionPerformed(evt);
            }
        });
        jPanel1.add(btnquimica);
        btnquimica.setBounds(80, 270, 90, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/97cbeecffb8afd1f5a429fef66dd4854_37499.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 870, 140);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/conjunto-cristaleria-laboratorio-sobre-fondo-neon-azul-ilustracion-renderizado-3d_170280-236.jpg"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 150, 220, 340);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/e9bf3de55303c66fa3a1b0b54ce12ade_opt.png"))); // NOI18N
        jPanel1.add(jLabel7);
        jLabel7.setBounds(290, 150, 310, 340);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/fisicc.jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(610, 150, 230, 340);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 870, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnatrasmenumateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasmenumateriasActionPerformed
         IMC abrir=new IMC ();
       abrir.setVisible (true);
       this.setVisible (false);
    }//GEN-LAST:event_btnatrasmenumateriasActionPerformed

    private void btnquimicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquimicaActionPerformed
       QUIMIC abrir=new QUIMIC();
       abrir.setVisible (true);
       this.setVisible (false);
    }//GEN-LAST:event_btnquimicaActionPerformed

    private void btnmatematicasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmatematicasActionPerformed
       MATEMATICAS abrir=new MATEMATICAS();
       abrir.setVisible (true);
       this.setVisible (false);
    }//GEN-LAST:event_btnmatematicasActionPerformed

    private void btnfisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfisicaActionPerformed
       FISICA abrir=new FISICA ();
       abrir.setVisible (true);
       this.setVisible (false);
    }//GEN-LAST:event_btnfisicaActionPerformed

    private void btncasamenumateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncasamenumateriasActionPerformed
        NUTRICIONMENTESANA abrir=new   NUTRICIONMENTESANA();
       abrir.setVisible (true);
       this.setVisible (false);
    }//GEN-LAST:event_btncasamenumateriasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MENUMATERIAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MENUMATERIAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MENUMATERIAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MENUMATERIAS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MENUMATERIAS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnatrasmenumaterias;
    private javax.swing.JButton btncasamenumaterias;
    private javax.swing.JButton btnfisica;
    private javax.swing.JButton btnmatematicas;
    private javax.swing.JButton btnquimica;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextPane jTextPane2;
    private javax.swing.JTextPane jTextPane3;
    // End of variables declaration//GEN-END:variables
}
