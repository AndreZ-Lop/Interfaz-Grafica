package packages;
import java.awt.*;
public class Window extends Frame{
    public Window(){
        
    }
    public Window(String nombre, int ancho,int largo,int posX,int posY){
        this.setTitle(nombre);
        this.setSize(ancho,largo);
        this.setLocation(posX, posY);
    }
}
