import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class P2RepetidorFrame extends JFrame {
    private int repeticiones;
    public P2RepetidorFrame() throws HeadlessException {
        repeticiones = 2;

        setTitle("2 repeticiones");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel pnlBotones = new JPanel(new FlowLayout());
        JButton btnMenos = new JButton("-1");
        btnMenos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repeticiones--;
                setTitle( repeticiones +  " repeticiones");
                if(repeticiones == 2 ){
                    btnMenos.setEnabled(false);
                }
            }
        });


        JButton btnMas = new JButton("+1");
        btnMas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                repeticiones++;
                setTitle( repeticiones +  " repeticiones");
                if(repeticiones == 5 ){
                    btnMas.setEnabled(false);
                }
            }
        });



        pnlBotones.add(btnMenos);
        pnlBotones.add(btnMas);
        add(pnlBotones, BorderLayout.PAGE_START);

        JPanel pnlCentral = new JPanel(new GridLayout(2, 2));
        pnlCentral.setBorder(new EmptyBorder(10, 10, 10, 10));
        pnlCentral.add(new JLabel("Entrada:", SwingConstants.RIGHT));
        JTextField txtEntrada = new JTextField(20);


        pnlCentral.add(txtEntrada);
        pnlCentral.add(new JLabel("Salida:", SwingConstants.RIGHT));
        JTextField txtSalida = new JTextField(20);
        pnlCentral.add(txtSalida);
        add(pnlCentral, BorderLayout.CENTER);
        txtEntrada.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String textoFinal="";
                String texto=txtEntrada.getText();
                char c;
                for (int i = 0; i < texto.length(); i++) {
                     c = texto.charAt(i);
                    for (int j = 0; i < repeticiones; j++) {
                        textoFinal=textoFinal + c;
                    }
                }

                txtSalida.setText(textoFinal);
            }
        });

        setVisible(true);
    }
}
