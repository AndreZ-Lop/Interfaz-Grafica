package packages;

import java.awt.event.*;
import java.awt.*;

public class MouseAdap extends MouseAdapter {
    
    private Label mensaje;
    
    public MouseAdap(Label mensaje){
        this.mensaje = mensaje;
    }
    
   @Override
   public void mouseClicked(MouseEvent evento){
       Component componente = (Component)evento.getSource();
       String nombre = componente.getName();
       String opcion = nombre.substring(nombre.length()-2,nombre.length());
       mensaje.setBackground(Color.red);
       mensaje.setText(opcion);
   }
   @Override
   public void mouseEntered(MouseEvent evento){
       Component componente = (Component)evento.getSource();
       componente.setBackground(Color.blue);
   }
   
   @Override
   public void mouseExited(MouseEvent evento){
       Component componente = (Component)evento.getSource();
       componente.setBackground(Color.white);
   }
}
