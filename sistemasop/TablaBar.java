package sistemasop;

import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class TablaBar extends JTable {
    
    public void personalizarBarraDesplazamiento(JScrollPane scrollPane) {
        scrollPane.getVerticalScrollBar().setBackground(new Color(36,39,46));
        scrollPane.getHorizontalScrollBar().setBackground(new Color(36,39,46));
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new CustomScrollBarUI());
    }

    static class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            thumbColor = new Color(52,53,65);
            thumbDarkShadowColor = new Color(36,39,46);
            thumbHighlightColor = new Color(36,39,46);
            thumbLightShadowColor = new Color(36,39,46);
        }
        
        @Override
        protected JButton createDecreaseButton(int orientation) {
            JButton button = super.createDecreaseButton(orientation);
            button.setBackground(new Color(127,63,69));
            button.setBorder(BorderFactory.createLineBorder(new Color(127,63,69)));
            return button;
        }
            
        @Override
        protected JButton createIncreaseButton(int orientation) {
            JButton button = super.createIncreaseButton(orientation);
            button.setBackground(new Color(127,63,69));
            button.setBorder(BorderFactory.createLineBorder(new Color(127,63,69)));
            return button;
        }    
    }
}
