package sistemasop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class InterfaceG extends javax.swing.JFrame {
    
    public int contadorCursos = 0;
    public int contadorEstudiantes = 0;
    public int id, idSesion, codigoCursos;
    public String email, emailSesion, usuario, password, nombreCursos;
    
    public DatosExistentes validar = new DatosExistentes();
    public Metodos mostrar = new Metodos();
    DefaultTableModel modeloT1 = new DefaultTableModel();
    DefaultTableModel modeloT2 = new DefaultTableModel();
    
    public static Cursos[] cursos = new Cursos[1000];
    public static DatosDEstudiante[] estudiantes = new DatosDEstudiante[1000];
    public DatosDEstudiante asignarCursos = new DatosDEstudiante();
    
    public InterfaceG() {
        initComponents();
        this.setLocationRelativeTo(this);
        
        personalizarTabla(jTableCursos, scroll, modeloT1);
        personalizarHeaderTabla(jTableCursos);
        personalizarTablaDatos(jTableDatos, scrollEstudiante, modeloT2);
        personalizarHeaderTabla(jTableDatos);
        jTableCursos.getTableHeader().setResizingAllowed(false);
        scrollEstudiante.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_NEVER);
        
        EventosTextField ecv = new EventosTextField();
        idTextField.addKeyListener(ecv);
        idSTField.addKeyListener(ecv);
        cedulaEstudianteTField.addKeyListener(ecv);
        telefonoEstTField.addKeyListener(ecv);
        codigoCursosTField.addKeyListener(ecv);
        cedulaEstudianteCURSOTField.addKeyListener(ecv);
        codigoCURSOTField.addKeyListener(ecv);

        TablaBar tab = new TablaBar();
        tab.personalizarBarraDesplazamiento(scroll);
        tab.personalizarBarraDesplazamiento(scrollEstudiante);
        mostrar.ocultarComponentes(iniciarSesionPanel, registrarDatosPanel, registrarCursosPanel, asignarCursosEstudiantePanel, buscarEstudiantePanel, registrarEstudianteOPC, asignarCursosOPC, verCursosOPC, buscarEstudianteOPC);
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
        jPanel10 = new javax.swing.JPanel();
        iniciarSesionOPC = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        crearCuentaOPC = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        verCursosOPC = new javax.swing.JButton();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        buscarEstudianteOPC = new javax.swing.JButton();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        asignarCursosOPC = new javax.swing.JButton();
        jLabel66 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        registrarEstudianteOPC = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        iniciarSesionPanel = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        iniciarSesionButton = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        emailSTField = new javax.swing.JTextField();
        jPanel23 = new javax.swing.JPanel();
        idSTField = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        nombreTField = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        buscarEstudiantePanel = new javax.swing.JPanel();
        jLabel71 = new javax.swing.JLabel();
        jPanel42 = new javax.swing.JPanel();
        verDatosButton = new javax.swing.JButton();
        jLabel72 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jPanel44 = new javax.swing.JPanel();
        nombreEstudianteBuscarTField = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        jPanel47 = new javax.swing.JPanel();
        jLabel99 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        scrollEstudiante = new javax.swing.JScrollPane();
        jTableDatos = new javax.swing.JTable();
        jLabel100 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        registrarDatosPanel = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        registrarEstudianteButton = new javax.swing.JButton();
        jLabel56 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        nombreEstTField = new javax.swing.JTextField();
        jLabel73 = new javax.swing.JLabel();
        jPanel33 = new javax.swing.JPanel();
        cedulaEstudianteTField = new javax.swing.JTextField();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jPanel34 = new javax.swing.JPanel();
        pApellidoEstTField = new javax.swing.JTextField();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        sApellidoEstTField = new javax.swing.JTextField();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jPanel36 = new javax.swing.JPanel();
        fechaEstTField = new javax.swing.JTextField();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jPanel37 = new javax.swing.JPanel();
        emailEstTField = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jPanel38 = new javax.swing.JPanel();
        passwordEstTField = new javax.swing.JPasswordField();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jPanel39 = new javax.swing.JPanel();
        telefonoEstTField = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
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
        asignarCursosEstudiantePanel = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        asignarCursosButton = new javax.swing.JButton();
        jLabel68 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jPanel43 = new javax.swing.JPanel();
        cedulaEstudianteCURSOTField = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jPanel46 = new javax.swing.JPanel();
        codigoCURSOTField = new javax.swing.JTextField();
        jLabel98 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jPanel50 = new javax.swing.JPanel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jPanel51 = new javax.swing.JPanel();
        nombreCURSOTField = new javax.swing.JTextField();
        jLabel109 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        registrarCursosPanel = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        registrarCursoButton = new javax.swing.JButton();
        jLabel61 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        codigoCursosTField = new javax.swing.JTextField();
        jLabel90 = new javax.swing.JLabel();
        jPanel41 = new javax.swing.JPanel();
        nombreCursosTField = new javax.swing.JTextField();
        jLabel62 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel63 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        jTableCursos = new javax.swing.JTable();
        jLabel65 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        crearCuentaPanel = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        passwordTextField = new javax.swing.JPasswordField();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        emailTextField = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        idTextField = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        crearCuentaButton = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(52, 53, 65));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(36, 39, 46));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(36, 39, 46));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/userLOGINAvatar.png"))); // NOI18N
        jPanel7.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 100));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 130, 110));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 10, -1, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(149, 80, -1, 40));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 40));

        jPanel8.setBackground(new java.awt.Color(36, 39, 46));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 10, 60));

        jPanel9.setBackground(new java.awt.Color(36, 39, 46));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 10, 60));

        jPanel10.setBackground(new java.awt.Color(36, 39, 46));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSesionOPC.setBackground(new java.awt.Color(248, 239, 229));
        iniciarSesionOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        iniciarSesionOPC.setForeground(new java.awt.Color(204, 204, 204));
        iniciarSesionOPC.setText("Iniciar Sesión");
        iniciarSesionOPC.setBorder(null);
        iniciarSesionOPC.setBorderPainted(false);
        iniciarSesionOPC.setContentAreaFilled(false);
        iniciarSesionOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionOPC.setFocusPainted(false);
        iniciarSesionOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        iniciarSesionOPC.setRequestFocusEnabled(false);
        iniciarSesionOPC.setVerifyInputWhenFocusTarget(false);
        iniciarSesionOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionOPCActionPerformed(evt);
            }
        });
        jPanel10.add(iniciarSesionOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 130, 40));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, 40));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, 40));

        jPanel11.setBackground(new java.awt.Color(36, 39, 46));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearCuentaOPC.setBackground(new java.awt.Color(248, 239, 229));
        crearCuentaOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        crearCuentaOPC.setForeground(new java.awt.Color(204, 204, 204));
        crearCuentaOPC.setText("Crear Cuenta");
        crearCuentaOPC.setBorder(null);
        crearCuentaOPC.setBorderPainted(false);
        crearCuentaOPC.setContentAreaFilled(false);
        crearCuentaOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuentaOPC.setFocusPainted(false);
        crearCuentaOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        crearCuentaOPC.setRequestFocusEnabled(false);
        crearCuentaOPC.setVerifyInputWhenFocusTarget(false);
        crearCuentaOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaOPCActionPerformed(evt);
            }
        });
        jPanel11.add(crearCuentaOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 40));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, 40));

        jPanel15.setBackground(new java.awt.Color(36, 39, 46));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verCursosOPC.setBackground(new java.awt.Color(248, 239, 229));
        verCursosOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        verCursosOPC.setForeground(new java.awt.Color(204, 204, 204));
        verCursosOPC.setText("Registrar Cursos");
        verCursosOPC.setBorder(null);
        verCursosOPC.setBorderPainted(false);
        verCursosOPC.setContentAreaFilled(false);
        verCursosOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verCursosOPC.setFocusPainted(false);
        verCursosOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        verCursosOPC.setRequestFocusEnabled(false);
        verCursosOPC.setVerifyInputWhenFocusTarget(false);
        verCursosOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verCursosOPCActionPerformed(evt);
            }
        });
        jPanel15.add(verCursosOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 40));

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 130, 40));

        jLabel51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, -1, 40));

        jLabel52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, 40));

        jPanel25.setBackground(new java.awt.Color(36, 39, 46));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buscarEstudianteOPC.setBackground(new java.awt.Color(248, 239, 229));
        buscarEstudianteOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        buscarEstudianteOPC.setForeground(new java.awt.Color(204, 204, 204));
        buscarEstudianteOPC.setText("Buscar estudiente");
        buscarEstudianteOPC.setBorder(null);
        buscarEstudianteOPC.setBorderPainted(false);
        buscarEstudianteOPC.setContentAreaFilled(false);
        buscarEstudianteOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buscarEstudianteOPC.setFocusPainted(false);
        buscarEstudianteOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buscarEstudianteOPC.setRequestFocusEnabled(false);
        buscarEstudianteOPC.setVerifyInputWhenFocusTarget(false);
        buscarEstudianteOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEstudianteOPCActionPerformed(evt);
            }
        });
        jPanel25.add(buscarEstudianteOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 130, 40));

        jLabel53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, -1, 40));

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, 40));

        jLabel64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 40));

        jPanel30.setBackground(new java.awt.Color(36, 39, 46));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignarCursosOPC.setBackground(new java.awt.Color(248, 239, 229));
        asignarCursosOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        asignarCursosOPC.setForeground(new java.awt.Color(204, 204, 204));
        asignarCursosOPC.setText("Asignar Cursos");
        asignarCursosOPC.setBorder(null);
        asignarCursosOPC.setBorderPainted(false);
        asignarCursosOPC.setContentAreaFilled(false);
        asignarCursosOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignarCursosOPC.setFocusPainted(false);
        asignarCursosOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        asignarCursosOPC.setRequestFocusEnabled(false);
        asignarCursosOPC.setVerifyInputWhenFocusTarget(false);
        asignarCursosOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursosOPCActionPerformed(evt);
            }
        });
        jPanel30.add(asignarCursosOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 40));

        jPanel1.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 130, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, 40));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa.png"))); // NOI18N
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, 40));

        jPanel12.setBackground(new java.awt.Color(36, 39, 46));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarEstudianteOPC.setBackground(new java.awt.Color(248, 239, 229));
        registrarEstudianteOPC.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        registrarEstudianteOPC.setForeground(new java.awt.Color(204, 204, 204));
        registrarEstudianteOPC.setText("Ingresar estudiante");
        registrarEstudianteOPC.setBorder(null);
        registrarEstudianteOPC.setBorderPainted(false);
        registrarEstudianteOPC.setContentAreaFilled(false);
        registrarEstudianteOPC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarEstudianteOPC.setFocusPainted(false);
        registrarEstudianteOPC.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registrarEstudianteOPC.setRequestFocusEnabled(false);
        registrarEstudianteOPC.setVerifyInputWhenFocusTarget(false);
        registrarEstudianteOPC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEstudianteOPCActionPerformed(evt);
            }
        });
        jPanel12.add(registrarEstudianteOPC, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 40));

        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 130, 40));

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRosa - copia.png"))); // NOI18N
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, -1, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 450));

        jPanel2.setBackground(new java.awt.Color(36, 39, 46));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSesionPanel.setBackground(new java.awt.Color(36, 39, 46));
        iniciarSesionPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 40));

        jPanel14.setBackground(new java.awt.Color(232, 76, 96));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        iniciarSesionButton.setBackground(new java.awt.Color(51, 51, 51));
        iniciarSesionButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        iniciarSesionButton.setForeground(new java.awt.Color(255, 255, 255));
        iniciarSesionButton.setText("Iniciar Sesión");
        iniciarSesionButton.setBorder(null);
        iniciarSesionButton.setBorderPainted(false);
        iniciarSesionButton.setContentAreaFilled(false);
        iniciarSesionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        iniciarSesionButton.setFocusPainted(false);
        iniciarSesionButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        iniciarSesionButton.setRequestFocusEnabled(false);
        iniciarSesionButton.setVerifyInputWhenFocusTarget(false);
        iniciarSesionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarSesionButtonActionPerformed(evt);
            }
        });
        jPanel14.add(iniciarSesionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 40));

        iniciarSesionPanel.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 40));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 40));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel21.setBackground(new java.awt.Color(52, 53, 65));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel38.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(204, 204, 204));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setText("Iniciar sesión en la cuenta");
        jPanel21.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        iniciarSesionPanel.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel43.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(204, 204, 204));
        jLabel43.setText("ID de la cuenta ");
        iniciarSesionPanel.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 40));

        jLabel44.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(204, 204, 204));
        jLabel44.setText("Nombre de usuario");
        iniciarSesionPanel.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 40));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 40));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 40));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 40));

        jLabel47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 40));

        jPanel22.setBackground(new java.awt.Color(52, 53, 65));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailSTField.setBackground(new java.awt.Color(52, 53, 65));
        emailSTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        emailSTField.setForeground(new java.awt.Color(204, 204, 204));
        emailSTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailSTField.setBorder(null);
        emailSTField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailSTField.setOpaque(true);
        jPanel22.add(emailSTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        iniciarSesionPanel.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 250, 40));

        jPanel23.setBackground(new java.awt.Color(52, 53, 65));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idSTField.setBackground(new java.awt.Color(52, 53, 65));
        idSTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        idSTField.setForeground(new java.awt.Color(204, 204, 204));
        idSTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idSTField.setBorder(null);
        idSTField.setCaretColor(new java.awt.Color(204, 204, 204));
        idSTField.setOpaque(true);
        jPanel23.add(idSTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        iniciarSesionPanel.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 250, 40));

        jLabel48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 40));

        jPanel24.setBackground(new java.awt.Color(52, 53, 65));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreTField.setBackground(new java.awt.Color(52, 53, 65));
        nombreTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nombreTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreTField.setBorder(null);
        nombreTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreTField.setOpaque(true);
        jPanel24.add(nombreTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        iniciarSesionPanel.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, 40));

        jLabel49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        iniciarSesionPanel.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 40));

        jLabel50.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(204, 204, 204));
        jLabel50.setText("Correo Electronico");
        iniciarSesionPanel.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 40));

        jPanel2.add(iniciarSesionPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        buscarEstudiantePanel.setBackground(new java.awt.Color(36, 39, 46));
        buscarEstudiantePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, 40));

        jPanel42.setBackground(new java.awt.Color(232, 76, 96));
        jPanel42.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        verDatosButton.setBackground(new java.awt.Color(51, 51, 51));
        verDatosButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        verDatosButton.setForeground(new java.awt.Color(255, 255, 255));
        verDatosButton.setText("Buscar");
        verDatosButton.setBorder(null);
        verDatosButton.setBorderPainted(false);
        verDatosButton.setContentAreaFilled(false);
        verDatosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        verDatosButton.setFocusPainted(false);
        verDatosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        verDatosButton.setRequestFocusEnabled(false);
        verDatosButton.setVerifyInputWhenFocusTarget(false);
        verDatosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verDatosButtonActionPerformed(evt);
            }
        });
        jPanel42.add(verDatosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        buscarEstudiantePanel.add(jPanel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 120, 40));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 40));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 40));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, 40));

        jPanel44.setBackground(new java.awt.Color(52, 53, 65));
        jPanel44.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstudianteBuscarTField.setBackground(new java.awt.Color(52, 53, 65));
        nombreEstudianteBuscarTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nombreEstudianteBuscarTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreEstudianteBuscarTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEstudianteBuscarTField.setBorder(null);
        nombreEstudianteBuscarTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreEstudianteBuscarTField.setOpaque(true);
        jPanel44.add(nombreEstudianteBuscarTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        buscarEstudiantePanel.add(jPanel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 260, 40));

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel47.setBackground(new java.awt.Color(52, 53, 65));
        jPanel47.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel99.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(204, 204, 204));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Ver datos del estudiante");
        jPanel47.add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        buscarEstudiantePanel.add(jPanel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jPanel4.setBackground(new java.awt.Color(52, 53, 65));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scrollEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 39, 46), 3));

        jTableDatos.setBackground(new java.awt.Color(36, 39, 46));
        jTableDatos.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jTableDatos.setForeground(new java.awt.Color(204, 204, 204));
        jTableDatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableDatos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTableDatos.setFocusable(false);
        jTableDatos.setGridColor(new java.awt.Color(36, 39, 46));
        jTableDatos.setOpaque(false);
        jTableDatos.setRequestFocusEnabled(false);
        jTableDatos.setRowHeight(30);
        jTableDatos.setSelectionBackground(new java.awt.Color(52, 53, 65));
        jTableDatos.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTableDatos.setShowGrid(false);
        jTableDatos.setVerifyInputWhenFocusTarget(false);
        scrollEstudiante.setViewportView(jTableDatos);

        jPanel4.add(scrollEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 425, 240));

        buscarEstudiantePanel.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 440, 255));

        jLabel100.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        buscarEstudiantePanel.add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Nombre del estudiante");
        buscarEstudiantePanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 20));

        jPanel2.add(buscarEstudiantePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        registrarDatosPanel.setBackground(new java.awt.Color(36, 39, 46));
        registrarDatosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        registrarDatosPanel.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 40));

        jPanel26.setBackground(new java.awt.Color(232, 76, 96));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarEstudianteButton.setBackground(new java.awt.Color(51, 51, 51));
        registrarEstudianteButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        registrarEstudianteButton.setForeground(new java.awt.Color(255, 255, 255));
        registrarEstudianteButton.setText("Guardar datos");
        registrarEstudianteButton.setBorder(null);
        registrarEstudianteButton.setBorderPainted(false);
        registrarEstudianteButton.setContentAreaFilled(false);
        registrarEstudianteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarEstudianteButton.setFocusPainted(false);
        registrarEstudianteButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarEstudianteButton.setRequestFocusEnabled(false);
        registrarEstudianteButton.setVerifyInputWhenFocusTarget(false);
        registrarEstudianteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEstudianteButtonActionPerformed(evt);
            }
        });
        jPanel26.add(registrarEstudianteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 40));

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 40));

        jLabel69.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, 40));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, 40));

        jPanel31.setBackground(new java.awt.Color(52, 53, 65));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreEstTField.setBackground(new java.awt.Color(52, 53, 65));
        nombreEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nombreEstTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreEstTField.setBorder(null);
        nombreEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreEstTField.setOpaque(true);
        jPanel31.add(nombreEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 190, 40));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, 40));

        jPanel33.setBackground(new java.awt.Color(52, 53, 65));
        jPanel33.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudianteTField.setBackground(new java.awt.Color(52, 53, 65));
        cedulaEstudianteTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        cedulaEstudianteTField.setForeground(new java.awt.Color(204, 204, 204));
        cedulaEstudianteTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaEstudianteTField.setBorder(null);
        cedulaEstudianteTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaEstudianteTField.setOpaque(true);
        jPanel33.add(cedulaEstudianteTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 130, 190, 40));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, -1, 40));

        jLabel75.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, 40));

        jPanel34.setBackground(new java.awt.Color(52, 53, 65));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pApellidoEstTField.setBackground(new java.awt.Color(52, 53, 65));
        pApellidoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        pApellidoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        pApellidoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        pApellidoEstTField.setBorder(null);
        pApellidoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        pApellidoEstTField.setOpaque(true);
        jPanel34.add(pApellidoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 190, 40));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, -1, 40));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, -1, 40));

        jPanel35.setBackground(new java.awt.Color(52, 53, 65));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sApellidoEstTField.setBackground(new java.awt.Color(52, 53, 65));
        sApellidoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        sApellidoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        sApellidoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        sApellidoEstTField.setBorder(null);
        sApellidoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        sApellidoEstTField.setOpaque(true);
        jPanel35.add(sApellidoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 190, 190, 40));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, 40));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, 40));

        jPanel36.setBackground(new java.awt.Color(52, 53, 65));
        jPanel36.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fechaEstTField.setBackground(new java.awt.Color(52, 53, 65));
        fechaEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        fechaEstTField.setForeground(new java.awt.Color(204, 204, 204));
        fechaEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        fechaEstTField.setBorder(null);
        fechaEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        fechaEstTField.setOpaque(true);
        jPanel36.add(fechaEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 190, 40));

        jLabel80.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, -1, 40));

        jLabel81.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, -1, 40));

        jPanel37.setBackground(new java.awt.Color(52, 53, 65));
        jPanel37.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailEstTField.setBackground(new java.awt.Color(52, 53, 65));
        emailEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        emailEstTField.setForeground(new java.awt.Color(204, 204, 204));
        emailEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailEstTField.setBorder(null);
        emailEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailEstTField.setOpaque(true);
        jPanel37.add(emailEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 190, 40));

        jLabel82.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, -1, 40));

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, -1, 40));

        jPanel38.setBackground(new java.awt.Color(52, 53, 65));
        jPanel38.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordEstTField.setBackground(new java.awt.Color(52, 53, 65));
        passwordEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        passwordEstTField.setForeground(new java.awt.Color(204, 204, 204));
        passwordEstTField.setToolTipText("");
        passwordEstTField.setBorder(null);
        passwordEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        passwordEstTField.setVerifyInputWhenFocusTarget(false);
        jPanel38.add(passwordEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 190, 40));

        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, 40));

        jLabel85.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, 40));

        jPanel39.setBackground(new java.awt.Color(52, 53, 65));
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefonoEstTField.setBackground(new java.awt.Color(52, 53, 65));
        telefonoEstTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        telefonoEstTField.setForeground(new java.awt.Color(204, 204, 204));
        telefonoEstTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        telefonoEstTField.setBorder(null);
        telefonoEstTField.setCaretColor(new java.awt.Color(204, 204, 204));
        telefonoEstTField.setOpaque(true);
        jPanel39.add(telefonoEstTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 40));

        registrarDatosPanel.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 190, 40));

        jLabel86.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, 40));

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarDatosPanel.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel27.setBackground(new java.awt.Color(52, 53, 65));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel58.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(204, 204, 204));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("Registro de datos de usuario");
        jPanel27.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        registrarDatosPanel.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarDatosPanel.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel2.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre");
        registrarDatosPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 120, 20));

        jLabel3.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Numero de cedula");
        registrarDatosPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 120, 20));

        jLabel4.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("Primer Apellido");
        registrarDatosPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 120, 20));

        jLabel5.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Segundo Apellido");
        registrarDatosPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 120, 20));

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Fecha de nacimiento dd/mm/yyyy");
        registrarDatosPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 170, 20));

        jLabel7.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("Numero de teléfono");
        registrarDatosPanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 120, 20));

        jLabel17.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 153, 153));
        jLabel17.setText("Contraseña");
        registrarDatosPanel.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 120, 20));

        jLabel18.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 153, 153));
        jLabel18.setText("Correo electrónico");
        registrarDatosPanel.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 120, 20));

        jPanel2.add(registrarDatosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        asignarCursosEstudiantePanel.setBackground(new java.awt.Color(36, 39, 46));
        asignarCursosEstudiantePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, 40));

        jPanel32.setBackground(new java.awt.Color(232, 76, 96));
        jPanel32.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        asignarCursosButton.setBackground(new java.awt.Color(51, 51, 51));
        asignarCursosButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        asignarCursosButton.setForeground(new java.awt.Color(255, 255, 255));
        asignarCursosButton.setText("Asignar curso");
        asignarCursosButton.setBorder(null);
        asignarCursosButton.setBorderPainted(false);
        asignarCursosButton.setContentAreaFilled(false);
        asignarCursosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        asignarCursosButton.setFocusPainted(false);
        asignarCursosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        asignarCursosButton.setRequestFocusEnabled(false);
        asignarCursosButton.setVerifyInputWhenFocusTarget(false);
        asignarCursosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asignarCursosButtonActionPerformed(evt);
            }
        });
        jPanel32.add(asignarCursosButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 190, 40));

        asignarCursosEstudiantePanel.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 190, 40));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, 40));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 40));

        jPanel43.setBackground(new java.awt.Color(52, 53, 65));
        jPanel43.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cedulaEstudianteCURSOTField.setBackground(new java.awt.Color(52, 53, 65));
        cedulaEstudianteCURSOTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        cedulaEstudianteCURSOTField.setForeground(new java.awt.Color(204, 204, 204));
        cedulaEstudianteCURSOTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        cedulaEstudianteCURSOTField.setBorder(null);
        cedulaEstudianteCURSOTField.setCaretColor(new java.awt.Color(204, 204, 204));
        cedulaEstudianteCURSOTField.setOpaque(true);
        jPanel43.add(cedulaEstudianteCURSOTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        asignarCursosEstudiantePanel.add(jPanel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 420, 40));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 160, -1, 40));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, 40));

        jPanel46.setBackground(new java.awt.Color(52, 53, 65));
        jPanel46.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoCURSOTField.setBackground(new java.awt.Color(52, 53, 65));
        codigoCURSOTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        codigoCURSOTField.setForeground(new java.awt.Color(204, 204, 204));
        codigoCURSOTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoCURSOTField.setBorder(null);
        codigoCURSOTField.setCaretColor(new java.awt.Color(204, 204, 204));
        codigoCURSOTField.setOpaque(true);
        jPanel46.add(codigoCURSOTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        asignarCursosEstudiantePanel.add(jPanel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 420, 40));

        jLabel98.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, 40));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel50.setBackground(new java.awt.Color(52, 53, 65));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel106.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(204, 204, 204));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("Asignar cursos a un estudiante");
        jPanel50.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        asignarCursosEstudiantePanel.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 280, -1, 40));

        jPanel51.setBackground(new java.awt.Color(52, 53, 65));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCURSOTField.setBackground(new java.awt.Color(52, 53, 65));
        nombreCURSOTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nombreCURSOTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreCURSOTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreCURSOTField.setBorder(null);
        nombreCURSOTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreCURSOTField.setOpaque(true);
        jPanel51.add(nombreCURSOTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        asignarCursosEstudiantePanel.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 420, 40));

        jLabel109.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        asignarCursosEstudiantePanel.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, 40));

        jLabel95.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(153, 153, 153));
        jLabel95.setText("Numero de cédula del estudiante");
        asignarCursosEstudiantePanel.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 170, 20));

        jLabel101.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(153, 153, 153));
        jLabel101.setText("Código del curso");
        asignarCursosEstudiantePanel.add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 120, 20));

        jLabel102.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(153, 153, 153));
        jLabel102.setText("Nombre del curso");
        asignarCursosEstudiantePanel.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 120, 20));

        jPanel2.add(asignarCursosEstudiantePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        registrarCursosPanel.setBackground(new java.awt.Color(36, 39, 46));
        registrarCursosPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        registrarCursosPanel.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, -1, 40));

        jPanel28.setBackground(new java.awt.Color(232, 76, 96));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarCursoButton.setBackground(new java.awt.Color(51, 51, 51));
        registrarCursoButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        registrarCursoButton.setForeground(new java.awt.Color(255, 255, 255));
        registrarCursoButton.setText("Registrar");
        registrarCursoButton.setBorder(null);
        registrarCursoButton.setBorderPainted(false);
        registrarCursoButton.setContentAreaFilled(false);
        registrarCursoButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registrarCursoButton.setFocusPainted(false);
        registrarCursoButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        registrarCursoButton.setRequestFocusEnabled(false);
        registrarCursoButton.setVerifyInputWhenFocusTarget(false);
        registrarCursoButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarCursoButtonActionPerformed(evt);
            }
        });
        jPanel28.add(registrarCursoButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 40));

        registrarCursosPanel.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 120, 40));

        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        registrarCursosPanel.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, 40));

        jLabel87.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarCursosPanel.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, 40));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarCursosPanel.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, -1, 40));

        jPanel40.setBackground(new java.awt.Color(52, 53, 65));
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoCursosTField.setBackground(new java.awt.Color(52, 53, 65));
        codigoCursosTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        codigoCursosTField.setForeground(new java.awt.Color(204, 204, 204));
        codigoCursosTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        codigoCursosTField.setBorder(null);
        codigoCursosTField.setCaretColor(new java.awt.Color(204, 204, 204));
        codigoCursosTField.setOpaque(true);
        jPanel40.add(codigoCursosTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 40));

        registrarCursosPanel.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 260, 40));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarCursosPanel.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, -1, 40));

        jPanel41.setBackground(new java.awt.Color(52, 53, 65));
        jPanel41.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nombreCursosTField.setBackground(new java.awt.Color(52, 53, 65));
        nombreCursosTField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        nombreCursosTField.setForeground(new java.awt.Color(204, 204, 204));
        nombreCursosTField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nombreCursosTField.setBorder(null);
        nombreCursosTField.setCaretColor(new java.awt.Color(204, 204, 204));
        nombreCursosTField.setOpaque(true);
        jPanel41.add(nombreCursosTField, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 40));

        registrarCursosPanel.add(jPanel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 420, 40));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarCursosPanel.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel29.setBackground(new java.awt.Color(52, 53, 65));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel63.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(204, 204, 204));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("Registro de cursos");
        jPanel29.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        registrarCursosPanel.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jPanel3.setBackground(new java.awt.Color(52, 53, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        scroll.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(36, 39, 46), 3));

        jTableCursos.setBackground(new java.awt.Color(36, 39, 46));
        jTableCursos.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jTableCursos.setForeground(new java.awt.Color(204, 204, 204));
        jTableCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableCursos.setFocusable(false);
        jTableCursos.setGridColor(new java.awt.Color(36, 39, 46));
        jTableCursos.setOpaque(false);
        jTableCursos.setRequestFocusEnabled(false);
        jTableCursos.setRowHeight(30);
        jTableCursos.setRowSelectionAllowed(false);
        jTableCursos.setSelectionBackground(new java.awt.Color(36, 39, 46));
        jTableCursos.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jTableCursos.setShowGrid(false);
        jTableCursos.setUpdateSelectionOnSort(false);
        jTableCursos.setVerifyInputWhenFocusTarget(false);
        scroll.setViewportView(jTableCursos);

        jPanel3.add(scroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 8, 425, 185));

        registrarCursosPanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 440, 200));

        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        registrarCursosPanel.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        registrarCursosPanel.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 40));

        jLabel21.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(153, 153, 153));
        jLabel21.setText("Nombre del curso");
        registrarCursosPanel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 120, 20));

        jLabel22.setFont(new java.awt.Font("Gill Sans MT", 0, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(153, 153, 153));
        jLabel22.setText("Código del curso");
        registrarCursosPanel.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 120, 20));

        jPanel2.add(registrarCursosPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        crearCuentaPanel.setBackground(new java.awt.Color(36, 39, 46));
        crearCuentaPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        crearCuentaPanel.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, -1, 40));

        jLabel26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        crearCuentaPanel.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, -1, 40));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        crearCuentaPanel.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, -1, 40));

        jPanel16.setBackground(new java.awt.Color(52, 53, 65));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        passwordTextField.setBackground(new java.awt.Color(52, 53, 65));
        passwordTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        passwordTextField.setForeground(new java.awt.Color(204, 204, 204));
        passwordTextField.setBorder(null);
        passwordTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        jPanel16.add(passwordTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        crearCuentaPanel.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 250, 40));

        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, 40));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 40));

        jPanel17.setBackground(new java.awt.Color(52, 53, 65));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        emailTextField.setBackground(new java.awt.Color(52, 53, 65));
        emailTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        emailTextField.setForeground(new java.awt.Color(204, 204, 204));
        emailTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        emailTextField.setBorder(null);
        emailTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        emailTextField.setOpaque(true);
        jPanel17.add(emailTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        crearCuentaPanel.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 250, 40));

        jPanel18.setBackground(new java.awt.Color(52, 53, 65));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        idTextField.setBackground(new java.awt.Color(52, 53, 65));
        idTextField.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        idTextField.setForeground(new java.awt.Color(204, 204, 204));
        idTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        idTextField.setBorder(null);
        idTextField.setCaretColor(new java.awt.Color(204, 204, 204));
        idTextField.setOpaque(true);
        jPanel18.add(idTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 230, 40));

        crearCuentaPanel.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 250, 40));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, 40));

        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo.png"))); // NOI18N
        crearCuentaPanel.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, -1, 40));

        jPanel19.setBackground(new java.awt.Color(232, 76, 96));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crearCuentaButton.setBackground(new java.awt.Color(0, 0, 0));
        crearCuentaButton.setFont(new java.awt.Font("Franklin Gothic Book", 1, 16)); // NOI18N
        crearCuentaButton.setForeground(new java.awt.Color(255, 255, 255));
        crearCuentaButton.setText("Crear Cuenta");
        crearCuentaButton.setBorder(null);
        crearCuentaButton.setBorderPainted(false);
        crearCuentaButton.setContentAreaFilled(false);
        crearCuentaButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        crearCuentaButton.setFocusPainted(false);
        crearCuentaButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearCuentaButton.setRequestFocusEnabled(false);
        crearCuentaButton.setVerifyInputWhenFocusTarget(false);
        crearCuentaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCuentaButtonActionPerformed(evt);
            }
        });
        jPanel19.add(crearCuentaButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 40));

        crearCuentaPanel.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, 160, 40));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasRojo - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, 40));

        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco.png"))); // NOI18N
        crearCuentaPanel.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 40));

        jPanel20.setBackground(new java.awt.Color(52, 53, 65));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setFont(new java.awt.Font("Franklin Gothic Book", 1, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(204, 204, 204));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setText("Crear cuenta de usuario");
        jPanel20.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 390, 40));

        crearCuentaPanel.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 420, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/esquinasRedondeadasBlanco - copia.png"))); // NOI18N
        crearCuentaPanel.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, 40));

        jLabel40.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(204, 204, 204));
        jLabel40.setText("ID de la cuenta ");
        crearCuentaPanel.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 140, 40));

        jLabel41.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(204, 204, 204));
        jLabel41.setText("Contraseña");
        crearCuentaPanel.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 140, 40));

        jLabel42.setFont(new java.awt.Font("Franklin Gothic Book", 0, 16)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(204, 204, 204));
        jLabel42.setText("Correo Electronico");
        crearCuentaPanel.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 140, 40));

        jPanel2.add(crearCuentaPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 450));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, -1, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void personalizarTabla(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(52,53,65));
        modelo.addColumn("Código");
        modelo.addColumn("Nombre del curso");
        table.setModel(modelo);
    }
    
    public void personalizarTablaCursosEstudiante(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(52,53,65));
        modelo.addColumn("Código");
        modelo.addColumn("Nombre del curso");
        table.setModel(modelo);
    }
    
    public void personalizarTablaDatos(JTable table, JScrollPane scroll, DefaultTableModel modelo) {
        scroll.getViewport().setBackground(new Color(255,255,255));
        modelo.addColumn("Nombre");
        modelo.addColumn("Cédula");
        modelo.addColumn("Primer Apellido");
        modelo.addColumn("Segundo Apellido");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Correo");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Contraseña");
        modelo.addColumn("Cursos");
        
        table.setModel(modelo);
        table.getColumnModel().getColumn(0).setPreferredWidth(100);
        table.getColumnModel().getColumn(1).setPreferredWidth(100);
        table.getColumnModel().getColumn(2).setPreferredWidth(130);
        table.getColumnModel().getColumn(3).setPreferredWidth(140);
        table.getColumnModel().getColumn(4).setPreferredWidth(160);
        table.getColumnModel().getColumn(5).setPreferredWidth(100);
        table.getColumnModel().getColumn(6).setPreferredWidth(100);
        table.getColumnModel().getColumn(7).setPreferredWidth(100);
        table.getColumnModel().getColumn(8).setPreferredWidth(200);
    }
    
    public void personalizarHeaderTabla(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setBackground(new Color(204,204,204));
        header.setForeground(new Color(36,39,46));
        header.getHeight();
        header.setBorder(new LineBorder(new Color(52,53,65), 1));
        header.setFont(new Font("Franklin Gothic Book", Font.PLAIN, 16));
        Dimension headerDimension = header.getPreferredSize();
        headerDimension.height = 30;
        header.setPreferredSize(headerDimension);
        header.setDefaultRenderer(new Tabla());
        
    }
    
    private void iniciarSesionOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionOPCActionPerformed
        mostrar.mostrarPaneles(crearCuentaPanel, registrarDatosPanel, registrarCursosPanel, asignarCursosEstudiantePanel, buscarEstudiantePanel, iniciarSesionPanel);
    }//GEN-LAST:event_iniciarSesionOPCActionPerformed

    private void crearCuentaOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaOPCActionPerformed
        mostrar.mostrarPaneles(iniciarSesionPanel, registrarDatosPanel, registrarCursosPanel, asignarCursosEstudiantePanel, buscarEstudiantePanel, crearCuentaPanel);
    }//GEN-LAST:event_crearCuentaOPCActionPerformed

    private void crearCuentaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCuentaButtonActionPerformed
        id = Integer.parseInt(idTextField.getText());
        email = emailTextField.getText();
        char[] passwordChar = passwordTextField.getPassword();
        password = new String(passwordChar);

        if (validar.buscarIdExistente(id)) {
            JOptionPane.showMessageDialog(null, "El ID ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (validar.buscarEmailExistente(email)) {
            JOptionPane.showMessageDialog(null, "El correo electrónico ya existe", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (validarEmail(email)) {
            
            if (validarPassword(password)) {
                String datosAGuardar = id + "|" + email + "|" + password;
                try {
                    FileWriter fileWriter = new FileWriter("datos.txt", true);
                    fileWriter.write(datosAGuardar + System.lineSeparator());
                    fileWriter.close();
                    JOptionPane.showMessageDialog(null, "Cuenta creada con éxito", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException e) { }
                
            } else { 
                mostrar.passwordInvalid();
            }
        } else { 
            mostrar.emailInvalid(); 
        }
    }//GEN-LAST:event_crearCuentaButtonActionPerformed

    private void iniciarSesionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarSesionButtonActionPerformed
        if (!nombreTField.getText().isEmpty() && !idSTField.getText().isEmpty() && !emailSTField.getText().isEmpty()) {
            usuario = nombreTField.getText();
            idSesion = Integer.parseInt(idSTField.getText());
            emailSesion = emailSTField.getText();

            if (validar.buscarIdExistente(idSesion)) {
                if (validar.buscarEmailExistente(emailSesion)) {
                    mostrar.inicioDSesion();
                    mostrar.mostrarBotones(registrarEstudianteOPC, asignarCursosOPC, verCursosOPC, buscarEstudianteOPC);
                } else {
                    mostrar.datosNoigualesID();
                }
            } else {
                mostrar.datosNoigualesEmail();
            }
        } else { 
            mostrar.rellenarCampos(); 
        }
    }//GEN-LAST:event_iniciarSesionButtonActionPerformed

    private void verCursosOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verCursosOPCActionPerformed
        mostrar.mostrarPaneles(iniciarSesionPanel, registrarDatosPanel, crearCuentaPanel, asignarCursosEstudiantePanel, buscarEstudiantePanel, registrarCursosPanel);
    }//GEN-LAST:event_verCursosOPCActionPerformed

    private void buscarEstudianteOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEstudianteOPCActionPerformed
        mostrar.mostrarPaneles(iniciarSesionPanel, registrarDatosPanel, crearCuentaPanel, asignarCursosEstudiantePanel, registrarCursosPanel, buscarEstudiantePanel);
    }//GEN-LAST:event_buscarEstudianteOPCActionPerformed

    private void registrarEstudianteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEstudianteButtonActionPerformed
        if (!nombreEstTField.getText().isEmpty() && !cedulaEstudianteTField.getText().isEmpty() && !pApellidoEstTField.getText().isEmpty() && !sApellidoEstTField.getText().isEmpty() && !fechaEstTField.getText().isEmpty() && !emailEstTField.getText().isEmpty() && !telefonoEstTField.getText().isEmpty() && passwordEstTField.getPassword().length > 0) {
            String nombreEst = nombreEstTField.getText();
            String cedulaEst = cedulaEstudianteTField.getText();
            String pApellidoEst = pApellidoEstTField.getText();
            String sApellidoEst = sApellidoEstTField.getText();
            String FechaNEst = fechaEstTField.getText();
            String emailEst = emailEstTField.getText();
            String telefonoEst = telefonoEstTField.getText();
            char[] passwordChar = passwordEstTField.getPassword();
            String passwordEst = new String(passwordChar);
            
            String hashedPassword = mostrar.hashPassword(passwordEst);
            boolean continuar = true;
            
            if (validarEmail(emailEst)) {
                if (validarPassword(passwordEst)) {
                    if (validarFecha(FechaNEst)) {
                        if (cedulaEst.length() < 10) {
                            if (telefonoEst.length() < 9) {
                                if (contadorEstudiantes != 0) {
                                    for (DatosDEstudiante datos : estudiantes) {
                                        if (datos != null && datos.getCedula().equals(cedulaEst)) {
                                            continuar = false;
                                            break;
                                        }
                                    }
                                }

                                if (continuar == true) {
                                     DatosDEstudiante datos = new DatosDEstudiante();
                                     datos.DatosDEstudiante(cedulaEst, telefonoEst, nombreEst, pApellidoEst, sApellidoEst, FechaNEst, emailEst, hashedPassword);
                                     estudiantes[contadorEstudiantes] = datos;
                                     contadorEstudiantes++;
                                     mostrar.registroEstudianteExitoso();
                                } else { mostrar.estudiantesIguales(); }
                            } else {
                                mostrar.telefonoInvalid();
                            }
                        } else {
                            mostrar.cedulaInvalid();
                        }            
                    } else { 
                        mostrar.fechaNInvalid();
                    }
                } else { 
                    mostrar.passwordInvalid(); 
                }
            } else { 
                mostrar.emailInvalid(); 
            }
        } else { 
            mostrar.rellenarCampos(); 
        }
    }//GEN-LAST:event_registrarEstudianteButtonActionPerformed

    private void registrarCursoButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarCursoButtonActionPerformed
        if (!nombreCursosTField.getText().isEmpty() && !codigoCursosTField.getText().isEmpty()) {
            String nombreCursos = nombreCursosTField.getText();
            String codigoCursos = codigoCursosTField.getText();
            Cursos CcursoEncontrado = null;
            Cursos NcursoEncontrado = null;
            
            if (codigoCursos.length() < 7) {
                Cursos cursoARegistrar = new Cursos();
                
                for (Cursos cursosExiste : cursos) {
                    if (cursosExiste != null) {
                        if (cursosExiste.getCodigoCursos().equals(codigoCursos)) {
                            CcursoEncontrado = cursosExiste;
                        }
                    }
                }
                
                for (Cursos cursosExiste : cursos) {
                    if (cursosExiste != null) {
                        if (cursosExiste.getNombreCursos().equals(nombreCursos)) {
                            NcursoEncontrado = cursosExiste;
                        }
                    }
                }
                
                if (CcursoEncontrado == null && NcursoEncontrado == null) {   
                    cursoARegistrar.Cursos(codigoCursos, nombreCursos);
                    cursos[contadorCursos] = cursoARegistrar;
                    contadorCursos++;

                    for (Cursos cursosMostrar : cursos) {
                        if (cursosMostrar != null) {
                            mostrar.registroCursoExitoso();
                            mostrar.vaciarRows(modeloT1);
                            Object[] rowData = {cursosMostrar.getCodigoCursos(), cursosMostrar.getNombreCursos()};
                            modeloT1.addRow(rowData);
                        }
                    }
                } else {
                    mostrar.cursoExiste();
                }
            } else {
                mostrar.codigoExtenso();
            }
        } else { 
            mostrar.rellenarCampos(); 
        }
    }//GEN-LAST:event_registrarCursoButtonActionPerformed

    private void asignarCursosOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursosOPCActionPerformed
        mostrar.mostrarPaneles(iniciarSesionPanel, crearCuentaPanel, registrarCursosPanel, registrarDatosPanel, buscarEstudiantePanel, asignarCursosEstudiantePanel);
    }//GEN-LAST:event_asignarCursosOPCActionPerformed

    private void registrarEstudianteOPCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEstudianteOPCActionPerformed
        mostrar.mostrarPaneles(iniciarSesionPanel, crearCuentaPanel, registrarCursosPanel, asignarCursosEstudiantePanel, buscarEstudiantePanel, registrarDatosPanel);
    }//GEN-LAST:event_registrarEstudianteOPCActionPerformed

    private void asignarCursosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asignarCursosButtonActionPerformed
        if (!cedulaEstudianteCURSOTField.getText().isEmpty() && !codigoCURSOTField.getText().isEmpty() && !nombreCURSOTField.getText().isEmpty()) {
            String cedulaCursoEstudiante = cedulaEstudianteCURSOTField.getText();
            String codigoCursoAsignar = codigoCURSOTField.getText();
            String nombreCursoAsiganr = nombreCURSOTField.getText();

            DatosDEstudiante estudianteEncontrado = null;
            Cursos cursoEncontrado = null;

            for (DatosDEstudiante datos : estudiantes) {
                if (datos != null && datos.getCedula().equals(cedulaCursoEstudiante)) {
                    estudianteEncontrado = datos;
                    break;
                }
            }

            for (Cursos curso : cursos) {
                if (curso != null && curso.getCodigoCursos().equals(codigoCursoAsignar) && curso.getNombreCursos().equals(nombreCursoAsiganr)) {
                    cursoEncontrado = curso;
                    break;
                }
            }

            if (estudianteEncontrado != null && cursoEncontrado != null) {
                estudianteEncontrado.asignarCursos(cursoEncontrado);
                mostrar.registroCursoExitoso();
            } else { 
                mostrar.cursoSinRegistrar(); 
            }
        } else { 
            mostrar.rellenarCampos();
        }
    }//GEN-LAST:event_asignarCursosButtonActionPerformed

    private void verDatosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verDatosButtonActionPerformed
        String nombreBuscado = nombreEstudianteBuscarTField.getText();

        mostrar.vaciarRows(modeloT2);
        for (DatosDEstudiante estudiante : estudiantes) {
            if (estudiante != null) {
                if (estudiante.getNombre().toLowerCase().contains(nombreBuscado.toLowerCase())) {
                    String cursosStr = "";
                    if (estudiante.cursos != null) {
                        for (Cursos curso : estudiante.getCursos()) {
                            cursosStr += curso.getCodigoCursos() + ", ";
                        }
                        cursosStr = cursosStr.substring(0, cursosStr.length() - 2);
                    } else {
                        cursosStr = "Sin cursos registrados";
                    }

                    Object[] datos = {estudiante.getNombre(), estudiante.getCedula(), estudiante.getpApellido(), estudiante.getsApellido(), estudiante.getFechaN(), estudiante.getEmail(), estudiante.getTelefono(), estudiante.getPassword(), cursosStr};
                    modeloT2.addRow(datos);
                }
            }
        }
    }//GEN-LAST:event_verDatosButtonActionPerformed

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
    private javax.swing.JButton asignarCursosButton;
    private javax.swing.JPanel asignarCursosEstudiantePanel;
    private javax.swing.JButton asignarCursosOPC;
    private javax.swing.JButton buscarEstudianteOPC;
    private javax.swing.JPanel buscarEstudiantePanel;
    private javax.swing.JTextField cedulaEstudianteCURSOTField;
    private javax.swing.JTextField cedulaEstudianteTField;
    private javax.swing.JTextField codigoCURSOTField;
    private javax.swing.JTextField codigoCursosTField;
    private javax.swing.JButton crearCuentaButton;
    private javax.swing.JButton crearCuentaOPC;
    private javax.swing.JPanel crearCuentaPanel;
    private javax.swing.JTextField emailEstTField;
    private javax.swing.JTextField emailSTField;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JTextField fechaEstTField;
    private javax.swing.JTextField idSTField;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton iniciarSesionButton;
    private javax.swing.JButton iniciarSesionOPC;
    private javax.swing.JPanel iniciarSesionPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
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
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTable jTableCursos;
    private javax.swing.JTable jTableDatos;
    private javax.swing.JTextField nombreCURSOTField;
    private javax.swing.JTextField nombreCursosTField;
    private javax.swing.JTextField nombreEstTField;
    private javax.swing.JTextField nombreEstudianteBuscarTField;
    private javax.swing.JTextField nombreTField;
    private javax.swing.JTextField pApellidoEstTField;
    private javax.swing.JPasswordField passwordEstTField;
    private javax.swing.JPasswordField passwordTextField;
    private javax.swing.JButton registrarCursoButton;
    private javax.swing.JPanel registrarCursosPanel;
    private javax.swing.JPanel registrarDatosPanel;
    private javax.swing.JButton registrarEstudianteButton;
    private javax.swing.JButton registrarEstudianteOPC;
    private javax.swing.JTextField sApellidoEstTField;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JScrollPane scrollEstudiante;
    private javax.swing.JTextField telefonoEstTField;
    private javax.swing.JButton verCursosOPC;
    private javax.swing.JButton verDatosButton;
    // End of variables declaration//GEN-END:variables
}
