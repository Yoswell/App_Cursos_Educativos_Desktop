package sistemasop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import static sistemasop.InterfaceG.url;

public class Metodos {
    
    public void mostrarPaneles(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5) {
        panel1.setVisible(false);
        panel2. setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(true);
    }
    
    public void vaciarRows(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    public void ocultarComponentes(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
    }
    
    public void mostrarBotones(JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
    }
    
    public class Conexion_Principal {
        public static ArrayList<Object[]> getConexionEstudiantes(String consulta) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";
            Connection sql = DriverManager.getConnection(url);
            
            ArrayList<Object[]> lista = new ArrayList<>();
            Statement query = sql.createStatement();
            ResultSet resultado = query.executeQuery(consulta);
            
            while (resultado.next()) {
                int id = resultado.getInt("ID");
                String correo = resultado.getString("Correo");
                
                Object[] x = new Object[2];
                x[0] = id;
                x[1] = correo;
                lista.add(x);
            }
            
            sql.close();
            
            return lista;
        }
    }
    
    public class Conexion_Ingresar_Estudiantes {
        public static void setConexionEstudiantes(String nombre, String pApellido, String sApellido, String fechaN, String correo, String telefono, String cursos, String password, String cedula) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                
            String consulta = "INSERT INTO cursos (Nombre, Primer_Apellido, Segundo_Apellido, Fecha_de_nacimiento, Correo, Telefono, Passwords, Cursos, Cedula) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertar = sql.prepareStatement(consulta);
            
            try (insertar) {
                insertar.setString(1, nombre);
                insertar.setString(2, pApellido);
                insertar.setString(3, sApellido);
                insertar.setString(4, fechaN);
                insertar.setString(5, correo);
                insertar.setString(6, telefono);
                insertar.setString(7, password);
                insertar.setString(8, cursos);
                insertar.setString(9, cedula);
                
                insertar.executeUpdate();
            } catch (SQLException e) { }
            
