package sistemasop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.JTableHeader;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class InterfaceG extends javax.swing.JFrame {
    
    public int contadorCursos = 0;
    public int contadorEstudiantes = 0;
    public int sesionIniciada = 0;
    public int id, codigoCursos;
    
    public String email, correoSesion, passwdSesion, usuario, password, nombreCursos;
    public static String url;
    
    public Metodos metodos = new Metodos();

    public InterfaceG() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("../imagenes/nubeZ(1).png")).getImage());
        this.setLocationRelativeTo(this);
        
        EventosTextField ecv = new EventosTextField();
        idTextField.addKeyListener(ecv);
        cedulaEstudianteTField.addKeyListener(ecv);
        telefonoEstTField.addKeyListener(ecv);
        cedulaEstudianteCURSOTField.addKeyListener(ecv);
        codigoCURSOTField.addKeyListener(ecv);

        metodos.habilitarOptions(0, crearCuentaOPC1, registrarEstudianteOPC1, verCursosOPC1, registrarCursosOPC1, buscarEstudianteOPC1, asignarCursosOPC1); 
                
        metodos.mostrarPaneles(crearCuentaPanel, registrarStudentPanel, asignarCursosEstudiantePanel, registrarCursosPanel, iniciarSesionPanel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        crearCuentaOPC1 = new sistemasop.myButton();
        iniciarSesionOPC1 = new sistemasop.myButton();
        registrarEstudianteOPC1 = new sistemasop.myButton();
        verCursosOPC1 = new sistemasop.myButton();
        registrarCursosOPC1 = new sistemasop.myButton();
        buscarEstudianteOPC1 = new sistemasop.myButton();
        asignarCursosOPC1 = new sistemasop.myButton();
        jPanel2 = new javax.swing.JPanel();
        registrarStudentPanel = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        nombreEstTField = new javax.swing.JTextField();
        jPanel33 = new javax.swing.JPanel();
        cedulaEstudianteTField = new javax.swing.JTextField();
        jPanel34 = new javax.swing.JPanel();
        pApellidoEstTField = new javax.swing.JTextField();
        jPanel35 = new javax.swing.JPanel();
        sApellidoEstTField = new javax.swing.JTextField();
        jPanel36 = new javax.swing.JPanel();
        fechaEstTField = new javax.swing.JTextField();
        jPanel37 = new javax.swing.JPanel();
        emailEstTField = new javax.swing.JTextField();
        jPanel38 = new javax.swing.JPanel();
        passwordEstTField = new javax.swing.JPasswordField();
        jPanel39 = new javax.swing.JPanel();
        telefonoEstTField = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        registrarEstudianteButton = new sistemasop.myButton();
        asignarCursosEstudiantePanel = new javax.swing.JPanel();
        jPanel43 = new javax.swing.JPanel();
        cedulaEstudianteCURSOTField = new javax.swing.JTextField();
        jPanel46 = new javax.swing.JPanel();
        codigoCURSOTField = new javax.swing.JTextField();
        jLabel105 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        cursoAAsignarTField = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        asignarCursosButton = new sistemasop.myButton();
        registrarCursosPanel = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        codigoCursoTField = new javax.swing.JTextField();
        jPanel41 = new javax.swing.JPanel();
        nombreCursoTField = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        registrarCursoButton = new sistemasop.myButton();
        iniciarSesionPanel = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        passwdTField = new javax.swing.JPasswordField();
        jPanel23 = new javax.swing.JPanel();
        correoTField = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        nombreTField = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        iniciarSesionButton = new sistemasop.myButton();
        crearCuentaPanel = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        passwordTextField = new javax.swing.JPasswordField();
        jPanel17 = new javax.swing.JPanel();
        emailTextField = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        idTextField = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        crearCuentaButton1 = new sistemasop.myButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 53, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(36, 39, 46));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(36, 39, 46));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userLOGINAvatar.png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 80));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 180, 90));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obs1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obs2.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 10, -1, 30));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obs2.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(209, 70, -1, 30));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Obs1.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jPanel8.setBackground(new java.awt.Color(36, 39, 46));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 10, 50));

        jPanel9.setBackground(new java.awt.Color(36, 39, 46));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 10, 50));

        crearCuentaOPC1.setBackground(new java.awt.Color(36, 39, 46));
        crearCuentaOPC1.setForeground(new java.awt.Color(204, 204, 204));
        crearCuentaOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user(1).png"))); // NOI18N
        crearCuentaOPC1.setText("  Crear cuenta");
        crearCuentaOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        crearCuentaOPC1.setBorderPainted(false);
        crearCuentaOPC1.setColor(new java.awt.Color(36, 39, 46));
        crearCuentaOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        crearCuentaOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        crearCuentaOPC1.setFocusPainted(false);
        crearCuentaOPC1.setFocusable(false);
        crearCuentaOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        crearCuentaOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crearCuentaOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        crearCuentaOPC1.setRadius(15);
        crearCuentaOPC1.setRequestFocusEnabled(false);
        crearCuentaOPC1.setRolloverEnabled(false);
        crearCuentaOPC1.setVerifyInputWhenFocusTarget(false);
        crearCuentaOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(crearCuentaOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 200, 40));

        iniciarSesionOPC1.setBackground(new java.awt.Color(36, 39, 46));
        iniciarSesionOPC1.setForeground(new java.awt.Color(204, 204, 204));
        iniciarSesionOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/flechas(1).png"))); // NOI18N
        iniciarSesionOPC1.setText("  Iniciar Sesión");
        iniciarSesionOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        iniciarSesionOPC1.setBorderPainted(false);
        iniciarSesionOPC1.setColor(new java.awt.Color(36, 39, 46));
        iniciarSesionOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        iniciarSesionOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        iniciarSesionOPC1.setFocusPainted(false);
        iniciarSesionOPC1.setFocusable(false);
        iniciarSesionOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        iniciarSesionOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iniciarSesionOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        iniciarSesionOPC1.setRadius(15);
        iniciarSesionOPC1.setRequestFocusEnabled(false);
        iniciarSesionOPC1.setRolloverEnabled(false);
        iniciarSesionOPC1.setVerifyInputWhenFocusTarget(false);
        iniciarSesionOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(iniciarSesionOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 200, 40));

        registrarEstudianteOPC1.setBackground(new java.awt.Color(36, 39, 46));
        registrarEstudianteOPC1.setForeground(new java.awt.Color(204, 204, 204));
        registrarEstudianteOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pc(2).png"))); // NOI18N
        registrarEstudianteOPC1.setText("  Ingresar estudiante");
        registrarEstudianteOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        registrarEstudianteOPC1.setBorderPainted(false);
        registrarEstudianteOPC1.setColor(new java.awt.Color(36, 39, 46));
        registrarEstudianteOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        registrarEstudianteOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        registrarEstudianteOPC1.setFocusPainted(false);
        registrarEstudianteOPC1.setFocusable(false);
        registrarEstudianteOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        registrarEstudianteOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarEstudianteOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        registrarEstudianteOPC1.setRadius(15);
        registrarEstudianteOPC1.setRequestFocusEnabled(false);
        registrarEstudianteOPC1.setRolloverEnabled(false);
        registrarEstudianteOPC1.setVerifyInputWhenFocusTarget(false);
        registrarEstudianteOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEstudianteOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(registrarEstudianteOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 200, 40));

        verCursosOPC1.setBackground(new java.awt.Color(36, 39, 46));
        verCursosOPC1.setForeground(new java.awt.Color(204, 204, 204));
        verCursosOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa(2).png"))); // NOI18N
        verCursosOPC1.setText("  Buscar Cursos");
        verCursosOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        verCursosOPC1.setBorderPainted(false);
        verCursosOPC1.setColor(new java.awt.Color(36, 39, 46));
        verCursosOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        verCursosOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        verCursosOPC1.setFocusPainted(false);
        verCursosOPC1.setFocusable(false);
        verCursosOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        verCursosOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verCursosOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        verCursosOPC1.setRadius(15);
        verCursosOPC1.setRequestFocusEnabled(false);
        verCursosOPC1.setRolloverEnabled(false);
        verCursosOPC1.setVerifyInputWhenFocusTarget(false);
        verCursosOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCursosOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(verCursosOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 200, 40));

        registrarCursosOPC1.setBackground(new java.awt.Color(36, 39, 46));
        registrarCursosOPC1.setForeground(new java.awt.Color(204, 204, 204));
        registrarCursosOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registros(1).png"))); // NOI18N
        registrarCursosOPC1.setText("  Registrar Cursos");
        registrarCursosOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        registrarCursosOPC1.setBorderPainted(false);
        registrarCursosOPC1.setColor(new java.awt.Color(36, 39, 46));
        registrarCursosOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        registrarCursosOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        registrarCursosOPC1.setFocusPainted(false);
        registrarCursosOPC1.setFocusable(false);
        registrarCursosOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        registrarCursosOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarCursosOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        registrarCursosOPC1.setRadius(15);
        registrarCursosOPC1.setRequestFocusEnabled(false);
        registrarCursosOPC1.setRolloverEnabled(false);
        registrarCursosOPC1.setVerifyInputWhenFocusTarget(false);
        registrarCursosOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCursosOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(registrarCursosOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 200, 40));

        buscarEstudianteOPC1.setBackground(new java.awt.Color(36, 39, 46));
        buscarEstudianteOPC1.setForeground(new java.awt.Color(204, 204, 204));
        buscarEstudianteOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/lupa(2).png"))); // NOI18N
        buscarEstudianteOPC1.setText("  Buscar estudiente");
        buscarEstudianteOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        buscarEstudianteOPC1.setBorderPainted(false);
        buscarEstudianteOPC1.setColor(new java.awt.Color(36, 39, 46));
        buscarEstudianteOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        buscarEstudianteOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        buscarEstudianteOPC1.setFocusPainted(false);
        buscarEstudianteOPC1.setFocusable(false);
        buscarEstudianteOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        buscarEstudianteOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarEstudianteOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        buscarEstudianteOPC1.setRadius(15);
        buscarEstudianteOPC1.setRequestFocusEnabled(false);
        buscarEstudianteOPC1.setRolloverEnabled(false);
        buscarEstudianteOPC1.setVerifyInputWhenFocusTarget(false);
        buscarEstudianteOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEstudianteOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(buscarEstudianteOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 200, 40));

        asignarCursosOPC1.setBackground(new java.awt.Color(36, 39, 46));
        asignarCursosOPC1.setForeground(new java.awt.Color(204, 204, 204));
        asignarCursosOPC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ingresar(1).png"))); // NOI18N
        asignarCursosOPC1.setText("  Asignar Cursos");
        asignarCursosOPC1.setBorderColor(new java.awt.Color(36, 39, 46));
        asignarCursosOPC1.setBorderPainted(false);
        asignarCursosOPC1.setColor(new java.awt.Color(36, 39, 46));
        asignarCursosOPC1.setColorClick(new java.awt.Color(29, 31, 37));
        asignarCursosOPC1.setColorOver(new java.awt.Color(29, 31, 37));
        asignarCursosOPC1.setFocusPainted(false);
        asignarCursosOPC1.setFocusable(false);
        asignarCursosOPC1.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        asignarCursosOPC1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        asignarCursosOPC1.setMargin(new java.awt.Insets(2, 20, 2, 2));
        asignarCursosOPC1.setRadius(15);
        asignarCursosOPC1.setRequestFocusEnabled(false);
        asignarCursosOPC1.setRolloverEnabled(false);
        asignarCursosOPC1.setVerifyInputWhenFocusTarget(false);
        asignarCursosOPC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursosOPC1ActionPerformed(evt);
            }
        });
        jPanel1.add(asignarCursosOPC1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 240, 460));

        jPanel2.setBackground(new java.awt.Color(36, 39, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarStudentPanel.setBackground(new java.awt.Color(36, 39, 46));
        registrarStudentPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel31.setBackground(new java.awt.Color(36, 39, 46));
        jPanel31.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstTField.setBackground(new java.awt.Color(36, 39, 46));
        nombreEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        nombreEstTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEstTField.setBorder(null);
        nombreEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreEstTField.setOpaque(true);
        jPanel31.add(nombreEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 190, 20));

        registrarStudentPanel.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 210, 30));

        jPanel33.setBackground(new java.awt.Color(36, 39, 46));
        jPanel33.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudianteTField.setBackground(new java.awt.Color(36, 39, 46));
        cedulaEstudianteTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        cedulaEstudianteTField.setForeground(new java.awt.Color(204, 204, 204));
        cedulaEstudianteTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaEstudianteTField.setBorder(null);
        cedulaEstudianteTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaEstudianteTField.setOpaque(true);
        jPanel33.add(cedulaEstudianteTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 180, 20));

        registrarStudentPanel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 210, 30));

        jPanel34.setBackground(new java.awt.Color(36, 39, 46));
        jPanel34.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pApellidoEstTField.setBackground(new java.awt.Color(36, 39, 46));
        pApellidoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        pApellidoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        pApellidoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pApellidoEstTField.setBorder(null);
        pApellidoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        pApellidoEstTField.setOpaque(true);
        jPanel34.add(pApellidoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 190, 20));

        registrarStudentPanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 210, 30));

        jPanel35.setBackground(new java.awt.Color(36, 39, 46));
        jPanel35.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sApellidoEstTField.setBackground(new java.awt.Color(36, 39, 46));
        sApellidoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        sApellidoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        sApellidoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sApellidoEstTField.setBorder(null);
        sApellidoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        sApellidoEstTField.setOpaque(true);
        jPanel35.add(sApellidoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 180, 20));

        registrarStudentPanel.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 210, 30));

        jPanel36.setBackground(new java.awt.Color(36, 39, 46));
        jPanel36.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaEstTField.setBackground(new java.awt.Color(36, 39, 46));
        fechaEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        fechaEstTField.setForeground(new java.awt.Color(204, 204, 204));
        fechaEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fechaEstTField.setBorder(null);
        fechaEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        fechaEstTField.setOpaque(true);
        jPanel36.add(fechaEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 190, 20));

        registrarStudentPanel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 210, 30));

        jPanel37.setBackground(new java.awt.Color(36, 39, 46));
        jPanel37.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailEstTField.setBackground(new java.awt.Color(36, 39, 46));
        emailEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        emailEstTField.setForeground(new java.awt.Color(204, 204, 204));
        emailEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailEstTField.setBorder(null);
        emailEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailEstTField.setOpaque(true);
        jPanel37.add(emailEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 180, 20));

        registrarStudentPanel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 210, 30));

        jPanel38.setBackground(new java.awt.Color(36, 39, 46));
        jPanel38.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordEstTField.setBackground(new java.awt.Color(36, 39, 46));
        passwordEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        passwordEstTField.setForeground(new java.awt.Color(204, 204, 204));
        passwordEstTField.setToolTipText("");
        passwordEstTField.setBorder(null);
        passwordEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        passwordEstTField.setVerifyInputWhenFocusTarget(false);
        jPanel38.add(passwordEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 180, 20));

        registrarStudentPanel.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 210, 30));

        jPanel39.setBackground(new java.awt.Color(36, 39, 46));
        jPanel39.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefonoEstTField.setBackground(new java.awt.Color(36, 39, 46));
        telefonoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        telefonoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefonoEstTField.setBorder(null);
        telefonoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        telefonoEstTField.setOpaque(true);
        jPanel39.add(telefonoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 190, 20));

        registrarStudentPanel.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 210, 30));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarStudentPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel27.setBackground(new java.awt.Color(52, 53, 65));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Registro de datos de usuario");
        jPanel27.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 30));

        registrarStudentPanel.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarStudentPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre");
        registrarStudentPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 120, 20));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Numero de cedula");
        registrarStudentPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 120, 20));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Primer Apellido");
        registrarStudentPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 120, 20));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Segundo Apellido");
        registrarStudentPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, 120, 20));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Fecha de nacimiento dd/mm/yyyy");
        registrarStudentPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 170, 20));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Numero de teléfono");
        registrarStudentPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 120, 20));

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Contraseña");
        registrarStudentPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 300, 120, 20));

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Correo electrónico");
        registrarStudentPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 120, 20));

        registrarEstudianteButton.setBackground(new java.awt.Color(204, 204, 255));
        registrarEstudianteButton.setForeground(new java.awt.Color(36, 39, 46));
        registrarEstudianteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarStudent(1).png"))); // NOI18N
        registrarEstudianteButton.setText("Registrar");
        registrarEstudianteButton.setBorderColor(new java.awt.Color(204, 204, 255));
        registrarEstudianteButton.setBorderPainted(false);
        registrarEstudianteButton.setColor(new java.awt.Color(204, 204, 255));
        registrarEstudianteButton.setColorClick(new java.awt.Color(153, 153, 255));
        registrarEstudianteButton.setColorOver(new java.awt.Color(153, 153, 255));
        registrarEstudianteButton.setFocusPainted(false);
        registrarEstudianteButton.setFocusable(false);
        registrarEstudianteButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        registrarEstudianteButton.setRadius(15);
        registrarEstudianteButton.setRequestFocusEnabled(false);
        registrarEstudianteButton.setRolloverEnabled(false);
        registrarEstudianteButton.setVerifyInputWhenFocusTarget(false);
        registrarEstudianteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEstudianteButtonActionPerformed(evt);
            }
        });
        registrarStudentPanel.add(registrarEstudianteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 40));

        jPanel2.add(registrarStudentPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        asignarCursosEstudiantePanel.setBackground(new java.awt.Color(36, 39, 46));
        asignarCursosEstudiantePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel43.setBackground(new java.awt.Color(36, 39, 46));
        jPanel43.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudianteCURSOTField.setBackground(new java.awt.Color(36, 39, 46));
        cedulaEstudianteCURSOTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        cedulaEstudianteCURSOTField.setForeground(new java.awt.Color(204, 204, 204));
        cedulaEstudianteCURSOTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaEstudianteCURSOTField.setBorder(null);
        cedulaEstudianteCURSOTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaEstudianteCURSOTField.setOpaque(true);
        jPanel43.add(cedulaEstudianteCURSOTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 410, 20));

        asignarCursosEstudiantePanel.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 450, 30));

        jPanel46.setBackground(new java.awt.Color(36, 39, 46));
        jPanel46.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoCURSOTField.setBackground(new java.awt.Color(36, 39, 46));
        codigoCURSOTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        codigoCURSOTField.setForeground(new java.awt.Color(204, 204, 204));
        codigoCURSOTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoCURSOTField.setBorder(null);
        codigoCURSOTField.setCaretColor(new java.awt.Color(204, 204, 204));
        codigoCURSOTField.setOpaque(true);
        jPanel46.add(codigoCURSOTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 410, 20));

        asignarCursosEstudiantePanel.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 450, 30));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel50.setBackground(new java.awt.Color(52, 53, 65));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Asignar cursos a un estudiante");
        jPanel50.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 30));

        asignarCursosEstudiantePanel.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        jPanel51.setBackground(new java.awt.Color(36, 39, 46));
        jPanel51.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cursoAAsignarTField.setBackground(new java.awt.Color(36, 39, 46));
        cursoAAsignarTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        cursoAAsignarTField.setForeground(new java.awt.Color(204, 204, 204));
        cursoAAsignarTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cursoAAsignarTField.setBorder(null);
        cursoAAsignarTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cursoAAsignarTField.setOpaque(true);
        jPanel51.add(cursoAAsignarTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 410, 20));

        asignarCursosEstudiantePanel.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 30));

        jLabel95.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(153, 153, 153));
        jLabel95.setText("Numero de cédula del estudiante");
        asignarCursosEstudiantePanel.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 20));

        jLabel101.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(153, 153, 153));
        jLabel101.setText("Código del curso");
        asignarCursosEstudiantePanel.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 120, 20));

        jLabel102.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(153, 153, 153));
        jLabel102.setText("Nombre del curso");
        asignarCursosEstudiantePanel.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 120, 20));

        asignarCursosButton.setBackground(new java.awt.Color(204, 204, 255));
        asignarCursosButton.setForeground(new java.awt.Color(36, 39, 46));
        asignarCursosButton.setText("Asignar curso");
        asignarCursosButton.setBorderColor(new java.awt.Color(204, 204, 255));
        asignarCursosButton.setBorderPainted(false);
        asignarCursosButton.setColor(new java.awt.Color(204, 204, 255));
        asignarCursosButton.setColorClick(new java.awt.Color(153, 153, 255));
        asignarCursosButton.setColorOver(new java.awt.Color(153, 153, 255));
        asignarCursosButton.setFocusPainted(false);
        asignarCursosButton.setFocusable(false);
        asignarCursosButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        asignarCursosButton.setRadius(15);
        asignarCursosButton.setRequestFocusEnabled(false);
        asignarCursosButton.setRolloverEnabled(false);
        asignarCursosButton.setVerifyInputWhenFocusTarget(false);
        asignarCursosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursosButtonActionPerformed(evt);
            }
        });
        asignarCursosEstudiantePanel.add(asignarCursosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 40));

        jPanel2.add(asignarCursosEstudiantePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        registrarCursosPanel.setBackground(new java.awt.Color(36, 39, 46));
        registrarCursosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel32.setBackground(new java.awt.Color(36, 39, 46));
        jPanel32.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoCursoTField.setBackground(new java.awt.Color(36, 39, 46));
        codigoCursoTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        codigoCursoTField.setForeground(new java.awt.Color(204, 204, 204));
        codigoCursoTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoCursoTField.setBorder(null);
        codigoCursoTField.setCaretColor(new java.awt.Color(204, 204, 204));
        codigoCursoTField.setOpaque(true);
        jPanel32.add(codigoCursoTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 430, 20));

        registrarCursosPanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 450, 30));

        jPanel41.setBackground(new java.awt.Color(36, 39, 46));
        jPanel41.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCursoTField.setBackground(new java.awt.Color(36, 39, 46));
        nombreCursoTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        nombreCursoTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreCursoTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreCursoTField.setBorder(null);
        nombreCursoTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreCursoTField.setOpaque(true);
        jPanel41.add(nombreCursoTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 430, 20));

        registrarCursosPanel.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 450, 30));

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarCursosPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel28.setBackground(new java.awt.Color(52, 53, 65));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel61.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(204, 204, 204));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Registro de datos de usuario");
        jPanel28.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 30));

        registrarCursosPanel.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarCursosPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        jLabel13.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 153, 153));
        jLabel13.setText("Codigo del curso");
        registrarCursosPanel.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 120, 20));

        jLabel15.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 153, 153));
        jLabel15.setText("Nombre del curso");
        registrarCursosPanel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 120, 20));

        registrarCursoButton.setBackground(new java.awt.Color(204, 204, 255));
        registrarCursoButton.setForeground(new java.awt.Color(36, 39, 46));
        registrarCursoButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrarCurso(1).png"))); // NOI18N
        registrarCursoButton.setText("Registrar");
        registrarCursoButton.setBorderColor(new java.awt.Color(204, 204, 255));
        registrarCursoButton.setBorderPainted(false);
        registrarCursoButton.setColor(new java.awt.Color(204, 204, 255));
        registrarCursoButton.setColorClick(new java.awt.Color(153, 153, 255));
        registrarCursoButton.setColorOver(new java.awt.Color(153, 153, 255));
        registrarCursoButton.setFocusPainted(false);
        registrarCursoButton.setFocusable(false);
        registrarCursoButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        registrarCursoButton.setRadius(15);
        registrarCursoButton.setRequestFocusEnabled(false);
        registrarCursoButton.setRolloverEnabled(false);
        registrarCursoButton.setVerifyInputWhenFocusTarget(false);
        registrarCursoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCursoButtonActionPerformed(evt);
            }
        });
        registrarCursosPanel.add(registrarCursoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 40));

        jPanel2.add(registrarCursosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        iniciarSesionPanel.setBackground(new java.awt.Color(36, 39, 46));
        iniciarSesionPanel.setForeground(new java.awt.Color(153, 153, 153));
        iniciarSesionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel21.setBackground(new java.awt.Color(52, 53, 65));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Iniciar sesión en la cuenta");
        jPanel21.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 30));

        iniciarSesionPanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        jLabel43.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(153, 153, 153));
        jLabel43.setText("Correo");
        iniciarSesionPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 20));

        jLabel44.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(153, 153, 153));
        jLabel44.setText("Nombre de usuario");
        iniciarSesionPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 20));

        jPanel22.setBackground(new java.awt.Color(36, 39, 46));
        jPanel22.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwdTField.setBackground(new java.awt.Color(36, 39, 46));
        passwdTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        passwdTField.setForeground(new java.awt.Color(204, 204, 204));
        passwdTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwdTField.setBorder(null);
        passwdTField.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel22.add(passwdTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 6, 440, 20));

        iniciarSesionPanel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 30));

        jPanel23.setBackground(new java.awt.Color(36, 39, 46));
        jPanel23.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        correoTField.setBackground(new java.awt.Color(36, 39, 46));
        correoTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        correoTField.setForeground(new java.awt.Color(204, 204, 204));
        correoTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        correoTField.setBorder(null);
        correoTField.setCaretColor(new java.awt.Color(204, 204, 204));
        correoTField.setOpaque(true);
        jPanel23.add(correoTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 430, 20));

        iniciarSesionPanel.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 450, 30));

        jPanel24.setBackground(new java.awt.Color(36, 39, 46));
        jPanel24.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTField.setBackground(new java.awt.Color(36, 39, 46));
        nombreTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        nombreTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreTField.setBorder(null);
        nombreTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreTField.setOpaque(true);
        jPanel24.add(nombreTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 430, 20));

        iniciarSesionPanel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 450, 30));

        jLabel50.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(153, 153, 153));
        jLabel50.setText("Contraseña");
        iniciarSesionPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 20));

        iniciarSesionButton.setBackground(new java.awt.Color(204, 204, 255));
        iniciarSesionButton.setForeground(new java.awt.Color(36, 39, 46));
        iniciarSesionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/sing in(1).png"))); // NOI18N
        iniciarSesionButton.setText("Iniciar Sesión");
        iniciarSesionButton.setBorderColor(new java.awt.Color(204, 204, 255));
        iniciarSesionButton.setBorderPainted(false);
        iniciarSesionButton.setColor(new java.awt.Color(204, 204, 255));
        iniciarSesionButton.setColorClick(new java.awt.Color(153, 153, 255));
        iniciarSesionButton.setColorOver(new java.awt.Color(153, 153, 255));
        iniciarSesionButton.setFocusPainted(false);
        iniciarSesionButton.setFocusable(false);
        iniciarSesionButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        iniciarSesionButton.setRadius(15);
        iniciarSesionButton.setRequestFocusEnabled(false);
        iniciarSesionButton.setRolloverEnabled(false);
        iniciarSesionButton.setVerifyInputWhenFocusTarget(false);
        iniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonActionPerformed(evt);
            }
        });
        iniciarSesionPanel.add(iniciarSesionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 40));

        jPanel2.add(iniciarSesionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        crearCuentaPanel.setBackground(new java.awt.Color(36, 39, 46));
        crearCuentaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(36, 39, 46));
        jPanel16.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTextField.setBackground(new java.awt.Color(36, 39, 46));
        passwordTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setBorder(null);
        passwordTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel16.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 280, 20));

        crearCuentaPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 450, 30));

        jPanel17.setBackground(new java.awt.Color(36, 39, 46));
        jPanel17.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailTextField.setBackground(new java.awt.Color(36, 39, 46));
        emailTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(204, 204, 204));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextField.setBorder(null);
        emailTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailTextField.setOpaque(true);
        jPanel17.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 280, 20));

        crearCuentaPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 450, 30));

        jPanel18.setBackground(new java.awt.Color(36, 39, 46));
        jPanel18.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(102, 102, 102)));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setBackground(new java.awt.Color(36, 39, 46));
        idTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 14)); // NOI18N
        idTextField.setForeground(new java.awt.Color(204, 204, 204));
        idTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idTextField.setBorder(null);
        idTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        idTextField.setOpaque(true);
        jPanel18.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 5, 280, 20));

        crearCuentaPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 450, 30));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        crearCuentaPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 30));

        jPanel20.setBackground(new java.awt.Color(52, 53, 65));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Crear cuenta de usuario");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 410, 30));

        crearCuentaPanel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 430, 30));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, -1, 30));

        jLabel40.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(153, 153, 153));
        jLabel40.setText("ID de la cuenta ");
        crearCuentaPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 20));

        jLabel41.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(153, 153, 153));
        jLabel41.setText("Contraseña");
        crearCuentaPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 20));

        jLabel42.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(153, 153, 153));
        jLabel42.setText("Correo Electronico");
        crearCuentaPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 20));

        crearCuentaButton1.setBackground(new java.awt.Color(204, 204, 255));
        crearCuentaButton1.setForeground(new java.awt.Color(36, 39, 46));
        crearCuentaButton1.setText("Crear cuenta");
        crearCuentaButton1.setBorderColor(new java.awt.Color(204, 204, 255));
        crearCuentaButton1.setBorderPainted(false);
        crearCuentaButton1.setColor(new java.awt.Color(204, 204, 255));
        crearCuentaButton1.setColorClick(new java.awt.Color(153, 153, 255));
        crearCuentaButton1.setColorOver(new java.awt.Color(153, 153, 255));
        crearCuentaButton1.setFocusPainted(false);
        crearCuentaButton1.setFocusable(false);
        crearCuentaButton1.setFont(new java.awt.Font("Franklin Gothic Book", 1, 14)); // NOI18N
        crearCuentaButton1.setMargin(new java.awt.Insets(2, 14, 2, 14));
        crearCuentaButton1.setRadius(15);
        crearCuentaButton1.setRequestFocusEnabled(false);
        crearCuentaButton1.setRolloverEnabled(false);
        crearCuentaButton1.setVerifyInputWhenFocusTarget(false);
        crearCuentaButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButton1ActionPerformed(evt);
            }
        });
        crearCuentaPanel.add(crearCuentaButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 180, 40));

        jPanel2.add(crearCuentaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 460));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 530, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void personalizarHeaderTabla(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.getHeight();
        header.setBorder(new LineBorder(new Color(36,39,46), 2));
        header.setFont(new Font("Franklin Gothic Book", Font.BOLD, 14));
        Dimension headerDimension = header.getPreferredSize();
        headerDimension.height = 30;
        header.setPreferredSize(headerDimension);
    }
    
    private void crearCuentaButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButton1ActionPerformed
        if (!idTextField.getText().isEmpty() && !emailTextField.getText().isEmpty() && password.length() > 0) {
            id = Integer.parseInt(idTextField.getText());
            email = emailTextField.getText();
            char[] passwordChar = passwordTextField.getPassword();
            password = new String(passwordChar);
            
            
        }
    }//GEN-LAST:event_crearCuentaButton1ActionPerformed

    private void iniciarSesionOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionOPC1ActionPerformed
        metodos.mostrarPaneles(crearCuentaPanel, registrarStudentPanel, asignarCursosEstudiantePanel, registrarCursosPanel, iniciarSesionPanel);
    }//GEN-LAST:event_iniciarSesionOPC1ActionPerformed

    private void registrarEstudianteOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEstudianteOPC1ActionPerformed
        metodos.mostrarPaneles(iniciarSesionPanel, crearCuentaPanel, asignarCursosEstudiantePanel, registrarCursosPanel, registrarStudentPanel);
    }//GEN-LAST:event_registrarEstudianteOPC1ActionPerformed

    private void verCursosOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCursosOPC1ActionPerformed
        InterfaceCursos GUICur = new InterfaceCursos();
        GUICur.setVisible(true);
    }//GEN-LAST:event_verCursosOPC1ActionPerformed

    private void registrarCursosOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCursosOPC1ActionPerformed
        metodos.mostrarPaneles(iniciarSesionPanel, crearCuentaPanel, registrarStudentPanel, asignarCursosEstudiantePanel, registrarCursosPanel);
    }//GEN-LAST:event_registrarCursosOPC1ActionPerformed

    private void buscarEstudianteOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEstudianteOPC1ActionPerformed
        InterfaceEstudents GUIEst = new InterfaceEstudents();
        GUIEst.setVisible(true);
    }//GEN-LAST:event_buscarEstudianteOPC1ActionPerformed

    private void crearCuentaOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaOPC1ActionPerformed
        metodos.mostrarPaneles(iniciarSesionPanel, registrarStudentPanel, asignarCursosEstudiantePanel,registrarCursosPanel, crearCuentaPanel);
    }//GEN-LAST:event_crearCuentaOPC1ActionPerformed

    private void iniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionButtonActionPerformed
        if (!nombreTField.getText().isEmpty() && !correoTField.getText().isEmpty() && !passwdTField.getText().isEmpty()) {
            usuario = nombreTField.getText();
            correoSesion = correoTField.getText();
            char[] passwdSessionChar = passwdTField.getPassword();
            passwdSesion = new String(passwdSessionChar);
            int normal_User = 0;
            int admin_User = 0;
            
            try {
                for (Object[] x : Metodos.Conexion_Principal.getConexionEstudiantes("SELECT * FROM passwords WHERE Usuario='" + usuario + "'AND Correo='" + correoSesion + "'AND Passwd='" + passwdSesion + "'")) {
                    normal_User = 1;
                    break;
                }
                
                for (Object[] x : Metodos.Conexion_Principal.getConexionEstudiantes("SELECT * FROM passwords_Admin WHERE Usuario='" + usuario + "'AND Correo='" + correoSesion + "'AND Passwd='" + passwdSesion + "'")) {
                    admin_User = 1;
                    break;
                }
            } catch (SQLException | ClassNotFoundException ex) { }
            
            if (normal_User == 1) {
                metodos.ok("Hola " + usuario + " ha iniciado sesion correctamente", "Cuenta de usuario");
                metodos.habilitarOptions(1, crearCuentaOPC1, registrarEstudianteOPC1, verCursosOPC1, registrarCursosOPC1, buscarEstudianteOPC1, asignarCursosOPC1); 
            } else if (admin_User == 1) {
                metodos.ok("Hola " + usuario + " ha iniciado sesion correctamente", "Cuenta administrativa"); 
                metodos.habilitarOptions(2, crearCuentaOPC1, registrarEstudianteOPC1, verCursosOPC1, registrarCursosOPC1, buscarEstudianteOPC1, asignarCursosOPC1); 
            } else {
                metodos.bat("Nombre de usuario, contraseña o el correo son incorrectos", "Error de cuenta");
            }
        } else { 
            metodos.rellenarCampos(); 
        }
    }//GEN-LAST:event_iniciarSesionButtonActionPerformed

    private void registrarEstudianteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEstudianteButtonActionPerformed
        if (!nombreEstTField.getText().isEmpty() && !cedulaEstudianteTField.getText().isEmpty() && !pApellidoEstTField.getText().isEmpty() && !sApellidoEstTField.getText().isEmpty() && !fechaEstTField.getText().isEmpty() && !emailEstTField.getText().isEmpty() && !telefonoEstTField.getText().isEmpty() && passwordEstTField.getPassword().length > 0) {
            String nombreEst = nombreEstTField.getText();
            String cedulaEst = cedulaEstudianteTField.getText();
            String pApellidoEst = pApellidoEstTField.getText();
            String sApellidoEst = sApellidoEstTField.getText();
            String fechaNEst = fechaEstTField.getText();
            String emailEst = emailEstTField.getText();
            String telefonoEst = telefonoEstTField.getText();
            String cursosEst = "";
            char[] passwordChar = passwordEstTField.getPassword();
            String passwordEst = new String(passwordChar);
            
            boolean estudiante_existe = false;
            
            switch (validarEntradas(emailEst, passwordEst, fechaNEst, cedulaEst, telefonoEst)) {
                case 0 -> {
                    try {
                        for (Object[] x : Metodos.Conexion_Buscar_Estudiantes.getConexionEstudiantes("SELECT * FROM estudiantes WHERE Nombre='" + nombreEst + "'AND Fecha_de_nacimiento='" + fechaNEst + "'AND Correo='" + emailEst + "'AND Cedula='" + cedulaEst + "'")) {
                            if (x != null) {
                                estudiante_existe = true;
                            }
                        }
                        
                        if (estudiante_existe == false) {
                            Metodos.Conexion_Ingresar_Estudiantes.setConexionEstudiantes(nombreEst, pApellidoEst, sApellidoEst, fechaNEst, emailEst, telefonoEst, cursosEst, passwordEst, cedulaEst);
                            metodos.ok("Estudiante registrado correctamente", "Informacion");
                        } else {
                            metodos.ok("El estudiante ya existe en la db", "Informacion");
                        }
                    } catch (SQLException | ClassNotFoundException ex) { }
                }
                
                case 1 -> {metodos.emailInvalid(); break;}
                case 2 -> {metodos.passwordInvalid(); break;}
                case 3 -> {metodos.fechaNInvalid(); break;}
                case 4 -> {metodos.cedulaInvalid(); break;}
                case 5 -> {metodos.telefonoInvalid(); break;}

            }
        } else { 
            metodos.rellenarCampos(); 
        }
    }//GEN-LAST:event_registrarEstudianteButtonActionPerformed

    private void asignarCursosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursosButtonActionPerformed
        String cedula_estudiante = cedulaEstudianteCURSOTField.getText();
        String codigo_Curso = codigoCursoTField.getText();
        String nombre_Curso = cursoAAsignarTField.getText();
        int curso_existe = 0;
        
        try {
            for (Object[] x : Metodos.Conexion_Buscar_Cursos.getConexionCursos("SELECT * FROM cursos WHERE Codigo='" + codigo_Curso + "'AND Nombre='" + nombre_Curso + "'")) {
                if (x != null) {
                    curso_existe = 1;
                }
            }
            
            switch (curso_existe) {
                case 0 -> {
                    metodos.bat("El curso no existe en la db", "Error"); break;}
                case 1 -> {
                    Metodos.Conexion_AsignarCursos_Estudiante.setConexionEstudiantes("SELECT * FROM cursos WHERE Codigo='" + codigo_Curso + "'", nombre_Curso, cedula_estudiante);
                    metodos.ok("Cursos asignados correctamente", "Informacion");
                    break;
                }
            }
        } catch (SQLException | ClassNotFoundException ex) { }
    }//GEN-LAST:event_asignarCursosButtonActionPerformed

    private void registrarCursoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCursoButtonActionPerformed
        String codigo_Curso = codigoCursoTField.getText();
        String nombre_Curso = nombreCursoTField.getText();
        int curso_existe_codigo = 0;
        int curso_existe_nombre = 0;
        
        try {
            for (Object[] x : Metodos.Conexion_Buscar_Cursos.getConexionCursos("SELECT * FROM cursos WHERE Codigo='" + codigo_Curso + "'")) {
                curso_existe_codigo = 1;
            }
            
            for (Object[] x : Metodos.Conexion_Buscar_Cursos.getConexionCursos("SELECT * FROM cursos WHERE Nombre='" + nombre_Curso + "'")) {
                curso_existe_nombre = 1;
            }
            
            if (curso_existe_codigo == 0 && curso_existe_nombre == 0) {
                Metodos.Conexion_Ingresar_Cursos.setConexionCursos(codigo_Curso, nombre_Curso);
                metodos.ok("Curso registrado correctamente", "Informacion");
            } else {
                metodos.bat("El curso ya existe en la db", "Error");
            }
        } catch (ClassNotFoundException | SQLException ex) { }
    }//GEN-LAST:event_registrarCursoButtonActionPerformed

    private void asignarCursosOPC1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursosOPC1ActionPerformed
        metodos.mostrarPaneles(iniciarSesionPanel, crearCuentaPanel, registrarStudentPanel, registrarCursosPanel, asignarCursosEstudiantePanel);
    }//GEN-LAST:event_asignarCursosOPC1ActionPerformed

    private int validarEntradas(String email, String password, String fechaNacimiento, String cedula, String telefono) {
        if (!validarEmail(email)) return 1;
        if (!validarPassword(password)) return 2;
        if (!validarFecha(fechaNacimiento)) return 3;
        if (cedula.length() >= 10) return 4;
        if (telefono.length() >= 9) return 5;

        return 0;
    }
    
    public boolean validarEmail(String emailC) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mather = pattern.matcher(emailC);
        return mather.find() == true;
    }
    
    public boolean validarPassword(String passwordC) {
        boolean contieneMayuscula = passwordC.matches(".*[A-Z].*");
        boolean contieneMinuscula = passwordC.matches(".*[a-z].*");
        boolean contieneDigito = passwordC.matches(".*\\d.*");
        boolean contieneEspecial = passwordC.matches(".*[@#$%^&+=!].*");
        boolean noContieneEspacios = !passwordC.contains(" ");
        boolean longitudMinima = passwordC.length() >= 6;
        return contieneMayuscula && contieneMinuscula && contieneDigito && contieneEspecial && noContieneEspacios && longitudMinima;
    } 
    
    public boolean validarFecha(String fecha) {
        Pattern pattern = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/(\\d{4})$");
        Matcher matcher = pattern.matcher(fecha);

        if (matcher.matches()) {
            int dia = Integer.parseInt(matcher.group(1));
            int mes = Integer.parseInt(matcher.group(2));
            int anio = Integer.parseInt(matcher.group(3));

            if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diasEnMes(mes, anio)) {
                return true;
            }
        }

        return false;
    }
    
    private int diasEnMes(int mes, int anio) {
        switch (mes) {
            case 2:
                if (anio % 4 == 0 && (anio % 100 != 0 || anio % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfaceG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfaceG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfaceG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfaceG.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfaceG().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private sistemasop.myButton asignarCursosButton;
    private javax.swing.JPanel asignarCursosEstudiantePanel;
    private sistemasop.myButton asignarCursosOPC1;
    private sistemasop.myButton buscarEstudianteOPC1;
    private javax.swing.JTextField cedulaEstudianteCURSOTField;
    private javax.swing.JTextField cedulaEstudianteTField;
    private javax.swing.JTextField codigoCURSOTField;
    private javax.swing.JTextField codigoCursoTField;
    private javax.swing.JTextField correoTField;
    private sistemasop.myButton crearCuentaButton1;
    private sistemasop.myButton crearCuentaOPC1;
    private javax.swing.JPanel crearCuentaPanel;
    private javax.swing.JTextField cursoAAsignarTField;
    private javax.swing.JTextField emailEstTField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField fechaEstTField;
    private javax.swing.JTextField idTextField;
    private sistemasop.myButton iniciarSesionButton;
    private sistemasop.myButton iniciarSesionOPC1;
    private javax.swing.JPanel iniciarSesionPanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField nombreCursoTField;
    private javax.swing.JTextField nombreEstTField;
    private javax.swing.JTextField nombreTField;
    private javax.swing.JTextField pApellidoEstTField;
    private javax.swing.JPasswordField passwdTField;
    private javax.swing.JPasswordField passwordEstTField;
    private javax.swing.JPasswordField passwordTextField;
    private sistemasop.myButton registrarCursoButton;
    private sistemasop.myButton registrarCursosOPC1;
    private javax.swing.JPanel registrarCursosPanel;
    private sistemasop.myButton registrarEstudianteButton;
    private sistemasop.myButton registrarEstudianteOPC1;
    private javax.swing.JPanel registrarStudentPanel;
    private javax.swing.JTextField sApellidoEstTField;
    private javax.swing.JTextField telefonoEstTField;
    private sistemasop.myButton verCursosOPC1;
    // End of variables declaration//GEN-END:variables
}
