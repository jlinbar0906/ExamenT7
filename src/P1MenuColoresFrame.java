import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class P1MenuColoresFrame {
    public static void main(String[] args) {
        JFrame ventana= new JFrame("P1MenuColoresFrame");
        JMenuBar menuBar = new JMenuBar();
        JMenu menuColores= new JMenu("Colores");
        JMenuItem menuRojo= new JMenuItem("Rojo");
        JMenuItem menuVerde= new JMenuItem("Verde");
        JMenuItem menuAzul= new JMenuItem("Azul");
        JMenuItem menuSalir= new JMenuItem("Salir");

        menuSalir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);;
            }
        });
        JPanel pn1= new JPanel();
        ventana.add(pn1);
        menuRojo.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.RED);
            }
        });
        menuVerde.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.green);
            }
        });
        menuAzul.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                pn1.setBackground(Color.BLUE);
            }
        });

        menuColores.add(menuRojo);
        menuColores.add(menuVerde);
        menuColores.add(menuAzul);
        menuColores.addSeparator();
        menuColores.add(menuSalir);
        menuBar.add(menuColores);


        ventana.setJMenuBar(menuBar);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(640,480);
        ventana.setVisible(true);
    }
}
