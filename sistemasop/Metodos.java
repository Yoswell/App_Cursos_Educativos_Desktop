package sistemasop;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Metodos {
    
    public String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(password.getBytes());
            byte[] bytes = md.digest();
            StringBuilder builder = new StringBuilder();

            for (byte b : bytes) {
                builder.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }

            return builder.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error en el hashing de la contraseña: " + e.getMessage());
        }
    }
    
    public void mostrarPaneles(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5, JPanel panel6) {
        panel1.setVisible(false);
        panel2. setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        panel6.setVisible(true);
    }
    
    public void vaciarRows(DefaultTableModel modelo) {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
    }
    
    public void ocultarComponentes(JPanel panel1, JPanel panel2, JPanel panel3, JPanel panel4, JPanel panel5, JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        panel1.setVisible(false);
        panel2.setVisible(false);
        panel3.setVisible(false);
        panel4.setVisible(false);
        panel5.setVisible(false);
        
        btn1.setVisible(false);
        btn2.setVisible(false);
        btn3.setVisible(false);
        btn4.setVisible(false);
    }
    
    public void mostrarBotones(JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
        btn1.setVisible(true);
        btn2.setVisible(true);
        btn3.setVisible(true);
        btn4.setVisible(true);
    }
    
    public void rellenarCampos() {
        JOptionPane.showMessageDialog(null, "Por favor rellene todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void passwordInvalid() {
        JOptionPane.showMessageDialog(null, "Contraseña inválida, la contraseña debe de tener una letra en mayuscula una letra en minuscula y al menos un caracter especial", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void emailInvalid() {
        JOptionPane.showMessageDialog(null, "Correo electrónico inválido", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void limiteDCursos() {
        JOptionPane.showMessageDialog(null, "El estudiante a alcanzado el limite maximo de cursos el cúal son 3", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cursoSinRegistrar() {
        JOptionPane.showMessageDialog(null, "Este curso no esta registrado, puede que el nombre o el código del curso este mal escrito", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void inicioDSesion() {
        JOptionPane.showMessageDialog(null, "Inicio de sesió exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void fechaNInvalid() {
        JOptionPane.showMessageDialog(null, "Fecha de nacimiento invalida, por favor en formato dd/mm/yyyy", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void datosNoigualesID() {
        JOptionPane.showMessageDialog(null, "El ID no corresponden a ningun ID de una cuenta ya creada", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void datosNoigualesEmail() {
        JOptionPane.showMessageDialog(null, "El correo electronico no corresponden a ningún correo de una cuenta ya creada", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void estudiantesIguales() {
        JOptionPane.showMessageDialog(null, "Este estudiente ya existe, cada persona posee un numero de identificación unico (cédula)", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void registroEstudianteExitoso() {
        JOptionPane.showMessageDialog(null, "Registro de estudiante exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void registroCursoExitoso() {
        JOptionPane.showMessageDialog(null, "Registro del curso exitoso", "Éxito", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void cedulaInvalid() {
        JOptionPane.showMessageDialog(null, "El número de cédula no debe de sobrepasar los 9 dijitos, maximo 9 incluyendo ceros [0 0000 0000]", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void telefonoInvalid() {
        JOptionPane.showMessageDialog(null, "El número de teléfono no debe de sobrepasar los 8 dijitos, [00-00-00-00]", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void codigoExtenso() {
        JOptionPane.showMessageDialog(null, "El codigo del curso es muy extenso, debe tener maximo 7 dijitos, [00-00-00-0]", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void cursoExiste() {
        JOptionPane.showMessageDialog(null, "El curso que desea registrar ya esta registrado en el sistema", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
