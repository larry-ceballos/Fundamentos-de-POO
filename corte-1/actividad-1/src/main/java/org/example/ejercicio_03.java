package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ejercicio_03 extends JDialog {
    private JPanel contentPane;
    private JLabel etiResultado;
    private JList lstColores;

    public ejercicio_03() {
        setContentPane(contentPane);
        setModal(true);
        lstColores.addMouseListener(new MouseAdapter() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void mouseClicked(MouseEvent e) {
                String mensaje;
                if (lstColores.getSelectedIndex() == -1) {
                    mensaje = "No hay un color seleccionado.";
                } else {
                    mensaje = "El color seleccionado es: " + lstColores.getSelectedValue().toString();
                }

                etiResultado.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_03 dialog = new ejercicio_03();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

}
