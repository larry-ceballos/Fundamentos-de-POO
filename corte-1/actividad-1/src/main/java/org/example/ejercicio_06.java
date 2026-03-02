package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ejercicio_06 extends JDialog {
    private JPanel contentPane;
    private JComboBox cboNumeros;
    private JButton btnPares;
    private JButton btnImpares;
    private JLabel etiResultado;
    private JButton btnVaciar;

    public ejercicio_06() {
        setContentPane(contentPane);
        setModal(true);
        btnPares.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel<Object> modelo = new DefaultComboBoxModel<>();
                for (int i=0;i<10;i+=2) {
                    modelo.addElement("Nº "+i);
                }
                cboNumeros.setModel(modelo);
            }
        });

        btnImpares.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel<Object> modelo = new DefaultComboBoxModel<>();
                for (int i=1;i<10;i+=2) {
                    modelo.addElement("Nº "+i);
                }
                cboNumeros.setModel(modelo);
            }
        });

        btnVaciar.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                DefaultComboBoxModel<Object> modelo = new DefaultComboBoxModel<>();
                cboNumeros.setModel(modelo);
            }
        });

        cboNumeros.addActionListener(new ActionListener() {
            /**
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String mensaje = "El numero seleccionado es: ";

                if(cboNumeros.getSelectedIndex() != -1){
                    etiResultado.setText(mensaje + cboNumeros.getSelectedItem());
                }
            }
        });
    }

    public static void main(String[] args) {
        ejercicio_06 dialog = new ejercicio_06();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
