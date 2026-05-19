
package packages;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.*;
public class BotonSalida extends MouseAdapter{
    @Override
    public void mouseClicked(MouseEvent e){
        System.exit(0);
    }
    
    @Override
    public void mouseEntered(MouseEvent e){
        Component componente = (Component)e.getSource();
        componente.setBackground(Color.red);
        
    }
    @Override
    public void mouseExited(MouseEvent e){
        Component componente = (Component)e.getSource();
        componente.setBackground(Color.CYAN);
    }
}   
