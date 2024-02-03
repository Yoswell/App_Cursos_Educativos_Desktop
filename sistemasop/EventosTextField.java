package sistemasop;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class EventosTextField extends  KeyAdapter {
    
    @Override
    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!Character.isDigit(c)) {
            e.consume();
        }
    }
    
}
