package sistemasop;

public class SistemasOP {

    public static void main(String[] args) {
        InterfaceG GUI = new InterfaceG();
        GUI.setVisible(true);
        
        //barraProgress bar = new barraProgress();
        //bar.setVisible(true);
        
        InterfaceEstudents GUIa = new InterfaceEstudents();
        GUIa.setVisible(true);
        
        InterfaceCursos GUIaa = new InterfaceCursos();
        GUIaa.setVisible(true);
        
        //jOptionPaneOk GUIOk = new jOptionPaneOk("Cuenta creada con éxito", "Exito");
        //GUIOk.setVisible(true);
        
        //jOptionPaneBat GUIBat = new jOptionPaneBat("El número de cédula no debe tener maximo 9 dijitos", "Error");
        //GUIBat.setVisible(true);
    }
    
}
