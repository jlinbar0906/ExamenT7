import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P3TresEnRayaFrame extends JFrame {
    boolean turnojugador=false;
    public P3TresEnRayaFrame() throws HeadlessException {
        setSize(500,500);
        setTitle("P3TresEnRayaFrame");
        setLayout( new BorderLayout());

        JPanel panelInferior = new JPanel();
        JLabel turno=new JLabel("Turno del jugador X");

        JPanel panelCentral = new JPanel(new GridLayout(3,3));
        for (int i=1; i<10; i++) {
            JButton b= new JButton(String.valueOf(i));
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if (!turnojugador) {
                        b.setText("X");
                        turno.setText("Turno de jugador 0");
                        turnojugador=true;
                    }else{
                        b.setText("O");
                        turno.setText("Turno de jugador X");
                        turnojugador=false;
                    }
                        b.setEnabled(false);

                }
            });
            add(panelCentral, BorderLayout.CENTER);
            b.setFont(b.getFont().deriveFont(30.0f));
            panelCentral.add(b);
        }

        turno.setFont(turno.getFont().deriveFont(15.0f));
        panelInferior.add(turno);
        add(panelInferior, BorderLayout.PAGE_END);


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

    }
}
