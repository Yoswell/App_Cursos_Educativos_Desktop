package sistemasop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import static sistemasop.barraProgress.timer;

public class InterfaceEstudents extends javax.swing.JFrame {
    
    public static String url;
    
    DefaultTableModel modeloT1 = new DefaultTableModel();
    Metodos metodos = new Metodos();
    public boolean existe_estudiante_db = false;
    
    public InterfaceEstudents() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/nubeZ(1).png")).getImage());
        this.setLocationRelativeTo(this);
        personalizarTablaDatos(jTableDatos1, scrollEstudiante1, modeloT1);
        personalizarHeaderTabla(jTableDatos1);
        
        TablaBar tab = new TablaBar();
        tab.personalizarBarraDesplazamiento(scrollEstudiante1);
        
        progresButton.setVisible(false);
        barraButton.setVisible(false);
        bolitaButton.setVisible(false);
    }

    public void personalizarTablaDatos(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(36,39,46));
        modelo.addColumn("  Nombre");
        modelo.addColumn("  Primer Apellido");
        modelo.addColumn("  Segundo Apellido");
        modelo.addColumn("  Fecha de Nacimiento");
        modelo.addColumn("  Correo");
        modelo.addColumn("  Teléfono");
        modelo.addColumn("  Contraseña");
        modelo.addColumn("  Cursos");
        modelo.addColumn("  Cédula");
        table.setModel(modelo);
    }
    
    public void personalizarHeaderTabla(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(52,53,65));
        header.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
        header.setForeground(new Color(153,153,153));
        Dimension headerDimension = header.getPreferredSize();
        headerDimension.height = 30;
        header.setPreferredSize(headerDimension);
        header.setDefaultRenderer(new headerGrid());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buscarEstudiantePanel = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        scrollEstudiante1 = new javax.swing.JScrollPane();
        jTableDatos1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel45 = new javax.swing.JPanel();
        nombreEstudianteBuscarTField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        cedulaEstudianteEliminarTField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        bolitaButton = new sistemasop.myButton();
        barraButton = new sistemasop.myButton();
        progresButton = new sistemasop.myButton();
        buscarEstudianteButton = new sistemasop.myButton();
        eliminarEstudianteButton = new sistemasop.myButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buscarEstudiantePanel.setBackground(new java.awt.Color(36, 39, 46));

        jPanel5.setBackground(new java.awt.Color(52, 53, 65));

        scrollEstudiante1.setBackground(new java.awt.Color(36, 39, 46));
        scrollEstudiante1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        scrollEstudiante1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollEstudiante1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTableDatos1.setBackground(new java.awt.Color(52, 53, 65));
        jTableDatos1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jTableDatos1.setForeground(new java.awt.Color(153, 153, 153));
        jTableDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableDatos1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableDatos1.setColumnSelectionAllowed(true);
        jTableDatos1.setFocusable(false);
        jTableDatos1.setGridColor(new java.awt.Color(36, 39, 46));
        jTableDatos1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableDatos1.setOpaque(false);
        jTableDatos1.setRequestFocusEnabled(false);
        jTableDatos1.setRowHeight(30);
        jTableDatos1.setSelectionBackground(new java.awt.Color(74, 76, 89));
        jTableDatos1.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTableDatos1.setShowGrid(true);
        jTableDatos1.setVerifyInputWhenFocusTarget(false);
        scrollEstudiante1.setViewportView(jTableDatos1);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEstudiante1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEstudiante1, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(36, 39, 46));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Nombre del estudiante");

        jPanel45.setBackground(new java.awt.Color(36, 39, 46));
        jPanel45.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel45.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstudianteBuscarTField1.setBackground(new java.awt.Color(36, 39, 46));
        nombreEstudianteBuscarTField1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        nombreEstudianteBuscarTField1.setForeground(new java.awt.Color(204, 204, 204));
        nombreEstudianteBuscarTField1.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEstudianteBuscarTField1.setBorder(null);
        nombreEstudianteBuscarTField1.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreEstudianteBuscarTField1.setOpaque(true);
        jPanel45.add(nombreEstudianteBuscarTField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 490, 20));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Eliminar estudiante (Cedula)");

        jPanel47.setBackground(new java.awt.Color(36, 39, 46));
        jPanel47.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudianteEliminarTField.setBackground(new java.awt.Color(36, 39, 46));
        cedulaEstudianteEliminarTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        cedulaEstudianteEliminarTField.setForeground(new java.awt.Color(204, 204, 204));
        cedulaEstudianteEliminarTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaEstudianteEliminarTField.setBorder(null);
        cedulaEstudianteEliminarTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaEstudianteEliminarTField.setOpaque(true);
        jPanel47.add(cedulaEstudianteEliminarTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 490, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel47, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel45, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel45, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(36, 39, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bolitaButton.setBackground(new java.awt.Color(204, 204, 255));
        bolitaButton.setForeground(new java.awt.Color(204, 204, 255));
        bolitaButton.setBorderColor(new java.awt.Color(204, 204, 255));
        bolitaButton.setBorderPainted(false);
        bolitaButton.setColor(new java.awt.Color(204, 204, 255));
        bolitaButton.setColorClick(new java.awt.Color(204, 204, 255));
        bolitaButton.setColorOver(new java.awt.Color(204, 204, 255));
        bolitaButton.setFocusPainted(false);
        bolitaButton.setFocusable(false);
        bolitaButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        bolitaButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        bolitaButton.setRadius(5);
        bolitaButton.setRequestFocusEnabled(false);
        bolitaButton.setRolloverEnabled(false);
        bolitaButton.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(bolitaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 95, 10, 10));

        barraButton.setBackground(new java.awt.Color(36, 39, 46));
        barraButton.setForeground(new java.awt.Color(36, 39, 46));
        barraButton.setBorderColor(new java.awt.Color(36, 39, 46));
        barraButton.setBorderPainted(false);
        barraButton.setColor(new java.awt.Color(36, 39, 46));
        barraButton.setColorClick(new java.awt.Color(36, 39, 46));
        barraButton.setColorOver(new java.awt.Color(36, 39, 46));
        barraButton.setFocusPainted(false);
        barraButton.setFocusable(false);
        barraButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        barraButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        barraButton.setRadius(15);
        barraButton.setRequestFocusEnabled(false);
        barraButton.setRolloverEnabled(false);
        barraButton.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(barraButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 130, 20));

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
        progresButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        progresButton.setRadius(15);
        progresButton.setRequestFocusEnabled(false);
        progresButton.setRolloverEnabled(false);
        progresButton.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(progresButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 40));

        buscarEstudianteButton.setBackground(new java.awt.Color(204, 204, 255));
        buscarEstudianteButton.setForeground(new java.awt.Color(36, 39, 46));
        buscarEstudianteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaBlack(1).png"))); // NOI18N
        buscarEstudianteButton.setText("Buscar");
        buscarEstudianteButton.setBorderColor(new java.awt.Color(204, 204, 255));
        buscarEstudianteButton.setBorderPainted(false);
        buscarEstudianteButton.setColor(new java.awt.Color(204, 204, 255));
        buscarEstudianteButton.setColorClick(new java.awt.Color(153, 153, 255));
        buscarEstudianteButton.setColorOver(new java.awt.Color(153, 153, 255));
        buscarEstudianteButton.setFocusPainted(false);
        buscarEstudianteButton.setFocusable(false);
        buscarEstudianteButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        buscarEstudianteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarEstudianteButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        buscarEstudianteButton.setRadius(15);
        buscarEstudianteButton.setRequestFocusEnabled(false);
        buscarEstudianteButton.setRolloverEnabled(false);
        buscarEstudianteButton.setVerifyInputWhenFocusTarget(false);
        buscarEstudianteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEstudianteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(buscarEstudianteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 40));

        eliminarEstudianteButton.setBackground(new java.awt.Color(204, 204, 255));
        eliminarEstudianteButton.setForeground(new java.awt.Color(36, 39, 46));
        eliminarEstudianteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash(1).png"))); // NOI18N
        eliminarEstudianteButton.setText("Eliminar");
        eliminarEstudianteButton.setBorderColor(new java.awt.Color(204, 204, 255));
        eliminarEstudianteButton.setBorderPainted(false);
        eliminarEstudianteButton.setColor(new java.awt.Color(204, 204, 255));
        eliminarEstudianteButton.setColorClick(new java.awt.Color(153, 153, 255));
        eliminarEstudianteButton.setColorOver(new java.awt.Color(153, 153, 255));
        eliminarEstudianteButton.setFocusPainted(false);
        eliminarEstudianteButton.setFocusable(false);
        eliminarEstudianteButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        eliminarEstudianteButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarEstudianteButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        eliminarEstudianteButton.setRadius(15);
        eliminarEstudianteButton.setRequestFocusEnabled(false);
        eliminarEstudianteButton.setRolloverEnabled(false);
        eliminarEstudianteButton.setVerifyInputWhenFocusTarget(false);
        eliminarEstudianteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEstudianteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarEstudianteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 40));

        javax.swing.GroupLayout buscarEstudiantePanelLayout = new javax.swing.GroupLayout(buscarEstudiantePanel);
        buscarEstudiantePanel.setLayout(buscarEstudiantePanelLayout);
        buscarEstudiantePanelLayout.setHorizontalGroup(
            buscarEstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buscarEstudiantePanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(40, 40, 40))
            .addGroup(buscarEstudiantePanelLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        buscarEstudiantePanelLayout.setVerticalGroup(
            buscarEstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buscarEstudiantePanelLayout.createSequentialGroup()
                .addGroup(buscarEstudiantePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarEstudiantePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(buscarEstudiantePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarEstudianteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEstudianteButtonActionPerformed
        metodos.vaciarRows(modeloT1);
        String cedulaDelet = cedulaEstudianteEliminarTField.getText();
        int estudiante_Existe = 0;
        
        if (cedulaDelet.length() > 0) {
            try {
                for (Object[] x : Metodos.Conexion_Buscar_Estudiantes.getConexionEstudiantes("SELECT * FROM estudiantes WHERE Cedula = '" + cedulaDelet + "'")) {
                    estudiante_Existe = 1;
                }

                switch (estudiante_Existe) {
                    case 0 -> {metodos.bat("El estudiante no existe en la db", "Error"); break;}
                    case 1 -> {
                        Metodos.Conexion_Eliminar_Estudiantes.setConexionEstudiantes("DELETE FROM estudiantes WHERE Cedula = '" + cedulaDelet + "'");
                        metodos.ok("Estudiante eliminado correctamente", "Informacion");
                        break;
                    }

                }
            } catch (SQLException | ClassNotFoundException ex) {}
        } else {
            metodos.rellenarCampos();
        }
    }//GEN-LAST:event_eliminarEstudianteButtonActionPerformed

    private void buscarEstudianteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEstudianteButtonActionPerformed
        metodos.vaciarRows(modeloT1);
        String nombreEst = nombreEstudianteBuscarTField1.getText();
        existe_estudiante_db = false;
                
        if (nombreEst.length() > 0) {
           buscarEstudianteButton.setVisible(false);
           progresButton.setVisible(true);
           barraButton.setVisible(true);
           bolitaButton.setVisible(true);
        
            int delay = 1;
            timer = new Timer(delay, new ActionListener() {
                int crecimiento_por_segundo = 1;

                @Override
                public void actionPerformed(ActionEvent e) {
                    Dimension sizeActual = bolitaButton.getSize();
                    bolitaButton.setSize(new Dimension(sizeActual.width + crecimiento_por_segundo, sizeActual.height));

                    if (sizeActual.width >= 120) {
                        timer.stop();
                        progresButton.setVisible(false);
                        barraButton.setVisible(false);
                        bolitaButton.setVisible(false);
                        buscarEstudianteButton.setVisible(true);

                        try {
                            for (Object[] x : Metodos.Conexion_Buscar_Estudiantes.getConexionEstudiantes("SELECT * FROM estudiantes WHERE Nombre LIKE '%" + nombreEst + "%'")) {
                                if (x != null) {
                                    existe_estudiante_db = true;
                                    modeloT1.addRow(x);
                                } else {
                                    timer.stop();
                                    break;
                                }
                            }
                            
                            if (existe_estudiante_db == false) {
                                timer.stop();
                                metodos.bat("No se encontraron posibles conicidencias", "Error");
                            } else {
                                timer.stop();
                            }
                        } catch (SQLException | ClassNotFoundException ex) { }
                    }
                }
            });

            timer.start();
            pack(); 
        } else {
            metodos.rellenarCampos();
        }
    }//GEN-LAST:event_buscarEstudianteButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceEstudents.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceEstudents().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemasop.myButton barraButton;
    private sistemasop.myButton bolitaButton;
    private sistemasop.myButton buscarEstudianteButton;
    private javax.swing.JPanel buscarEstudiantePanel;
    private javax.swing.JTextField cedulaEstudianteEliminarTField;
    private sistemasop.myButton eliminarEstudianteButton;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTable jTableDatos1;
    private javax.swing.JTextField nombreEstudianteBuscarTField1;
    private sistemasop.myButton progresButton;
    private javax.swing.JScrollPane scrollEstudiante1;
    // End of variables declaration//GEN-END:variables
}
