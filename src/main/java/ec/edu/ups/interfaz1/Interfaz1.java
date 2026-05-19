package ec.edu.ups.interfaz1;

import java.awt.*;
import packages.Window;
import packages.Mouse;
import packages.MouseAdap;
import packages.KeyAdd;
import packages.WindowLis;
import packages.InterrupcionesDeAccion;
import packages.InterrupcionesDeEnfoque;
import packages.InterrupcionesDeElemento;

public class Interfaz1 {
    public static void main(String[] args) {
        //Creacion con Frame
        Frame nuevaVentana1 = new Frame("Ventana 1");
        nuevaVentana1.setSize(600,400);
        nuevaVentana1.setVisible(false);
        
        //Creacion con constructor
        Window nuevaVentana2 = new Window("Ventana 2",600,400,414,515);
        nuevaVentana2.setVisible(false);
        
        //Botones
        Window nuevaVentana3 = new Window("Ventana 3",753,881,551,134);
        Button nuevoBoton1 = new Button("Nombre");
        nuevaVentana3.add(nuevoBoton1);
        nuevaVentana3.setVisible(false);
        
        //Paneles
        Window nuevaVentana4 = new Window("Ventana 4", 614,733,116,671);
        Panel nuevoPanel1  = new Panel();
        Button nuevoBoton2 = new Button("Boton Panel");
        nuevoPanel1.add(nuevoBoton2);
        nuevaVentana4.add(nuevoPanel1);
        nuevaVentana4.setVisible(false);
        
        //Layout
        Window nuevaVentana5 = new Window("Ventana 5",600,400,414,515);
        Panel nuevoPanel2 = new Panel(new FlowLayout(FlowLayout.LEFT));
        Button nuevoBoton3 = new Button("1");
        Button nuevoBoton4 = new Button("2");
        Button nuevoBoton5 = new Button("3");
        nuevoPanel2.add(nuevoBoton3);
        nuevoPanel2.add(nuevoBoton4);
        nuevoPanel2.add(nuevoBoton5);
        nuevaVentana5.add(nuevoPanel2);
        nuevaVentana5.setVisible(false);
        
        //BorderLayout 
        Window nuevaVentana6 = new Window("Ventana 6",600,400,414,515);
        Panel nuevoPanel3 = new Panel();
        Panel nuevoPanelGeneral = new Panel(new BorderLayout());
        
        Button nuevoBoton6 = new Button("6");
        Button nuevoBoton7 = new Button("7");
        Button nuevoBoton8 = new Button("8");
        Button nuevoBoton9 = new Button("9");
        Button nuevoBoton10 = new Button("10");
        Button nuevoBoton11 = new Button("11");
        Button nuevoBoton12 = new Button("12");
       
        nuevoPanel3.add(nuevoBoton6);
        nuevoPanel3.add(nuevoBoton7);
        nuevoPanel3.add(nuevoBoton8);
        
        
        nuevoPanelGeneral.add(nuevoPanel3,BorderLayout.NORTH);
        nuevoPanelGeneral.add(nuevoBoton9,BorderLayout.CENTER);
        nuevoPanelGeneral.add(nuevoBoton10,BorderLayout.EAST);
        nuevoPanelGeneral.add(nuevoBoton11,BorderLayout.WEST);
        nuevoPanelGeneral.add(nuevoBoton12,BorderLayout.SOUTH);
        
        nuevaVentana6.add(nuevoPanelGeneral);
        nuevaVentana6.setVisible(false);
        
        //GridLayout
        GridLayout esquema1 = new GridLayout(2, 3);
        
        Window nuevaVentana7 = new Window("Ventana 7",600,400,414,515);
        Panel nuevoPanel4 = new Panel();
        nuevoPanel4.setLayout(esquema1);
        
        Panel nuevoPanelGeneral2 = new Panel(new BorderLayout());
        
        Button nuevoBoton13 = new Button("13");
        Button nuevoBoton14 = new Button("14");
        Button nuevoBoton15 = new Button("15");
        Button nuevoBoton16 = new Button("16");
        Button nuevoBoton17 = new Button("17");
        Button nuevoBoton18 = new Button("18");
        Button nuevoBoton19 = new Button("19");
        Button nuevoBoton20 = new Button("20");
        Button nuevoBoton21 = new Button("21");
        Button nuevoBoton22 = new Button("22");
        
        nuevoPanel4.add(nuevoBoton13);
        nuevoPanel4.add(nuevoBoton14);
        nuevoPanel4.add(nuevoBoton15);
        nuevoPanel4.add(nuevoBoton16);
        nuevoPanel4.add(nuevoBoton17);
        nuevoPanel4.add(nuevoBoton18);
        
       nuevoPanelGeneral2.add(nuevoPanel4,BorderLayout.EAST);
       nuevoPanelGeneral2.add(nuevoBoton19,BorderLayout.NORTH);
       nuevoPanelGeneral2.add(nuevoBoton20,BorderLayout.WEST);
       nuevoPanelGeneral2.add(nuevoBoton21,BorderLayout.CENTER);
       nuevoPanelGeneral2.add(nuevoBoton22,BorderLayout.SOUTH);
       
       nuevaVentana7.add(nuevoPanelGeneral2);
       
       nuevaVentana7.setVisible(false);
       
       //Label
       Window nuevaVentana8 = new Window("Ventana 8",600,400,414,515);
       Label nuevoLabel = new Label("Mensaje",Label.CENTER);
       
       nuevaVentana8.add(nuevoLabel);
       
       nuevaVentana8.setVisible(false);
       
       //TextField
       Window nuevaVentana9 = new Window("Ventana 9",600,400,414,515);
       TextField nuevoTexto = new TextField(15);
       TextField nuevoTexto2 = new TextField(60);
       TextField nuevoTexto3 = new TextField("Española",15);
       
       GridLayout esquema2 = new GridLayout(3,1);
       Panel PanelGeneral2 = new Panel(new BorderLayout());
       Panel adicional = new Panel();
       Button boton1 = new Button("1");
       Button boton2 = new Button("2");
       Button boton3 = new Button("3");
       Button boton4 = new Button("4");

       adicional.setLayout(esquema2);
       adicional.add(nuevoTexto);
       adicional.add(nuevoTexto2);
       adicional.add(nuevoTexto3);
       PanelGeneral2.add(adicional,BorderLayout.SOUTH);
       
       PanelGeneral2.add(boton1,BorderLayout.CENTER);
       PanelGeneral2.add(boton2,BorderLayout.WEST);
       PanelGeneral2.add(boton3,BorderLayout.EAST);
       PanelGeneral2.add(boton4,BorderLayout.NORTH);
       
       nuevaVentana9.add(PanelGeneral2);
       nuevaVentana9.setVisible(false);
       
       //Eventos Mouse Listener
       
       Window nuevaVentana10 = new Window("Ventana 9",600,400,414,515);
       Panel botonPanel = new Panel();
       Button nuevaFuncion = new Button("Crear");
       Button nuevaFuncion1 = new Button("Salir");
       
       botonPanel.add(nuevaFuncion);
       botonPanel.add(nuevaFuncion1);
       
       nuevaFuncion.addMouseListener(new Mouse());
       nuevaFuncion.addMouseListener(new Mouse());
       
       nuevaVentana10.add(botonPanel);
       nuevaVentana10.setVisible(false);
       
       //Eventos Mouse Adapates
        int NUM_OPCIONES = 12;
        Label mensaje = new Label("Mensaje asociado al botón pulsado");
        Button[] botones = new Button[NUM_OPCIONES];
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i] = new Button("Opcion " + i);
            if (i < 10) {
            botones[i].setName("0" + i);
            } else {
            botones[i].setName(String.valueOf(i));
            }
        }
        Frame miVentana = new Frame("Prueba eventos de raton");
        Panel panelPrincipal = new Panel(new GridLayout(NUM_OPCIONES + 1, 1));
        panelPrincipal.add(mensaje);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            panelPrincipal.add(botones[i]);
        }
        miVentana.add(panelPrincipal);
        miVentana.setSize(400, 600);
        miVentana.setVisible(false);
        for (int i = 0; i < NUM_OPCIONES; i++) {
            botones[i].addMouseListener(new MouseAdap(mensaje));
        }
        
        //Key Adapter
        Window nuevaVentana11 = new Window("Ventana 10",600,400,414,515);
        Label mensaje1= new Label("Presione una tecla",Label.CENTER);
        Label mensaje2 = new Label("tecla presionada",Label.CENTER);
        
        nuevaVentana11.setLayout(new BorderLayout());
        
        Panel panelSuperior = new Panel();
        Panel panelInferior = new Panel();
        panelSuperior.add(mensaje1);
        panelInferior.add(mensaje2);
        
        KeyAdd detectorTeclado = new KeyAdd(mensaje2);
        nuevaVentana11.addKeyListener(detectorTeclado);
        
        nuevaVentana11.add(panelSuperior,BorderLayout.NORTH);
        nuevaVentana11.add(panelInferior,BorderLayout.CENTER);
        
        nuevaVentana11.setVisible(false);
        
        //Window Listener
        Frame miVentana3 = new Frame("Prueba eventos de ventana");
        miVentana3.setSize(200, 100);
        miVentana3.setVisible(false);
        Frame otraVentana = new Frame("Prueba eventos de ventana");
        otraVentana.setSize(100, 50);
        otraVentana.setLocation(200, 0);
        otraVentana.setVisible(false);
        miVentana3.addWindowListener(new WindowLis());
        otraVentana.addWindowListener(new WindowLis());
        
        // ACTION LISTENER
        Frame miVentana5 = new Frame("Prueba eventos de acción");
        Panel miPanel = new Panel(new GridLayout(3, 1));
        Button boton = new Button("Etiqueta del boton");
        TextField campoDeTexto = new TextField("Texto del campo 8");
        List lista = new List(3);
        lista.add("Opcion 1 de la lista");
        lista.add("Opcion 2 de la lista");
        lista.add("Opcion 3 de la lista");
        lista.add("Opcion 4 de la lista");
        miPanel.add(boton);
        miPanel.add(campoDeTexto);
        miPanel.add(lista);
        boton.addActionListener(new InterrupcionesDeAccion());
        campoDeTexto.addActionListener(new InterrupcionesDeAccion());
        lista.addActionListener(new InterrupcionesDeAccion());
        miVentana5.add(miPanel);
        miVentana5.setSize(400, 200);
        miVentana5.addWindowListener(new WindowLis());
        miVentana5.setVisible(false);
        
        //FocusListener
        Frame miVentana6 = new Frame("Prueba eventos de enfoque");
        Panel miPanel2 = new Panel();
        Button boton6 = new Button("Componente 1");
        Button boton5 = new Button("Componente 2");
        miPanel2.add(boton6);
        miPanel2.add(boton5);
        miVentana6.add(miPanel2);
        miVentana6.setSize(300, 200);
        miVentana6.setVisible(false);
        boton5.addFocusListener(new InterrupcionesDeEnfoque());
        miVentana6.addWindowListener(new WindowLis());
        
        //ITEM LISTENER
        Frame miVentana0 = new Frame("Prueba eventos de elemento");
        Panel miPanel0 = new Panel(new GridLayout(4, 1));
        Checkbox diesel = new Checkbox("Diesel", true);
        Checkbox farosXenon = new Checkbox("Faros de Xenon", false);
        Checkbox llantasAleacion = new Checkbox("Llantas de aleacion", false);
        Checkbox pinturaMetalizada = new Checkbox("Pintura Metalizada", true);
        miPanel0.add(diesel);
        miPanel0.add(farosXenon);
        miPanel0.add(llantasAleacion);
        miPanel0.add(pinturaMetalizada);
        diesel.addItemListener(new InterrupcionesDeElemento());
        farosXenon.addItemListener(new InterrupcionesDeElemento());
        llantasAleacion.addItemListener(new InterrupcionesDeElemento());
        pinturaMetalizada.addItemListener(new InterrupcionesDeElemento());
        miVentana0.add(miPanel0);
        miVentana0.setSize(400, 200);
        miVentana0.addWindowListener(new WindowLis());
        miVentana0.setVisible(false);    
       
        //Ejercicio 1
        Window ejercicio = new Window("Ejercicio 1",600,400,414,515);
        Panel panelEjercicio = new Panel(new BorderLayout());
        Panel panelText = new Panel();
        Panel panelTextCheck = new Panel();
        Panel panelButton = new Panel();
        
        GridLayout esquema = new GridLayout(3,2);
        GridLayout esquema3 = new GridLayout(2,2);
        GridLayout esquema4 = new GridLayout(1,2);
        panelText.setLayout(esquema);
        panelTextCheck.setLayout(esquema3);
        panelButton.setLayout(esquema4);
        
        //LABELS Y TEXTFIELD
        Label label1 = new Label("Label 1: ");
        Label label2 = new Label("Label 2: ");
        Label label3 = new Label("Label 3: ");
        TextField text1 = new TextField(15);
        TextField text2 = new TextField(15);
        TextField text3 = new TextField(15);
        
        //CHECKBOX
        Checkbox checkBox1 = new Checkbox("Checkbox 1",false);
        Checkbox checkBox2 = new Checkbox("Checkbox 2",false);
        Checkbox checkBox3 = new Checkbox("Checkbox 3",false);
        Checkbox checkBox4 = new Checkbox("Checkbox 4",false);
        
        //Button
        Button boton11 = new Button("Button 1");
        Button boton22 = new Button("Button 2");
        
        
        //Panel de label y text
        panelText.add(label1);
        panelText.add(text1);
        panelText.add(label2);
        panelText.add(text2);
        panelText.add(label3);
        panelText.add(text3);
        
        //CheckBox Panel
        panelTextCheck.add(checkBox1);
        panelTextCheck.add(checkBox2);
        panelTextCheck.add(checkBox3);
        panelTextCheck.add(checkBox4);
        
        //Button panel
        panelButton.add(boton11);
        panelButton.add(boton22);

        
        
        //añadir paneles
        panelEjercicio.add(panelText,BorderLayout.NORTH);
        panelEjercicio.add(panelTextCheck, BorderLayout.CENTER);
        panelEjercicio.add(panelButton, BorderLayout.SOUTH);
        
        //Botones Window
        ejercicio.addWindowListener(new WindowLis());
        
        ejercicio.add(panelEjercicio);
        
        ejercicio.setVisible(true);
        
        
    }
}
