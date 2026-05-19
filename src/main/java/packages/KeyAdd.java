package packages;
import java.awt.event.*;
import java.awt.*;
public class KeyAdd extends KeyAdapter {
    private Label mensaje;
    
    public KeyAdd(Label mensaje){
        this.mensaje=mensaje;
    }
    @Override
    public void keyTyped(KeyEvent e){
        mensaje.setText(e.getKeyChar() + "");
        if(e.getKeyChar() == '*')
            System.exit(0);
    }
}
