package org.example;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ejercicio_10 extends JDialog {
    private JPanel contentPane;
    private JScrollBar desValor;
    private JLabel etiResultado;

    public ejercicio_10() {
        setContentPane(contentPane);
        setModal(true);
        String mensaje = "El valor del scroll es de :";
        etiResultado.setText(mensaje + desValor.getValue());

        desValor.addAdjustmentListener(new AdjustmentListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                etiResultado.setText(mensaje + desValor.getValue());
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_10 dialog = new ejercicio_10();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
