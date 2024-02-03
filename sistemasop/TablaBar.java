package sistemasop;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class TablaBar extends JTable {

    public void personalizarBarraDesplazamiento(JScrollPane scrollPane) {
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scrollPane.getVerticalScrollBar().setBackground(new Color(36, 39, 46));
        scrollPane.getHorizontalScrollBar().setBackground(new Color(36, 39, 46));
        scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        scrollPane.getHorizontalScrollBar().setUI(new CustomScrollBarUI());
        
        scrollPane.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
                int notches = e.getWheelRotation();
                verticalScrollBar.setValue(verticalScrollBar.getValue() + (notches * 50));
            }
        });
        
        scrollPane.addMouseWheelListener(new MouseWheelListener() {
            @Override
            public void mouseWheelMoved(MouseWheelEvent e) {
                JScrollBar horizontalScrollBar = scrollPane.getHorizontalScrollBar();
                horizontalScrollBar.setValue(horizontalScrollBar.getValue() * 0);
            }
        });
    }

    static class CustomScrollBarUI extends BasicScrollBarUI {
        @Override
        protected void configureScrollBarColors() {
            thumbColor = new Color(52, 53, 65);
        }

        @Override
        protected JButton createDecreaseButton(int orientation) {
            JButton button = super.createDecreaseButton(orientation);
            button.setBackground(new Color(36, 39, 46));
            button.setBorder(BorderFactory.createLineBorder(new Color(36, 39, 46)));
            return button;
        }

        @Override
        protected JButton createIncreaseButton(int orientation) {
            JButton button = super.createIncreaseButton(orientation);
            button.setBackground(new Color(36, 39, 46));
            button.setBorder(BorderFactory.createLineBorder(new Color(36, 39, 46)));
            return button;
        }

        @Override
        protected void paintThumb(Graphics g, JComponent c, Rectangle thumbBounds) {
            if (thumbBounds.isEmpty() || !scrollbar.isEnabled()) {
                return;
            }

            Graphics2D g2d = (Graphics2D) g.create();
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2d.setColor(thumbColor);
            g2d.fillRect(thumbBounds.x, thumbBounds.y, thumbBounds.width, thumbBounds.height);

            g2d.setColor(thumbDarkShadowColor);
            g2d.drawRect(thumbBounds.x, thumbBounds.y, thumbBounds.width - 1, thumbBounds.height - 1);

            g2d.setColor(thumbLightShadowColor);
            g2d.drawLine(thumbBounds.x + 1, thumbBounds.y + thumbBounds.height - 1, thumbBounds.x + thumbBounds.width - 1, thumbBounds.y + thumbBounds.height - 1);

            g2d.dispose();
        }

        @Override
        protected Dimension getMinimumThumbSize() {
            return new Dimension(5, 20);
        }

        @Override
        protected Dimension getMaximumThumbSize() {
            return new Dimension(20, 20);
        }
    }
}
