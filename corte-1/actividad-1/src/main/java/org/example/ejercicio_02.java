package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_02 extends JDialog {
    private JPanel contentPane;
    private JLabel etiResultado;
    private JButton btnAceptar;
    private JRadioButton optRojo;
    private JRadioButton optVerde;
    private JRadioButton optAzul;
    private JButton buttonOK;

    public ejercicio_02() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        optRojo.setSelected(true);
        btnAceptar.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje="Color elegido: ";


                if (optRojo.isSelected()) {
                    mensaje=mensaje+"Rojo";
                } else if (optVerde.isSelected()) {
                    mensaje=mensaje+"Verde";
                } else if (optAzul.isSelected()) {
                    mensaje=mensaje+"Azul";
                }

                etiResultado.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_02 dialog = new ejercicio_02();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
