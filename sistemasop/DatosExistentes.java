package sistemasop;

import java.util.List;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DatosExistentes {
    
    private List<String> datosRegistrados;

    public DatosExistentes() {
        datosRegistrados = new ArrayList<>();
        cargarDatosRegistrados();
    }

    public void cargarDatosRegistrados() {
        String rutaArchivo = System.getProperty("user.dir") + File.separator + "datos.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                datosRegistrados.add(linea);
            }
        } catch (IOException e) { }
    }

    public boolean buscarIdExistente(int id) {
        for (String datos : datosRegistrados) {
            String[] partes = datos.split("\\|");
            if (partes.length > 0 && Integer.parseInt(partes[0]) == id) {
                return true;
            }
        }
        return false;
    }

    public boolean buscarEmailExistente(String email) {
        for (String datos : datosRegistrados) {
            String[] partes = datos.split("\\|");
            if (partes.length > 1 && partes[1].equals(email)) {
                return true;
            }
        }
        return false;
    }
    
}