            sql.close();
        }
    }
    
    public class Conexion_Eliminar_Estudiantes {
        public static void setConexionEstudiantes(String consulta) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                
            PreparedStatement eliminar = sql.prepareStatement(consulta);
            
            try (eliminar) {
                eliminar.executeUpdate();
            } catch (SQLException e) { }
            
            sql.close();
        }
    }
    
    public class Conexion_AsignarCursos_Estudiante {
        public static void setConexionEstudiantes(String consulta, String newCurso, String cedula) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                  
            Statement query = sql.createStatement();
            ResultSet resultado = query.executeQuery(consulta);

            String newCursos = "";
            
            while (resultado.next()) {
                String curso = resultado.getString("Cursos");
                newCursos = "" + curso + ", " + newCurso + "";
            }  
            
            String consulta_Update = "UPDATE estudiantes SET Cursos= ? WHERE Cedula='" + cedula + "'";
            PreparedStatement insertar = sql.prepareStatement(consulta_Update);

            try (insertar) {
                insertar.setString(0, newCursos);
            } catch (SQLException e) { }
            
            sql.close();
        }
    }
    
    public class Conexion_Buscar_Estudiantes {
        public static ArrayList<Object[]> getConexionEstudiantes(String consulta) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                
            ArrayList<Object[]> lista = new ArrayList<>();  
            Statement query = sql.createStatement();
            ResultSet resultado = query.executeQuery(consulta);

            while (resultado.next()) {
                String nombre = resultado.getString("Nombre");
                String pApellido = resultado.getString("Primer_Apellido");
                String sApellido = resultado.getString("Segundo_Apellido");
                String fechaN = resultado.getString("Fecha_de_nacimiento");
                String correo = resultado.getString("Correo");
                long Telefono = resultado.getLong("Telefono");
                String password = resultado.getString("Passwords");
                String cursos = resultado.getString("Cursos");
                long cedula = resultado.getLong("Cedula");
                
                Object[] x = new  Object[9];
                x[0] = nombre;
                x[1] = pApellido;
                x[2] = sApellido;
                x[3] = fechaN;
                x[4] = correo;
                x[5] = Telefono;
                x[6] = password;
                x[7] = cursos;
                x[8] = cedula;
                
                lista.add(x);
            }    
            
            sql.close();
            
            return lista;
        }
    }
    
    public class Conexion_Ingresar_Cursos {
        public static void setConexionCursos(String codigo, String nombre) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                
            String consulta = "INSERT INTO cursos (Codigo, Nombre) VALUES (?, ?)";
            PreparedStatement insertar = sql.prepareStatement(consulta);
            
            try (insertar) {
                insertar.setString(1, codigo);
                insertar.setString(2, nombre);
                insertar.executeUpdate();
            } catch (SQLException e) { }
            
            sql.close();
        }
    }
    
    public class Conexion_Eliminar_Cursos {
        public static void setConexionCursos(String consulta) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
            
            PreparedStatement eliminar = sql.prepareStatement(consulta);
            
            try (eliminar) {
                eliminar.executeUpdate();
            } catch (SQLException e) { }
            
            sql.close();
        }
    }
    
    public class Conexion_Buscar_Cursos {
        public static ArrayList<Object[]> getConexionCursos(String consulta) throws SQLException, ClassNotFoundException {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            url = "jdbc:sqlserver://DESKTOP-T5BBINC\\localhost:1433;" + "databaseName=estudiantesdb;" + "user=admin;" + "password=admin123;" + "encrypt=true;" + "trustServerCertificate=true;";   
            Connection sql = DriverManager.getConnection(url);
                
            ArrayList<Object[]> lista = new ArrayList<>();
            Statement query = sql.createStatement();
            ResultSet resultado = query.executeQuery(consulta);

            while (resultado.next()) {
                String codigo = resultado.getString("Codigo");
                String nombre = resultado.getString("Nombre");
                
                Object[] x = new  Object[2];
                x[0] = codigo;
                x[1] = nombre;
                
                lista.add(x);
            }    
            
            sql.close();
            
            return lista;
        }
    }
    
    public void habilitarOptions(int ok, JButton button1, JButton button2, JButton button3, JButton button4, JButton button5, JButton button6) {
        switch (ok) {
            case 0:
                button1.setEnabled(false);
                button2.setEnabled(false);
                button3.setEnabled(false);
                button4.setEnabled(false);
                button5.setEnabled(false);
                button6.setEnabled(false);
            break;
            case 1:
                button1.setEnabled(false);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
            break;
            case 2:
                button1.setEnabled(true);
                button2.setEnabled(true);
                button3.setEnabled(true);
                button4.setEnabled(true);
                button5.setEnabled(true);
                button6.setEnabled(true);
            break;
        }
    }
    
    public void ok(String sms, String info) {
        jOptionPaneOk GUIOk = new jOptionPaneOk(sms, info);
        GUIOk.setVisible(true);
    }
    
    public void bat(String sms, String info) {
        jOptionPaneBat GUIbBat = new jOptionPaneBat(sms, info);
        GUIbBat.setVisible(true);
    }
    
    
    public void rellenarCampos() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Por favor rellene todos los campos", "Error");
        GUIBat.setVisible(true);
    }
    
    public void passwordInvalid() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Contraseña inválida, esta debe de ser compleja", "Error");
        GUIBat.setVisible(true);
    }
    
    public void emailInvalid() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Correo electrónico inválido", "Error");
        GUIBat.setVisible(true);
    }
    
    public void limiteDCursos() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Limite maximo de cursos, maximo 3", "Error");
        GUIBat.setVisible(true);
    }
    
    public void cursoSinRegistrar() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Curso no registrado en el sistema", "Error");
        GUIBat.setVisible(true);
    }
    
    public void inicioDSesion() {
        jOptionPaneOk GUIOk = new jOptionPaneOk("Inicio de sesión exitosos", "Error");
        GUIOk.setVisible(true);
    }
    
    public void fechaNInvalid() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("Fecha de nacimiento invalida, dd/mm/yyyy", "Error");
        GUIBat.setVisible(true);
    }
    
    public void datosNoigualesID() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("El ID o el correo no existe", "Error");
        GUIBat.setVisible(true);
    }
    
    public void cedulaInvalid() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("El número de cédula no debe tener maximo 9 dijitos", "Error");
        GUIBat.setVisible(true);
    }
    
    public void telefonoInvalid() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("El número debe tener maximo 8 dijitos", "Error");
        GUIBat.setVisible(true);
    }
    
    public void codigoExtenso() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("El codigo debe tener maximo 7 dijitos", "Error");
        GUIBat.setVisible(true);
    }
    
    public void cursoExiste() {
        jOptionPaneBat GUIBat = new jOptionPaneBat("El curso ya a sido registrado", "Error");
        GUIBat.setVisible(true);
    }
}
