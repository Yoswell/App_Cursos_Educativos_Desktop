package sistemasop;

public class DatosDEstudiante {
    
    public Metodos mostrar = new Metodos();
    
    private String cedula, telefono;
    private String nombre, pApellido, sApellido, fechaN, email, password;
    public Cursos[] cursos;

    public void DatosDEstudiante(String Cedula, String Telefono, String Nombre, String PApellido, String SApellido, String FechaN, String Email, String Password) {
        cedula = Cedula;
        telefono = Telefono;
        nombre = Nombre;
        pApellido = PApellido;
        sApellido = SApellido;
        fechaN = FechaN;
        email = Email;
        password = Password;
        cursos = null;
    }
    
    public void asignarCursos(Cursos curso) {
        if (cursos == null) {
            cursos = new Cursos[1];
            cursos[0] = curso;
        } else if (cursos.length < 3) {
            Cursos[] nuevosCursos = new Cursos[cursos.length + 1];
            System.arraycopy(cursos, 0, nuevosCursos, 0, cursos.length);
            nuevosCursos[cursos.length] = curso;
            cursos = nuevosCursos;
        } else {
            mostrar.limiteDCursos();
        }
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getpApellido() {
        return pApellido;
    }

    public void setpApellido(String pApellido) {
        this.pApellido = pApellido;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getFechaN() {
        return fechaN;
    }

    public void setFechaN(String fechaN) {
        this.fechaN = fechaN;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cursos[] getCursos() {
        return cursos;
    }

    public void setCursos(Cursos[] cursos) {
        this.cursos = cursos;
    }
    
}
