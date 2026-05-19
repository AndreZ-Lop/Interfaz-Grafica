package packages;
import java.awt.event.*;
import java.awt.Color;
public class Mouse implements MouseListener{
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
       System.out.println("Pres");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Rel");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        e.getComponent().setBackground(Color.blue);
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        e.getComponent().setBackground(Color.red);
    }
    
    
}
