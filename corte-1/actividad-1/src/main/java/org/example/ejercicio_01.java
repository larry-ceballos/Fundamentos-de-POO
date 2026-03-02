package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_01 extends JDialog {
    private JPanel contentPane;
    private JButton btnAceptar;
    private JCheckBox chkGato;
    private JCheckBox chkPerro;
    private JLabel etiResultado;
    private JCheckBox chkRaton;


    public ejercicio_01() {
        setContentPane(contentPane);
        setModal(true);
        btnAceptar.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "Animales elegidos: ";
                if (chkPerro.isSelected()) {
                    mensaje = mensaje + "Perro ";
                }
                if (chkGato.isSelected()) {
                    mensaje = mensaje + "Gato ";
                }
                if (chkRaton.isSelected()) {
                    mensaje = mensaje + "Raton ";
                }
                etiResultado.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_01 dialog = new ejercicio_01();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
