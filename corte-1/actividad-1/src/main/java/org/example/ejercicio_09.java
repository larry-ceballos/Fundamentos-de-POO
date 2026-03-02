package org.example;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ejercicio_09 extends JDialog {
    private JPanel contentPane;
    private JSpinner spiValor;
    private JLabel etiResultado;

    public ejercicio_09() {
        setContentPane(contentPane);
        setModal(true);

        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(2);
        spiValor.setModel(nm);
        spiValor.setValue(4);

        spiValor.addChangeListener(new ChangeListener() {
            /**
             * @param e a ChangeEvent object
             */
            @Override
            public void stateChanged(ChangeEvent e) {
                etiResultado.setText("El valor del spinner es de: " + spiValor.getValue());
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_09 dialog = new ejercicio_09();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
