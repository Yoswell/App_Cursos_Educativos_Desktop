package sistemasop;

public class Cursos {
    
    public String codigoCursos;
    public String nombreCursos;
 
    public void Cursos(String Codigo, String Nombre) {
        codigoCursos = Codigo;
        nombreCursos = Nombre;
    }

    public String getCodigoCursos() {
        return codigoCursos;
    }

    public String getNombreCursos() {
        return nombreCursos;
    }
    
}
