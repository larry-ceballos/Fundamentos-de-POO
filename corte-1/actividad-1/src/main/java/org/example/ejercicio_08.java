package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ejercicio_08 extends JDialog {
    private JPanel contentPane;
    private JSlider slDeslizador;
    private JLabel etiResultado;

    public ejercicio_08() {
        setContentPane(contentPane);
        setModal(true);
        slDeslizador.addChangeListener(new ChangeListener() {
            /**
             * @param e a ChangeEvent object
             */
            @Override
            public void stateChanged(ChangeEvent e) {
                etiResultado.setText("El valor del slider es: " + slDeslizador.getValue());
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_08 dialog = new ejercicio_08();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
