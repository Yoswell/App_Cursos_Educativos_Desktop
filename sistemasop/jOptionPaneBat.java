package sistemasop;

import javax.swing.ImageIcon;

public class jOptionPaneBat extends javax.swing.JFrame {

    public static String mensaje, etiqueta;
    
    public jOptionPaneBat(String mensaje, String etiqueta) {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/Cancel_40972.png")).getImage());
        this.setLocationRelativeTo(this);
        etiquetaLabel.setText(etiqueta);
        mensajeLabel.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cerrarButton = new sistemasop.myButton();
        etiquetaLabel = new javax.swing.JLabel();
        mensajeLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(36, 39, 46));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(52, 53, 65)));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarButton.setBackground(new java.awt.Color(255, 204, 204));
        cerrarButton.setForeground(new java.awt.Color(36, 39, 46));
        cerrarButton.setText("Ok");
        cerrarButton.setBorderColor(new java.awt.Color(52, 53, 65));
        cerrarButton.setBorderPainted(false);
        cerrarButton.setColor(new java.awt.Color(255, 204, 204));
        cerrarButton.setColorClick(new java.awt.Color(255, 153, 153));
        cerrarButton.setColorOver(new java.awt.Color(255, 153, 153));
        cerrarButton.setFocusPainted(false);
        cerrarButton.setFocusable(false);
        cerrarButton.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        cerrarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cerrarButton.setIconTextGap(0);
        cerrarButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        cerrarButton.setRadius(15);
        cerrarButton.setRequestFocusEnabled(false);
        cerrarButton.setRolloverEnabled(false);
        cerrarButton.setVerifyInputWhenFocusTarget(false);
        cerrarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarButtonActionPerformed(evt);
            }
        });
        jPanel1.add(cerrarButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 60, 30));

        etiquetaLabel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        etiquetaLabel.setForeground(new java.awt.Color(204, 204, 204));
        etiquetaLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        etiquetaLabel.setText("Mensaje");
        etiquetaLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(153, 153, 153)));
        jPanel1.add(etiquetaLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 380, 20));

        mensajeLabel.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        mensajeLabel.setForeground(new java.awt.Color(204, 204, 204));
        mensajeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mensajeLabel.setText("Mensaje");
        jPanel1.add(mensajeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 140));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarButtonActionPerformed
        dispose();
    }//GEN-LAST:event_cerrarButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jOptionPaneBat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jOptionPaneBat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jOptionPaneBat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jOptionPaneBat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jOptionPaneBat(mensaje, etiqueta).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemasop.myButton cerrarButton;
    private javax.swing.JLabel etiquetaLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeLabel;
    // End of variables declaration//GEN-END:variables
}
