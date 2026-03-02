package org.example;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class ejercicio_04 extends JDialog {
    private JPanel contentPane;
    private JComboBox cboColores;
    private JLabel etiResultado;

    public ejercicio_04() {
        setContentPane(contentPane);
        setModal(true);
        cboColores.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "El color elegido es: ";
                mensaje = mensaje + Objects.requireNonNull(cboColores.getSelectedItem());
                etiResultado.setText(mensaje);
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_04 dialog = new ejercicio_04();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }


}
