package sistemasop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class InterfaceCursos extends javax.swing.JFrame {
        
    DefaultTableModel modeloT1 = new DefaultTableModel();
    public Metodos metodos = new Metodos();
    public Timer timer;
    public boolean existe_curso_db = false;
    
    public InterfaceCursos() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/nubeZ(1).png")).getImage());
        this.setLocationRelativeTo(this);
        personalizarTabla(jTableCursos1, scrollCursos1, modeloT1);
        personalizarHeaderTabla(jTableCursos1);
        
        TablaBar tab = new TablaBar();
        tab.personalizarBarraDesplazamiento(scrollCursos1);
        
        EventosTextField ecv = new EventosTextField();
        codigoCursoEliminarTField.addKeyListener(ecv);
        
        progresButton1.setVisible(false);
        barraButton.setVisible(false);
        bolitaButton.setVisible(false);
    }

    public void personalizarTabla(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(36,39,46));
        modelo.addColumn("  Código");
        modelo.addColumn("  Nombre del curso");
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

        registrarCursosPanel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        scrollCursos1 = new javax.swing.JScrollPane();
        jTableCursos1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel46 = new javax.swing.JPanel();
        nombreCursoTField4 = new javax.swing.JTextField();
        jPanel42 = new javax.swing.JPanel();
        codigoCursoEliminarTField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bolitaButton = new sistemasop.myButton();
        barraButton = new sistemasop.myButton();
        progresButton1 = new sistemasop.myButton();
        buscarCursoButton = new sistemasop.myButton();
        eliminarCursoButton = new sistemasop.myButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        registrarCursosPanel.setBackground(new java.awt.Color(36, 39, 46));
        registrarCursosPanel.setForeground(new java.awt.Color(36, 39, 46));
        registrarCursosPanel.setToolTipText("");

        jPanel3.setBackground(new java.awt.Color(52, 53, 65));

        scrollCursos1.setBackground(new java.awt.Color(36, 39, 46));
        scrollCursos1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 2));
        scrollCursos1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollCursos1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTableCursos1.setBackground(new java.awt.Color(52, 53, 65));
        jTableCursos1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        jTableCursos1.setForeground(new java.awt.Color(153, 153, 153));
        jTableCursos1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCursos1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTableCursos1.setCellSelectionEnabled(true);
        jTableCursos1.setFocusable(false);
        jTableCursos1.setGridColor(new java.awt.Color(36, 39, 46));
        jTableCursos1.setIntercellSpacing(new java.awt.Dimension(2, 2));
        jTableCursos1.setOpaque(false);
        jTableCursos1.setRequestFocusEnabled(false);
        jTableCursos1.setRowHeight(30);
        jTableCursos1.setSelectionBackground(new java.awt.Color(74, 76, 89));
        jTableCursos1.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTableCursos1.setShowGrid(true);
        jTableCursos1.setVerifyInputWhenFocusTarget(false);
        scrollCursos1.setViewportView(jTableCursos1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCursos1, javax.swing.GroupLayout.DEFAULT_SIZE, 690, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollCursos1, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(36, 39, 46));

        jPanel46.setBackground(new java.awt.Color(36, 39, 46));
        jPanel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCursoTField4.setBackground(new java.awt.Color(36, 39, 46));
        nombreCursoTField4.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        nombreCursoTField4.setForeground(new java.awt.Color(204, 204, 204));
        nombreCursoTField4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreCursoTField4.setBorder(null);
        nombreCursoTField4.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreCursoTField4.setOpaque(true);
        jPanel46.add(nombreCursoTField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 490, 20));

        jPanel42.setBackground(new java.awt.Color(36, 39, 46));
        jPanel42.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoCursoEliminarTField.setBackground(new java.awt.Color(36, 39, 46));
        codigoCursoEliminarTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        codigoCursoEliminarTField.setForeground(new java.awt.Color(204, 204, 204));
        codigoCursoEliminarTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoCursoEliminarTField.setBorder(null);
        codigoCursoEliminarTField.setCaretColor(new java.awt.Color(204, 204, 204));
        codigoCursoEliminarTField.setOpaque(true);
        jPanel42.add(codigoCursoEliminarTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 490, 20));

        jLabel23.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(153, 153, 153));
        jLabel23.setText("Eliminar curso (Codigo)");

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Nombre del curso");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel42, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        progresButton1.setBackground(new java.awt.Color(204, 204, 255));
        progresButton1.setForeground(new java.awt.Color(36, 39, 46));
        progresButton1.setBorderColor(new java.awt.Color(204, 204, 255));
        progresButton1.setBorderPainted(false);
        progresButton1.setColor(new java.awt.Color(204, 204, 255));
        progresButton1.setColorClick(new java.awt.Color(153, 153, 255));
        progresButton1.setColorOver(new java.awt.Color(153, 153, 255));
        progresButton1.setFocusPainted(false);
        progresButton1.setFocusable(false);
        progresButton1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        progresButton1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        progresButton1.setRadius(15);
        progresButton1.setRequestFocusEnabled(false);
        progresButton1.setRolloverEnabled(false);
        progresButton1.setVerifyInputWhenFocusTarget(false);
        jPanel2.add(progresButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 40));

        buscarCursoButton.setBackground(new java.awt.Color(204, 204, 255));
        buscarCursoButton.setForeground(new java.awt.Color(36, 39, 46));
        buscarCursoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupaBlack(1).png"))); // NOI18N
        buscarCursoButton.setText("Buscar");
        buscarCursoButton.setBorderColor(new java.awt.Color(204, 204, 255));
        buscarCursoButton.setBorderPainted(false);
        buscarCursoButton.setColor(new java.awt.Color(204, 204, 255));
        buscarCursoButton.setColorClick(new java.awt.Color(153, 153, 255));
        buscarCursoButton.setColorOver(new java.awt.Color(153, 153, 255));
        buscarCursoButton.setFocusPainted(false);
        buscarCursoButton.setFocusable(false);
        buscarCursoButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        buscarCursoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarCursoButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        buscarCursoButton.setRadius(15);
        buscarCursoButton.setRequestFocusEnabled(false);
        buscarCursoButton.setRolloverEnabled(false);
        buscarCursoButton.setVerifyInputWhenFocusTarget(false);
        buscarCursoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCursoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(buscarCursoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 150, 40));

        eliminarCursoButton.setBackground(new java.awt.Color(204, 204, 255));
        eliminarCursoButton.setForeground(new java.awt.Color(36, 39, 46));
        eliminarCursoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash(1).png"))); // NOI18N
        eliminarCursoButton.setText("Eliminar");
        eliminarCursoButton.setBorderColor(new java.awt.Color(204, 204, 255));
        eliminarCursoButton.setBorderPainted(false);
        eliminarCursoButton.setColor(new java.awt.Color(204, 204, 255));
        eliminarCursoButton.setColorClick(new java.awt.Color(153, 153, 255));
        eliminarCursoButton.setColorOver(new java.awt.Color(153, 153, 255));
        eliminarCursoButton.setFocusPainted(false);
        eliminarCursoButton.setFocusable(false);
        eliminarCursoButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        eliminarCursoButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        eliminarCursoButton.setMargin(new java.awt.Insets(2, 30, 2, 2));
        eliminarCursoButton.setRadius(15);
        eliminarCursoButton.setRequestFocusEnabled(false);
        eliminarCursoButton.setRolloverEnabled(false);
        eliminarCursoButton.setVerifyInputWhenFocusTarget(false);
        eliminarCursoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCursoButtonActionPerformed(evt);
            }
        });
        jPanel2.add(eliminarCursoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 150, 40));

        javax.swing.GroupLayout registrarCursosPanelLayout = new javax.swing.GroupLayout(registrarCursosPanel);
        registrarCursosPanel.setLayout(registrarCursosPanelLayout);
        registrarCursosPanelLayout.setHorizontalGroup(
            registrarCursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registrarCursosPanelLayout.createSequentialGroup()
                .addGroup(registrarCursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(registrarCursosPanelLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registrarCursosPanelLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
        );
        registrarCursosPanelLayout.setVerticalGroup(
            registrarCursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registrarCursosPanelLayout.createSequentialGroup()
                .addGroup(registrarCursosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarCursosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarCursosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eliminarCursoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCursoButtonActionPerformed
        metodos.vaciarRows(modeloT1);
        String codigo_Eliminar = codigoCursoEliminarTField.getText();
        String nombre_Curso = nombreCursoTField4.getText();
        int curso_Existe = 0;

        if (codigo_Eliminar.length() > 0) {
            try {
                for (Object[] x : Metodos.Conexion_Buscar_Cursos.getConexionCursos("SELECT * FROM cursos WHERE Nombre LIKE '%" + nombre_Curso + "%'")) {
                    curso_Existe = 1;
                }

                switch (curso_Existe) {
                    case 0 -> {metodos.bat("El curso no existe en la db", "Error"); break;}
                    case 1 -> {
                        modeloT1.removeRow(0);
                        Metodos.Conexion_Eliminar_Cursos.setConexionCursos("DELETE FROM cursos WHERE Codigo='" + codigo_Eliminar + "'");
                        metodos.ok("Curso eliminado correctamente", "Informacion");
                        break;
                    }
                }
            } catch (SQLException | ClassNotFoundException ex) { }
        } else {
            metodos.rellenarCampos();
        }
    }//GEN-LAST:event_eliminarCursoButtonActionPerformed

    private void buscarCursoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCursoButtonActionPerformed
        metodos.vaciarRows(modeloT1);
        String nombre_Curso = nombreCursoTField4.getText();
        existe_curso_db = false;
        
        if (nombre_Curso.length() > 0) {
            buscarCursoButton.setVisible(false);
            progresButton1.setVisible(true);
            barraButton.setVisible(true);
            bolitaButton.setVisible(true);
            
            int delay = 1;
            timer = new Timer(delay, new ActionListener() {
                int crecimiento_por_segundo = 1;
                
                @Override
                public void actionPerformed(ActionEvent e) {
                    Dimension sizeActual = bolitaButton.getSize();
                    bolitaButton.setSize(sizeActual.width + crecimiento_por_segundo, sizeActual.height);
                    
                    if (sizeActual.width >= 120) {
                        progresButton1.setVisible(false);
                        barraButton.setVisible(false);
                        bolitaButton.setVisible(false);
                        buscarCursoButton.setVisible(true);
                        
                        try {
                            for (Object[] x : Metodos.Conexion_Buscar_Cursos.getConexionCursos("SELECT * FROM cursos WHERE Nombre LIKE '%" + nombre_Curso + "%'")) {
                                if (x != null) {
                                    existe_curso_db = true;
                                    modeloT1.addRow(x);
                                } else {
                                    timer.stop();
                                    break;
                                }
                            }
                            
                            if (existe_curso_db == false) {
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
    }//GEN-LAST:event_buscarCursoButtonActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceCursos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceCursos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemasop.myButton barraButton;
    private sistemasop.myButton bolitaButton;
    private sistemasop.myButton buscarCursoButton;
    private javax.swing.JTextField codigoCursoEliminarTField;
    private sistemasop.myButton eliminarCursoButton;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JTable jTableCursos1;
    private javax.swing.JTextField nombreCursoTField4;
    private sistemasop.myButton progresButton1;
    private javax.swing.JPanel registrarCursosPanel;
    private javax.swing.JScrollPane scrollCursos1;
    // End of variables declaration//GEN-END:variables
}
