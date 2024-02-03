package sistemasop;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

class headerGrid extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component c = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, new Color(153,153,153)));
        setForeground(new Color(204,204,204));
        setBackground(new Color(74,76,89));

        return c;
    }
}
