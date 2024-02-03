package sistemasop;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

public class barraProgress extends javax.swing.JFrame {

    public static Timer timer;
    
    public barraProgress() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        int delay = 300;
        timer = new Timer(delay, new ActionListener() {
            int crecimientoPorSegundo = 10;

            @Override
            public void actionPerformed(ActionEvent e) {
                // Incrementa el ancho del botón
                Dimension tamañoActual = bolitaButton.getSize();
                bolitaButton.setSize(new Dimension(tamañoActual.width + crecimientoPorSegundo, tamañoActual.height));

                // Detén el temporizador después de alcanzar cierto tamaño
                if (tamañoActual.width >= 100) {
                    timer.stop();
                }
            }
        });

        // Inicia el temporizador
        timer.start();

        pack();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraProgresoPanel = new javax.swing.JPanel();
        bolitaButton = new sistemasop.myButton();
        containerButton = new sistemasop.myButton();
        progresButton = new sistemasop.myButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        barraProgresoPanel.setBackground(new java.awt.Color(36, 39, 46));
        barraProgresoPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bolitaButton.setBackground(new java.awt.Color(204, 204, 255));
        bolitaButton.setForeground(new java.awt.Color(36, 39, 46));
        bolitaButton.setBorderColor(new java.awt.Color(36, 39, 46));
        bolitaButton.setBorderPainted(false);
        bolitaButton.setColor(new java.awt.Color(204, 204, 255));
        bolitaButton.setColorClick(new java.awt.Color(204, 204, 255));
        bolitaButton.setColorOver(new java.awt.Color(204, 204, 255));
        bolitaButton.setFocusPainted(false);
        bolitaButton.setFocusable(false);
        bolitaButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        bolitaButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        bolitaButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        bolitaButton.setRadius(5);
        bolitaButton.setRequestFocusEnabled(false);
        bolitaButton.setRolloverEnabled(false);
        bolitaButton.setVerifyInputWhenFocusTarget(false);
        bolitaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bolitaButtonActionPerformed(evt);
            }
        });
        barraProgresoPanel.add(bolitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(339, 175, 10, 10));

        containerButton.setBackground(new java.awt.Color(36, 39, 46));
        containerButton.setForeground(new java.awt.Color(36, 39, 46));
        containerButton.setBorderColor(new java.awt.Color(36, 39, 46));
        containerButton.setBorderPainted(false);
        containerButton.setColor(new java.awt.Color(36, 39, 46));
        containerButton.setColorClick(new java.awt.Color(36, 39, 46));
        containerButton.setColorOver(new java.awt.Color(36, 39, 46));
        containerButton.setFocusPainted(false);
        containerButton.setFocusable(false);
        containerButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        containerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        containerButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        containerButton.setRadius(15);
        containerButton.setRequestFocusEnabled(false);
        containerButton.setRolloverEnabled(false);
        containerButton.setVerifyInputWhenFocusTarget(false);
        containerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                containerButtonActionPerformed(evt);
            }
        });
        barraProgresoPanel.add(containerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(334, 170, 120, 20));
        containerButton.getAccessibleContext().setAccessibleParent(progresButton);

        progresButton.setBackground(new java.awt.Color(204, 204, 255));
        progresButton.setForeground(new java.awt.Color(36, 39, 46));
        progresButton.setBorderColor(new java.awt.Color(204, 204, 255));
        progresButton.setBorderPainted(false);
        progresButton.setColor(new java.awt.Color(204, 204, 255));
        progresButton.setColorClick(new java.awt.Color(153, 153, 255));
        progresButton.setColorOver(new java.awt.Color(153, 153, 255));
        progresButton.setFocusPainted(false);
        progresButton.setFocusable(false);
        progresButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        progresButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        progresButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        progresButton.setRadius(15);
        progresButton.setRequestFocusEnabled(false);
        progresButton.setRolloverEnabled(false);
        progresButton.setVerifyInputWhenFocusTarget(false);
        progresButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                progresButtonActionPerformed(evt);
            }
        });
        barraProgresoPanel.add(progresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 150, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barraProgresoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 471, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(barraProgresoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void progresButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_progresButtonActionPerformed

    }//GEN-LAST:event_progresButtonActionPerformed

    private void containerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_containerButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_containerButtonActionPerformed

    private void bolitaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bolitaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bolitaButtonActionPerformed

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(barraProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(barraProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(barraProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(barraProgress.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new barraProgress().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel barraProgresoPanel;
    private sistemasop.myButton bolitaButton;
    private sistemasop.myButton containerButton;
    private sistemasop.myButton progresButton;
    // End of variables declaration//GEN-END:variables
}
